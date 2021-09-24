package by.goncharov.task05.dao;

import java.io.File;

public class PathOfFiles {
    public String get(String name) {
        File file = new File("src/main/resources/files/" + name);
        return file.getAbsolutePath();
    }
}
