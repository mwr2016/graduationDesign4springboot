package com.graduationaldesign.graduation.controller.file;

import com.graduationaldesign.graduation.service.impl.FileUploadServiceImpl;
import com.graduationaldesign.graduation.util.ResponseStatu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author wuzhuhao
 * @description 单文件和多文件的上传
 **/
@RestController
@Slf4j
public class FileUploadController {
    @Autowired
    FileUploadServiceImpl fileUploadService;
    @PostMapping("/singleFile")
    public ResponseEntity<Object> singleFile(@RequestParam("file") MultipartFile file) {
        try {
            return ResponseStatu.success(fileUploadService.singleFile(file));
        } catch (RuntimeException e) {
            return ResponseStatu.failure(e.getMessage());
        }
    }

    @PostMapping("/multipleFiles")
    public String multipleFiles(@RequestParam("file") MultipartFile[] files) {
        try {
            return fileUploadService.multipleFiles(files);
        } catch (RuntimeException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
