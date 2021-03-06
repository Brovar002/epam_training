package by.goncharov.task08.service.parser;

import by.goncharov.task08.beans.*;
import by.goncharov.task08.util.DateConvert;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class FlowerHandler extends DefaultHandler  {

    private Set<Flower> flowers;
    private Flower current = null;
    private FlowerEnum currentEnum = null;
    private EnumSet<FlowerEnum> withText;

    FlowerHandler() {
        flowers = new HashSet<>();
        withText = EnumSet.range(FlowerEnum.NAME, FlowerEnum.WATERING);
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }
    @Override
    public void startElement(final String uri, final String localName,
                             final String qName, final Attributes attrs) {

        if ("monocots-flower".equals(localName)) {
            current = new MonocotsFlower();
            current.setId(attrs.getValue(0));
            if (attrs.getValue(1) != null) {
                current.setSoil(Soil.fromValue(attrs.getValue(1)));
            } else {
                current.setSoil(Soil.DIRT);
            }
        } else if ("dicotyledons-flower".equals(localName)) {
            current = new DicotyledonsFlower();
            current.setId(attrs.getValue(0));
            if (attrs.getValue(1) != null) {
                current.setSoil(Soil.fromValue(attrs.getValue(1)));
            } else {
                current.setSoil(Soil.DIRT);
            }
        } else {
            FlowerEnum temp = FlowerEnum.valueOf(localName.replace("-",
                    "_").toUpperCase());
            if (withText.contains(temp)) {
                currentEnum = temp;
            }
        }
    }
    @Override
    public void endElement(final String uri, final String localName,
                           final String qName) {
        if ("dicotyledons-flower".equals(localName)) {
            flowers.add(current);
        }
        if ("monocots-flower".equals(localName)) {
            flowers.add(current);
        }
    }
    @Override
    public void characters(final char[] ch, final int start, final int length) {
        String currentElem = new String(ch, start, length).trim();
        if (currentEnum != null) {
            switch (currentEnum) {
                case NAME:
                    current.setName(currentElem);
                    break;
                case ORIGIN:
                    current.setOrigin(currentElem);
                    break;
                case LEAF_COLOR:
                    current.getVisual().setLeafColor(currentElem);
                    break;
                case STEM_COLOR:
                    current.getVisual().setStemColor(currentElem);
                    break;
                case LENGTH:
                    current.getVisual().setLength(
                            Integer.parseInt(currentElem));
                    break;
                case DATE_LANDING:
                    current.setDateLanding(
                            DateConvert.convertDate(currentElem));
                    break;
                case TEMPERATURE:
                    current.getGrowingTip().setTemperature(
                            Integer.parseInt(currentElem));
                    break;
                case LIGHTING:
                    current.getGrowingTip().setLighting(
                            Boolean.parseBoolean(currentElem));
                    break;
                case WATERING:
                    current.getGrowingTip().setWatering(
                            Integer.parseInt(currentElem));
                    break;
                case MULTIPLYING:
                    current.setMultiplying(
                            Multiplying.fromValue(currentElem));
                    break;
                default:
                    throw new EnumConstantNotPresentException(
                            currentEnum.getDeclaringClass(),
                            currentEnum.name());
            }
        }
        currentEnum = null;
    }
}
