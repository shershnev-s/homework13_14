package by.tut.shershnev_s.service.impl;

import by.tut.shershnev_s.repository.FileRepository;
import by.tut.shershnev_s.service.FilePathService;
import by.tut.shershnev_s.service.NineTaskService;
import by.tut.shershnev_s.service.SevenTaskService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.List;

@Service("nineTaskService")
public class NineTaskServiceImpl implements NineTaskService {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private final FileRepository fileRepository;
    private final SevenTaskService sevenTaskService;
    private final FilePathService filePathService;

    public NineTaskServiceImpl(FileRepository fileRepository, SevenTaskService sevenTaskService, FilePathService filePathService) {
        this.fileRepository = fileRepository;
        this.sevenTaskService = sevenTaskService;
        this.filePathService = filePathService;
    }

    @Override
    public int getSummFromFile(String fileName) {
        List<String> strings;
        String path = filePathService.getFilePath();
        strings = fileRepository.getStringsFromFile(path + fileName);
        int summ = 0;
        logger.info("-----Computing process started-----");
        for (String string : strings) {
            summ += sevenTaskService.add(string);

        }
        logger.info("-----Computing process finished-----");
        return summ;
    }

}
