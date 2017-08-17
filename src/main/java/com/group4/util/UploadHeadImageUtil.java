package com.group4.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/16.
 */
public class UploadHeadImageUtil {

    //存储位置
    //D:\Idea_workspace\videl\src\main\resources\templates\image\default.jpg

    //上传头像
    public static String uploadHeadImage(MultipartFile file,String filePath){

        String originalFilename = file.getOriginalFilename();
        String fileName = originalFilename.substring(0, originalFilename.lastIndexOf("."));//defalut
        String fileType = originalFilename.substring(originalFilename.lastIndexOf("."));//.jpg
        BufferedOutputStream bos=null;

        System.out.println(filePath+"真实名字:"+originalFilename+"临时名字"+fileName+"文件类型:"+fileType);
        try {//Ctal+Alt+T
            bos = new BufferedOutputStream(new FileOutputStream(filePath + fileName + fileType));
            bos.write(file.getBytes());
            bos.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                return fileName+fileType;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
