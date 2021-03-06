package com.graduationaldesign.graduation.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/24 20:12
 */
public interface FileDownService {

    String singleFile(MultipartFile file);

    String multipleFiles(MultipartFile[] files);
}
