package com.group4.controller;

import com.group4.bean.TUser;
import com.group4.service.UserService;
import com.group4.util.UploadHeadImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.jws.WebParam;
import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @Value("${spring.http.multipart.location}")
    private String filePath;
    //进入主页面
   @RequestMapping("mainPage")
    public String mainPage(){
        return "mainPage";
    }
    //进入个人主页

    @RequestMapping("personalPage")
    public String personalPage(){
        return "personalPage";
    }
    @RequestMapping("index")
    public String registerPage(){
        return "registerPage";
    }
    @RequestMapping("add")
    public String  addPage() {
        return "loginPage";
    }
    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping("register")
    public String register(TUser user){
        userService.register(user);
        return "forward:login";
    }

    /**
     * 登录
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("login")
    public String login(TUser user, Model model){
        TUser login = userService.login(user);
        if(login!=null){
            model.addAttribute("userInfo",login);
            return "loginSuccess";
        }
        return "loginPage";
    }

    //注册验证用户名是否重复
    @RequestMapping(value="queryByName",method = RequestMethod.POST)
    @ResponseBody
    public TUser queryByName(TUser user){
     return userService.queryByName(user);
    }


    @RequestMapping("toModifyUserInfo")
    public String toModifyUserInfo(TUser user){
        System.out.println("1111111111111");
        return "modifyHeadImage";
    }
    /**
     * 修改头像
     * @param file
     *
     * @returnModel model,
     */
    @RequestMapping("modifyHeadImage")
    public String modifyHeadImage(@RequestParam MultipartFile file,TUser user){
        //上传头像

        String newfilePath = UploadHeadImageUtil.uploadHeadImage(file,filePath);
        System.out.println("是否成功?"+newfilePath);
        //文件路径
        if (newfilePath!=null&& newfilePath.length()>0){
            //userService.modifyUserHeadImage(user);
           // model.addAttribute("message","上传成功");
        }else {
            //model.addAttribute("message","上传失败");
        }
        return "modifyHeadImage";
    }
    //音频数据查询
    @RequestMapping(value = "queryTuserAndVidel",method = RequestMethod.POST)
    @ResponseBody
    public List<TUser> queryTuserAndVidel(){
        return  userService.queryTuserAndVidel();
    }



}
