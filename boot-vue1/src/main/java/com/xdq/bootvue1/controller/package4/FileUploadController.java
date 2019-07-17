package com.xdq.bootvue1.controller.package4;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUploadController {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    //@RequestParam(value = "uploadFile",required = false)
    @RequestMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req){
        /**
         * MultipartFile uploadFile
         * 这里的uploadFile 名称需要和，前端input的name属性相同
         */
        String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
        System.out.println(realPath);
        String format = simpleDateFormat.format(new Date());
        File folder = new File(realPath + format);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            uploadFile.transferTo(new File(folder, newName));
            String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName;
            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }



   /* @PostMapping("/uploads")
    public String upload(MultipartFile[] uploadFiles, HttpServletRequest req) {
        for (MultipartFile uploadFile : uploadFiles) {
            String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
            System.out.println(realPath);
            String format = simpleDateFormat.format(new Date());
            File folder = new File(realPath + format);
            if (!folder.isDirectory()) {
                folder.mkdirs();
            }
            String oldName = uploadFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
            try {
                uploadFile.transferTo(new File(folder, newName));
                String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName;
//            return filePath;
                System.out.println(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "上传失败!";
    }*/

}
