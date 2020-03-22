package com.data.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhouhaiming on 2017-4-26 17:53
 * Email: dg_chow@163.com
 */
@Data
public class FileModel {
    private MultipartFile file;
}
