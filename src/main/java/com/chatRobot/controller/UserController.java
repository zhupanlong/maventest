package com.chatRobot.controller;

import javax.servlet.http.HttpServletRequest;

<<<<<<< HEAD
import com.chatRobot.dao.DAO;
import com.chatRobot.model.User;
import com.chatRobot.service.impl.BaseCommonServiceImpl;
=======
import com.chatRobot.service.IUserService;
>>>>>>> f90552ae305163f29b3e2c0722b5817cd8dc1a52
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
<<<<<<< HEAD
    private BaseCommonServiceImpl<User> baseCommonServiceImpl;
=======
    private IUserService userService;
>>>>>>> f90552ae305163f29b3e2c0722b5817cd8dc1a52

    @RequestMapping("/showUser.do")
    public ModelAndView selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("id");
<<<<<<< HEAD
//        BaseCommonServiceImpl serviceImpl= (BaseCommonServiceImpl) this.serviceImpl;
        Object[] params=new Object[1];
        params[0]=userId;
        User user = (User) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getUserDao(), DAO.SELECTBYPRIMARYKEY,params);;
=======
        User user = this.userService.selectByPrimaryKey(userId);
>>>>>>> f90552ae305163f29b3e2c0722b5817cd8dc1a52
//        ObjectMapper mapper = new ObjectMapper();
        System.out.println(user);
//        response.getWriter().write(writeValueAsString(user));
//        response.getWriter().close();
        ModelAndView resMap=new ModelAndView();
        resMap.setViewName("welcome");
        return resMap;
    }

}
