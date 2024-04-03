package org.example.fileupload.FileService;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface FileService {
    String saveFile(MultipartFile file) throws IOException;
    String postOne(MultipartFile file) throws IOException;

    Resource getFileByFileName(String fileName) throws IOException;
}

