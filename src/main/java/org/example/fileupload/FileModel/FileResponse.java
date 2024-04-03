package org.example.fileupload.FileModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileResponse {
    private String fileName;
    private String fileUrl;
    private String fileType;
    private Long fileSize;
}

