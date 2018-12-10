package com.chatRobot.controller;

import javax.servlet.http.HttpServletRequest;

import com.chatRobot.model.User;
import com.chatRobot.service.IService;
import com.chatRobot.service.IUserService;
import com.chatRobot.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public ModelAndView selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("id");
        User user = this.userService.selectByPrimaryKey(userId);
//        ObjectMapper mapper = new ObjectMapper();
        System.out.println(user);
//        response.getWriter().write(writeValueAsString(user));
//        response.getWriter().close();
        ModelAndView resMap=new ModelAndView();
        resMap.setViewName("welcome");
        return resMap;
    }

}
