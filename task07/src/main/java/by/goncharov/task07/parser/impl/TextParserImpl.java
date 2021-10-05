package by.goncharov.task07.parser.impl;

import by.goncharov.task07.entities.ComponentText;
import by.goncharov.task07.entities.CompositeText;
import by.goncharov.task07.entities.TypeComponent;
import by.goncharov.task07.exception.TextException;
import by.goncharov.task07.parser.TextParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextParserImpl implements TextParser {
	public static final Logger log = LogManager.getLogger();
	private TextParser parser = new ParagraphParserImpl();
	public static final String PARAGRAPH_SPLIT = "\t";
	
	@Override
	public ComponentText parseText(String text) throws TextException {
		if (text == null || text.isEmpty()) {
			throw new TextException("text is null or empty");
		}
		CompositeText textComponent = new CompositeText(TypeComponent.TEXT);
		text = text.strip();
		String[] paragraphs = text.split(PARAGRAPH_SPLIT);
		for (String paragraph : paragraphs) {
			ComponentText paragraphComponent = parser.parseText(paragraph);
			textComponent.addComponent(paragraphComponent);
		}
		log.info("parsing the component text");
		return textComponent;
	}
}
