package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by PC-21 on 2017/8/8.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
