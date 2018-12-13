package com.chatRobot.controller;


import javax.servlet.http.HttpServletRequest;
import com.chatRobot.dao.DAO;
import com.chatRobot.model.*;
import com.chatRobot.service.impl.BaseCommonServiceImpl;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private  HttpServletRequest request;
    @Resource
    private HttpServletResponse response;
    @Resource
    private BaseCommonServiceImpl<User> baseCommonServiceImpl;

    @RequestMapping("/showUser.do")
    public String selectUser() throws IOException {
        this.setResearchItem();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
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
    public String selectRecordsByPage(@Param("pagebean")PageBean pagebean, @Param("")Example example){
        UserExample userExample=new UserExample();
//        UserExample.Criteria criteria= userExample.createCriteria();
//        criteria.andIdIsNotNull();
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
    public boolean setResearchItem(){
        Object[] params=new Object[1];
        ResearchItemExample researchItemExample=new ResearchItemExample();
        ResearchItemExample.Criteria criteria=researchItemExample.createCriteria();
        criteria.andResearchflagEqualTo("1");
        params[0]=researchItemExample;
        List<ResearchItem> list= (List<ResearchItem>) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getResearchItemMapper(),DAO.SELECTBYEXAMPLE,params);
        request.setAttribute("itemlist",list);
        return true;
    }
}
