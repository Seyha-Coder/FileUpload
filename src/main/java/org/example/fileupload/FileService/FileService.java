package org.example.fileupload.FileService;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    String saveFile(MultipartFile file) throws IOException;

    Resource getFileByFileName(String fileName) throws IOException;
}

