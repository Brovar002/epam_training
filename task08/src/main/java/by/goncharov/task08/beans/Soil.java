package by.goncharov.task08.beans;


public enum Soil {

    DIRT("dirt"),
    PODZOLIC("podzolic"),
    SOD_PODZOLIC("sod-podzolic");

    private final String value;

    Soil(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static Soil fromValue(final String value) {
        for (Soil currentEnum: Soil.values()) {
            if (currentEnum.value.equals(value)) {
                return currentEnum;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
