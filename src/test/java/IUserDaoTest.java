import com.chatRobot.dao.UserMapper;
import com.chatRobot.model.PageBean;
import com.chatRobot.model.User;
import com.chatRobot.model.UserExample;
import com.chatRobot.util.CreateIdNO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserMapper userDao;

    @Test
    public void testSelectUser() {
       String id = "1";
        User user =null;
        PageBean pageBean=new PageBean();
        pageBean.setPageNumber(1);
        pageBean.setPageSize(2);
        UserExample userExample=new UserExample();
//        try {
//            Statement statement=dataSource.getConnection().prepareStatement("Select * from t_user");
////            statement.execute("create sequence seq_user");
//            ResultSet rs=statement.executeQuery("select * from t_user where rownum=1");
//            if(rs.next()){
//                user =new User(rs.getString(1),rs.getString(2),rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        user = userDao.selectByPrimaryKey(id);
//        UserExample.Criteria criteria= userExample.createCriteria();
//        criteria.andIdLessThan("2");
//        user = userDao.selectByExample(userExample).get(0);
//        user = (User) userDao.selectRecordsByPage(pageBean,userExample).get(0);
        System.out.println(user);
//        user.setPassword("654321");
//        user.setWeixin(null);
//        userDao.updateByPrimaryKey(user);
        System.out.println(CreateIdNO.CreateIdNO("BankMoney"));
    }

}