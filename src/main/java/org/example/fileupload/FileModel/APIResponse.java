package org.example.fileupload.FileModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class APIResponse <T> {
    String message;
    HttpStatus status;
    int code;
    T payload;
}
