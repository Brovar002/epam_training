package by.goncharov.task07.action;

import java.util.ArrayList;
import java.util.List;

import by.goncharov.task07.util.comparator.ParagraphComparator;
import by.goncharov.task07.entities.ComponentText;
import by.goncharov.task07.entities.CompositeText;
import by.goncharov.task07.entities.TypeComponent;
import by.goncharov.task07.exception.TextException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextAction {
	public static final Logger log = LogManager.getLogger();

	public ComponentText sortParagraphs(ComponentText text) throws TextException {
		if (text == null || text.getType() != TypeComponent.TEXT) {
			log.error("component is invalid");
			throw new TextException("component is invalid");
		}
		List<ComponentText> resultText = new ArrayList<>(text.getComponents());
		resultText.sort(new ParagraphComparator());
		((CompositeText) text).setComponents(resultText);
		log.info("text after sorting by the number of sentences in paragraph: " + text.toString());
		return text;
	}


	public ComponentText sortByLengthOfWordsText(ComponentText text) throws TextException {
		if (text == null || text.getType() != TypeComponent.TEXT) {
			log.error("component is invalid");
			throw new TextException("component is invalid");
		}
		List<ComponentText> allWords = new ArrayList<>();
		CompositeText resultText = new CompositeText(TypeComponent.TEXT);
		for (ComponentText paragraphComponent : text.getComponents()) {
			CompositeText resultParagraph = new CompositeText(TypeComponent.PARAGRAPH);
			for (ComponentText sentenceComponent : paragraphComponent.getComponents()) {
				CompositeText resultSentence = new CompositeText(TypeComponent.SENTENCE);
				for (ComponentText lexemeComponent : sentenceComponent.getComponents()) {
					for (ComponentText elementLexeme : lexemeComponent.getComponents()) {
						if (elementLexeme.getType() == TypeComponent.WORD) {
							allWords.add(elementLexeme);
						}
					}
					allWords.sort(new ParagraphComparator());
					resultSentence.setComponents(allWords);
				}
				resultParagraph.addComponent(resultSentence);
			}
			resultText.addComponent(resultParagraph);
		}
		return resultText;
	}
}
