package by.goncharov.task08.service;

import by.goncharov.task08.service.parser.*;

public final class ParserService {

    private static final ParserService INSTANCE =  new ParserService();
    private enum TypeParser {
        SAX, STAX, DOM
    }

    private ParserService() {
    }

    public static ParserService getInstance() {
        return INSTANCE;
    }

    public AbstractFlowerParser createFlowerParser(final String typeParser)
            throws ParserException {
        TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
        switch (type) {
            case DOM:
                return new DOMFlowerParser();
            case STAX:
                return new StAXFlowerParser();
            case SAX:
                return new SAXFlowerParser();
            default:
                throw new EnumConstantNotPresentException(
                        type.getDeclaringClass(), type.name());
        }
    }
}

