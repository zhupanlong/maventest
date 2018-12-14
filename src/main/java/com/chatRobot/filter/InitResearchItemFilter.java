package com.chatRobot.filter;

import com.chatRobot.dao.DAO;
import com.chatRobot.model.ResearchItem;
import com.chatRobot.model.ResearchItemExample;
import com.chatRobot.service.impl.BaseCommonServiceImpl;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;


import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/12/14.
 */
public class InitResearchItemFilter implements Filter{

   private BaseCommonServiceImpl<ResearchItem> baseCommonServiceImpl;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext servletContext= filterConfig.getServletContext();
//        XmlWebApplicationContext ctx = (XmlWebApplicationContext)WebApplicationContextUtils.getWebApplicationContext(servletContext);
        XmlWebApplicationContext ctx= (XmlWebApplicationContext) WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        if(ctx != null && ctx.getBean("baseCommonServiceImpl") != null && baseCommonServiceImpl == null)
            baseCommonServiceImpl = (BaseCommonServiceImpl) ctx.getBean("baseCommonServiceImpl");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(null!=((HttpServletRequest)servletRequest).getSession().getAttribute("itemlist")){
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        Object[] params=new Object[1];
        ResearchItemExample researchItemExample=new ResearchItemExample();
        ResearchItemExample.Criteria criteria=researchItemExample.createCriteria();
        criteria.andResearchflagEqualTo("1");
        params[0]=researchItemExample;
        List<ResearchItem> list= (List<ResearchItem>) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getResearchItemMapper(), DAO.SELECTBYEXAMPLE,params);
        ((HttpServletRequest)servletRequest).getSession().setAttribute("itemlist",list);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
