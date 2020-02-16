package by.tut.shershnev_s.repository.impl;

import by.tut.shershnev_s.repository.FilePathRepository;
import by.tut.shershnev_s.repository.model.FilePathModel;
import org.springframework.stereotype.Repository;

@Repository
public class FilePathRepositoryImpl implements FilePathRepository {

    private final FilePathModel filePathModel;

    public FilePathRepositoryImpl(FilePathModel filePathModel) {
        this.filePathModel = filePathModel;
    }

    @Override
    public String getPath() {
        return filePathModel.getPath();
    }
}
