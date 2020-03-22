package com.controller;

/**
 * Created by zhouhaiming on 2017-4-26 17:53
 * Email: dg_chow@163.com
 */

import com.data.model.FileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/**
 * 文件上传 功能还不能用！！！！
 */
@Controller
public class FileUploadController {
    @Autowired
    ServletContext context;

    @RequestMapping(value = "/fileUploadPage", method = RequestMethod.GET)
    public ModelAndView fileUploadPage() {
        FileModel file = new FileModel();
        ModelAndView modelAndView = new ModelAndView("fileUpload", "command", file);
        return modelAndView;
    }
//http://localhost:8080/fileUploadPage
    @RequestMapping(value = "/fileUploadPage", method = RequestMethod.POST)
    public String fileUpload(@Validated FileModel file, BindingResult result, ModelMap model) throws IOException {
        if (result.hasErrors()) {
            System.out.println("validation errors");
            return "fileUploadPage";
        } else {
            System.out.println("Fetching file");
            MultipartFile multipartFile = file.getFile();
            String uploadPath = context.getRealPath("") + File.separator + "temp" + File.separator;
            //Now do something with file...
            FileCopyUtils.copy(file.getFile().getBytes(), new File(uploadPath + file.getFile().getOriginalFilename()));
            String fileName = multipartFile.getOriginalFilename();
            model.addAttribute("fileName", fileName);
            return "success";
        }
    }

    /*
     *采用spring提供的上传文件的方法
     */
    @RequestMapping(value="/springUpload",method = RequestMethod.POST)
    public String springUpload(HttpServletRequest request) throws IllegalStateException, IOException {
        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-com.data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();

            while (iter.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String path = "E:/springUpload" + file.getOriginalFilename();
                    //上传
                    file.transferTo(new File(path));
                }

            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
        return "/success";
    }
}
