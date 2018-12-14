package com.chatRobot.util;

import com.chatRobot.model.UserExample;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by Administrator on 2018/12/14.
 */
public class InvokeUtil {
    public static Object invoke(Object object,String keyword,String column){
        if(!object.getClass().getSimpleName().equals("Criteria")||null==column||column.isEmpty()){
            return object;
        }
        column=column.substring(0, 1).toUpperCase() + column.substring(1).toLowerCase();
        try {
            Method method=object.getClass().getMethod("and"+column+"Like",String.class);//模糊查询Like效率较低，最好用EqualTo
            return method.invoke(object,"%"+keyword+"%");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[]args){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria= userExample.createCriteria();
        criteria = (UserExample.Criteria) InvokeUtil.invoke(criteria,"1","id");
        System.out.println(criteria);
    }

}
