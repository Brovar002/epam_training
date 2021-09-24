package by.goncharov.task05.view;

import java.util.ResourceBundle;

public class Locale {
    private static final Locale instance = new Locale();
    private ResourceBundle resourceBundle;

    private Locale(){}

    public void createLocale(String language, String country){
        resourceBundle = ResourceBundle.getBundle("language.locale",
                new java.util.Locale(language, country));
    }

    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }

    public static Locale getInstance(){
        return instance;
    }
}
