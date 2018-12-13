package com.chatRobot.service.impl;

import com.chatRobot.dao.*;
import com.chatRobot.service.IBaseCommonService;
import org.apache.ibatis.binding.MapperProxy;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/12/11.
 */
@Service("baseCommonServiceImpl")
public class BaseCommonServiceImpl<T> implements IBaseCommonService<T> {

    @Resource
    private UserMapper userDao;
    @Resource
    private BankMoneyMapper bankMoneyMapper;
    @Resource
    private LoanApplicationMapper loanApplicationMapper;
    @Resource
    private Consumer_BankMapper consumer_bankMapper;
    @Resource
    private CustomerMapper customerMapper;
    @Resource
    private DeductMapper deductMapper;
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private ProductMapper productMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private TreeMapper treeMapper;
    @Resource
    private User_RoleMapper user_roleMapper;

    @Resource
    private ResearchItemMapper researchItemMapper;

    public Object invoke(DAO dao, String methodName, Object[] args){
        Object result=null;
        try {
            result=BaseCommonServiceImpl.getJdkDynamicProxyTargetObject(dao);
            Class daoClass=(Class)BaseCommonServiceImpl.getJdkDynamicProxyTargetObject(dao);
            Method[]  daoMethod = daoClass.getMethods();
            for(Method method:daoMethod){
                if(method.getName().equals(methodName)){
                    result= method.invoke(dao,args);
                    return result;
                }
            }
            throw new RuntimeException(daoClass.toString()+"没有"+methodName+"方法！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private static Object getJdkDynamicProxyTargetObject(Object proxy) throws Exception {
        Field h = proxy.getClass().getSuperclass().getDeclaredField("h");
        h.setAccessible(true);
        MapperProxy object=(MapperProxy)h.get(proxy);
        MapperProxy mapperProxy = (MapperProxy) h.get(proxy);
        Field mapperInterface = mapperProxy.getClass().getDeclaredField("mapperInterface");
        mapperInterface.setAccessible(true);
        Object dao=mapperInterface.get(object);
        return dao;
    }

    public UserMapper getUserDao() {
        return userDao;
    }

    public BankMoneyMapper getBankMoneyMapper() {
        return bankMoneyMapper;
    }

    public LoanApplicationMapper getLoanApplicationMapper() {
        return loanApplicationMapper;
    }

    public Consumer_BankMapper getConsumer_bankMapper() {
        return consumer_bankMapper;
    }

    public CustomerMapper getCustomerMapper() {
        return customerMapper;
    }

    public DeductMapper getDeductMapper() {
        return deductMapper;
    }

    public MenuMapper getMenuMapper() {
        return menuMapper;
    }

    public ProductMapper getProductMapper() {
        return productMapper;
    }

    public RoleMapper getRoleMapper() {
        return roleMapper;
    }

    public TreeMapper getTreeMapper() {
        return treeMapper;
    }

    public User_RoleMapper getUser_roleMapper() {
        return user_roleMapper;
    }

    public ResearchItemMapper getResearchItemMapper() {
        return researchItemMapper;
    }
}
