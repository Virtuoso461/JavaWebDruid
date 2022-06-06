package druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.Properties;

public class Druid {

    public static void main(String[] args) throws Exception{

                //1.导入jar包

        //2.定义配置文件

        //3.加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:/JavaSource/JDBC/druid.properties"));
        //4.获得连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5.获取连接
        Connection connection = dataSource.getConnection();

        //6.输出对象
        System.out.println(connection);

    }

}
