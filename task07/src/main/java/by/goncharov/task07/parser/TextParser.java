package by.goncharov.task07.parser;

import by.goncharov.task07.entities.ComponentText;
import by.goncharov.task07.exception.TextException;

public interface TextParser {
	ComponentText parseText(String text) throws TextException;
}
