package by.goncharov.task05.dao;

import by.goncharov.task05.beans.Matrix;
import by.goncharov.task05.dao.exception.DAOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixDAO {
    public Matrix getMatrix() throws IOException, DAOException {
        String absolutePath = new PathOfFiles().get("matrix.txt");
        List<String> list = Files.lines(Paths.get(absolutePath)).
                collect(Collectors.toList());
        List<String> limitList = List.of(list.remove(0).split(" "));
        int size = list.size();
        if (new LimitsValidator().validate(list.size(), Integer.parseInt(limitList.get(0)),
                Integer.parseInt(limitList.get(1)))) {
            throw new DAOException();
        }
        Matrix matrix = new Matrix(size, size);
        for (int i = 0; i < size; i++) {
            String[] arr = list.get(i).split(" ");
            for (int j = 0; j < size; j++) {
                matrix.put(i, j, Integer.parseInt(arr[j]));
            }
        }
        return matrix;
    }
}
