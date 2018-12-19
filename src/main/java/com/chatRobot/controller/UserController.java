package com.chatRobot.controller;


import javax.servlet.http.HttpServletRequest;
import com.chatRobot.dao.DAO;
import com.chatRobot.model.*;
import com.chatRobot.service.impl.BaseCommonServiceImpl;
import com.chatRobot.util.CreateIdNO;
import com.chatRobot.util.InvokeUtil;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private  HttpServletRequest request;

    @Resource
    private BaseCommonServiceImpl<User> baseCommonServiceImpl;

    @RequestMapping("/showUser.do")
    public String selectUser() throws IOException {
//        this.setResearchItem();
        String userId = request.getParameter("id");
        Object[] params=new Object[1];
        params[0]=userId;
        User user = (User) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getUserDao(), DAO.SELECTBYPRIMARYKEY,params);
        System.out.println(user);
//        response.getWriter().write(writeValueAsString(user));
//        response.getWriter().close();
//        ModelAndView resMap=new ModelAndView();
//        resMap.setViewName("userManage");
        return "userManage";
    }
    @RequestMapping(value = "/selectRecordsByPage.do")
    @ResponseBody
    public String selectRecordsByPage(@Param("pagebean")PageBean pagebean, @Param("keyword")String keyword,@Param("column")String column){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria= (UserExample.Criteria) InvokeUtil.invoke(userExample.createCriteria(),keyword,column);
        Object[] params=new Object[2];
        params[0]=pagebean;
        params[1]=userExample;
        List<User> list= (List<User>) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getUserDao(),DAO.SELECTRECORDSBYPAGE,params);
        Object[] params1=new Object[1];
        params[0]=userExample;
        Long count1= (long) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getUserDao(),DAO.COUNTBYEXAMPLE,params1);
        int count= new Long(count1).intValue();
        JSONObject jsonObject=new JSONObject();
        jsonObject.accumulate("total", count);
        jsonObject.accumulate("rows", list);
        String json=jsonObject.toString();
        return json;
    }

    @RequestMapping(value = "/saveOrUpdateUser.do")
    @ResponseBody
    public String saveOrUpdateUser(User user){
        Object[] params=new Object[1];
        params[0]=user;
        if(null==user.getId()||user.getId().isEmpty()){
            user.setId(CreateIdNO.CreateIdNO("user"));
            return this.baseCommonServiceImpl.invoke(this.baseCommonServiceImpl.getUserDao(),DAO.INSERT,params).toString();
        }
        return this.baseCommonServiceImpl.invoke(this.baseCommonServiceImpl.getUserDao(),DAO.UPDATEBYPRIMARYKEY,params).toString();
    }
    @RequestMapping(value = "/deleteUserById.do")
    @ResponseBody
    public String deleteUserById(String id){
        Object[] params=new Object[1];
        params[0]=id;
        return this.baseCommonServiceImpl.invoke(this.baseCommonServiceImpl.getUserDao(),DAO.DELETEBYPRIMARYKEY,params).toString();
    }

    @RequestMapping(value = "/getUserById.do")
    @ResponseBody
    public String getUserById(String id){
        Object[] params=new Object[1];
        params[0]=id;
        return JSONObject.fromObject(this.baseCommonServiceImpl.invoke(this.baseCommonServiceImpl.getUserDao(),DAO.SELECTBYPRIMARYKEY,params)).toString();
    }
}
