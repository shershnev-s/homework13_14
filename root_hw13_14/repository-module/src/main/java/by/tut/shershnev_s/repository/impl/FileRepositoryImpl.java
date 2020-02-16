package by.tut.shershnev_s.repository.impl;

import by.tut.shershnev_s.repository.FileRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class FileRepositoryImpl implements FileRepository {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public List<String> getStringsFromFile(String fileName) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
            logger.info("-----Reading file started-----");
            String line = bf.readLine();
            while (line != null) {
                logger.info(line);
                strings.add(line);
                line = bf.readLine();

            }
            logger.info("-----Reading file finished-----");
            return strings;
        } catch (FileNotFoundException e) {
            logger.error("File not found");
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error("Program cant read this file");
            logger.error(e.getMessage(), e);
        }
        return Collections.emptyList();
    }

}
