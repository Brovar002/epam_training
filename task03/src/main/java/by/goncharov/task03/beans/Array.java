package by.goncharov.task03.beans;

import java.util.Arrays;

public class Array {
    private int[] a;
    public Array (int[] a) {
        this.a = a;
    }
    public int length() {
        return a.length;
    }
    public int getElement(int i) {
            return a[i];
    }
    public void setElement(int i, int value) {
            a[i] = value;
    }

    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\nArray : ");
        for (int row : a) {
                s.append(row).append(BLANK);
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(a, array.a);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(a);
    }
}
