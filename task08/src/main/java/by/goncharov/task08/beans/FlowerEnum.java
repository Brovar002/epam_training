package by.goncharov.task08.beans;

public enum FlowerEnum {

    FLOWERS("flowers"),
    MONOCOTS_FLOWER("monocots-flower"),
    DICOTYLEDONS_FLOWER("dicotyledons-flower"),
    ID("id"),
    SOIL("soil"),
    NAME("name"),
    DATE_LANDING("date-landing"),
    ORIGIN("origin"),
    MULTIPLYING("multiplying"),
    LEAF_COLOR("leaf-color"),
    STEM_COLOR("stem-color"),
    LENGTH("length"),
    TEMPERATURE("temperature"),
    LIGHTING("lighting"),
    WATERING("watering"),
    VISUAL("visual"),
    GROWING_TIPS("growing-tips");

    private String field;

    FlowerEnum(final String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
