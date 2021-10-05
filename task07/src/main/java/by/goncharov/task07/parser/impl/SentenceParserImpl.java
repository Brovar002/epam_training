package by.goncharov.task07.parser.impl;

import by.goncharov.task07.entities.ComponentText;
import by.goncharov.task07.entities.CompositeText;
import by.goncharov.task07.entities.TypeComponent;
import by.goncharov.task07.exception.TextException;
import by.goncharov.task07.parser.TextParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SentenceParserImpl implements TextParser {
	public static final Logger log = LogManager.getLogger();
	private TextParser parser = new LexemeParserImpl();
	public static final String LEXEME_SPLIT = "\s";

	@Override
	public ComponentText parseText(String sentence) throws TextException {
		if (sentence == null || sentence.isEmpty()) {
			throw new TextException("sentence is null or empty");
		}
		CompositeText sentenceComponent = new CompositeText(TypeComponent.SENTENCE);
		String[] lexemes = sentence.split(LEXEME_SPLIT);
		for (String lexeme : lexemes) {
			ComponentText lexemeComponent = parser.parseText(lexeme);
			sentenceComponent.addComponent(lexemeComponent);
		}
		log.info("parsing the component sentence");
		return sentenceComponent;
	}
}
