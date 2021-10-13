package by.goncharov.task08.controller;

import by.goncharov.task08.parser.AbstractFlowerParser;
import by.goncharov.task08.parser.ParserException;
import by.goncharov.task08.service.ParserService;
import by.goncharov.task08.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/main")
@MultipartConfig
public class Controller extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger(
            Controller.class);
    @Override
    protected void doGet(final HttpServletRequest req,
                         final HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(final HttpServletRequest req,
                          final HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(final HttpServletRequest req,
                                final HttpServletResponse resp)
            throws ServletException, IOException {
        String typeParser = req.getParameter("radios");
        Part part = req.getPart("file");
        boolean status = Validator.validate(part.getInputStream());
        req.setAttribute("status", status);
        if (status) {
            try {
                AbstractFlowerParser parser = ParserService.getInstance()
                        .createFlowerParser(typeParser);
                InputStream streamXml = part.getInputStream();
                parser.buildSetFlowers(streamXml);
                req.setAttribute("flowers", parser.getFlowers());
                req.getRequestDispatcher("WEB-INF/view/result.jsp")
                        .forward(req, resp);
            } catch (ParserException e) {
                LOGGER.error("error in controller", e);
            }
        } else {
            req.getRequestDispatcher("WEB-INF/view/result.jsp")
                    .forward(req, resp);
        }
    }
}
