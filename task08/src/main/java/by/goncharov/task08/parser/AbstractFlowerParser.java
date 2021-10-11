package by.goncharov.task08.parser;

import by.goncharov.task08.beans.Flower;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractFlowerParser {

    protected Set<Flower> flowers;

    protected AbstractFlowerParser() {
        this.flowers = new HashSet<>();
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public abstract void buildSetFlowers(InputStream stream);
}
