package by.tut.shershnev_s.repository;

import java.util.List;

public interface FileRepository {

    List<String> getStringsFromFile(String fileName);

}
