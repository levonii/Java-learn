import com.atguigu.mybatis.mapper.EmployeeMapper;
import com.atguigu.mybatis.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {

    @Test
    public void testMybatis() {

        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            //通过sqlSessionFactory获取SqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //获取EmployeeMapper的代理对象
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            System.out.println("employeeMapper.getClass().getName() = " + employeeMapper.getClass().getName());

            //Employee zhangsan = new Employee(null, "陈鑫", "66", 500.0);
            Employee employee = new Employee(null,"lisi","lisi@163.com",100.0);
            //添加员工信息
            int a=employeeMapper.insertEmployee(employee);
            //employeeMapper.deleteEmployeeById(7);
            //employeeMapper.updateEmployeeById(zhangsan);

            //获取新增员工的id
            System.out.println("employee.getId() = "+ employee.getId());
            System.out.println(a);
            //提交事务
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
