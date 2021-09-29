package by.goncharov.task07.parser.impl;

import by.goncharov.task07.entities.ComponentText;
import by.goncharov.task07.entities.CompositeText;
import by.goncharov.task07.entities.Symbol;
import by.goncharov.task07.entities.TypeComponent;
import by.goncharov.task07.exception.TextException;
import by.goncharov.task07.parser.TextParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WordParserImpl implements TextParser {
	public static Logger log = LogManager.getLogger();

	@Override
	public ComponentText parseText(String word) throws TextException {
		CompositeText wordComponent = new CompositeText(TypeComponent.WORD);
		char[] symbols = word.toCharArray();
		Symbol symbolComponent;
		for (char symbol : symbols) {
			symbolComponent = new Symbol(TypeComponent.LETTER, symbol);
			wordComponent.addComponent(symbolComponent);
		}
		log.info("parsing the component word");
		return wordComponent;
	}
}
