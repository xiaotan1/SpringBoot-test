package com.xdq.bootvue1.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 上传文件大小限制
 */
@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException e, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=utf-8");

        /*PrintWriter p = response.getWriter();
        p.write("文件上传大小超过限制");
        p.flush();
        p.close();*/
        ModelAndView  mo = new ModelAndView();
        mo.addObject("msg","文件大小超过限制");
        mo.setViewName("error");

    }

}
