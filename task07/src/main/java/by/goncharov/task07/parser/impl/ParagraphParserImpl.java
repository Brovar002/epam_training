package by.goncharov.task07.parser.impl;

import by.goncharov.task07.entities.ComponentText;
import by.goncharov.task07.entities.CompositeText;
import by.goncharov.task07.entities.TypeComponent;
import by.goncharov.task07.exception.TextException;
import by.goncharov.task07.parser.TextParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ParagraphParserImpl implements TextParser {
	public static Logger log = LogManager.getLogger();
	private TextParser parser = new SentenceParserImpl();
	public final static String SENTENCE_SPLIT = "(?<=([.!?.{3}]\s))";

	@Override
	public ComponentText parseText(String paragraph) throws TextException {
		if (paragraph == null || paragraph.isEmpty()) {
			throw new TextException("paragraph is null or empty");
		}
		CompositeText paragraphComponent = new CompositeText(TypeComponent.PARAGRAPH);
		String[] sentences = paragraph.split(SENTENCE_SPLIT);
		for (String sentence : sentences) {
			ComponentText sentenceComponent = parser.parseText(sentence);
			paragraphComponent.addComponent(sentenceComponent);
		}
		log.info("parsing the component paragraph");
		return paragraphComponent;
	}
}
