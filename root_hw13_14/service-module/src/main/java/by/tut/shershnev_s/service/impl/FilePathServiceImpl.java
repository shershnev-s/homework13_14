package by.tut.shershnev_s.service.impl;

import by.tut.shershnev_s.repository.FilePathRepository;
import by.tut.shershnev_s.service.FilePathService;
import org.springframework.stereotype.Service;

@Service
public class FilePathServiceImpl implements FilePathService {

    private final FilePathRepository filePathRepository;

    public FilePathServiceImpl(FilePathRepository filePathRepository) {
        this.filePathRepository = filePathRepository;
    }

    @Override
    public String getFilePath() {
        return filePathRepository.getPath();
    }
}
