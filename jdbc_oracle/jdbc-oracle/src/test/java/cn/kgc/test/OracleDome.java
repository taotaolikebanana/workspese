package cn.kgc.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleDome {

    @Test
    public void testOracle() throws  Exception{
        //加载Oracle数据库驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //得到Connection对象
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "myorcale", "myorcale");
        //得到Statement对象
        PreparedStatement ps = connection.prepareStatement("select * from emp where empno=?");

        //给参数赋值
        ps.setObject(1,7788);

        //执行数据库查询操作；

        ResultSet resultSet = ps.executeQuery();

        while(resultSet.next()){
            System.out.println(resultSet.getString("eanme"));
        }

        //释放资源
        resultSet.close();
        ps.close();
        connection.close();
    }
}
