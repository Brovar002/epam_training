package by.goncharov.task08.beans;

public class GrowingTip {

    private int temperature;
    private boolean lighting;
    private int watering;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public boolean isLighting() {
        return lighting;
    }

    public void setLighting(final boolean lighting) {
        this.lighting = lighting;
    }

    public int getWatering() {
        return watering;
    }

    public void setWatering(final int watering) {
        this.watering = watering;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GrowingTip that = (GrowingTip) o;

        if (temperature != that.temperature) {
            return false;
        }
        if (lighting != that.lighting) {
            return false;
        }
        return watering == that.watering;
    }

    @Override
    public int hashCode() {
        int result = temperature;
        result = 31 * result + (lighting ? 1 : 0);
        result = 31 * result + watering;
        return result;
    }

    @Override
    public String toString() {
        return "GrowingTip{"
                + "temperature=" + temperature
                + ", lighting=" + lighting
                + ", watering=" + watering
                + '}';
    }
}
