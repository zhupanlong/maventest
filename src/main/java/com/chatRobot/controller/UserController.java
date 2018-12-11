package com.chatRobot.controller;

import javax.servlet.http.HttpServletRequest;
import com.chatRobot.dao.DAO;
import com.chatRobot.model.User;
import com.chatRobot.service.impl.BaseCommonServiceImpl;
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
    private BaseCommonServiceImpl<User> baseCommonServiceImpl;


    @RequestMapping("/showUser.do")
    public ModelAndView selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("id");
        Object[] params=new Object[1];
        params[0]=userId;
        User user = (User) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getUserDao(), DAO.SELECTBYPRIMARYKEY,params);;
//        ObjectMapper mapper = new ObjectMapper();
        System.out.println(user);
//        response.getWriter().write(writeValueAsString(user));
//        response.getWriter().close();
        ModelAndView resMap=new ModelAndView();
        resMap.setViewName("welcome");
        return resMap;
    }

}
