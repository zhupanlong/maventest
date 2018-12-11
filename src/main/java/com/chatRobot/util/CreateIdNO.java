package com.chatRobot.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class CreateIdNO {

    @Autowired
    private DataSource dataSource;

    private static CreateIdNO createIdNO;

    public CreateIdNO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void init(){
        createIdNO=this;
        createIdNO.dataSource=createIdNO.dataSource;
    }

    public static String CreateIdNO(String seq){
        createSequence(seq);
        String id="";
        try {
            Statement statement=createIdNO.dataSource.getConnection().createStatement();
            String sql="SELECT lpad(seq_"+seq+".nextval,20,'0') FROM dual";//看序列是否存在
            ResultSet resultSet=statement.executeQuery(sql);
            if(resultSet.next()){//不存在则创建，存在则不处理
                id=resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static boolean createSequence(String seq){
        boolean flag=false;
        try {
            Statement statement=createIdNO.dataSource.getConnection().createStatement();
            String sql="select 1 from User_Sequences t where t.sequence_name=upper('seq_"+seq+"')";//看序列是否存在

            ResultSet resultSet=statement.executeQuery(sql);
            if(!resultSet.next()){//不存在则创建，存在则不处理
                sql="create sequence seq_"+seq;
                statement.execute(sql);
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
