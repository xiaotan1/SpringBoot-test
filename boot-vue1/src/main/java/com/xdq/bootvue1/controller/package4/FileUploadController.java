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
        String a = req.getSession().getServletContext().getRealPath("/");
        System.out.println(a);
        String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
        String format = simpleDateFormat.format(new Date());
        File floder = new File(realPath + format);

        if (!floder.exists()){//isDirectory()
            floder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename() ;
        String newName = UUID.randomUUID().toString () +
            oldName.substring(oldName.lastIndexOf("."), oldName . length());
        try {
            uploadFile.transferTo(new File(floder , newName ) ) ;
            String filePath = req.getScheme() + "://" + req.getServerName() + ":" +
            req.getServerPort() +"/uploadFile/"+ format + newName ;
            return filePath ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }


}