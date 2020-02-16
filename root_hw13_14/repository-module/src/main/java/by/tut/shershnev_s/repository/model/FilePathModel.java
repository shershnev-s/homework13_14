package by.tut.shershnev_s.repository.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FilePathModel {

    private static final String FILE_PATH = "${path.value}";

    @Value(FILE_PATH)
    private String path;

    public String getPath() {
        return path;
    }
}
