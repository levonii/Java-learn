package com.itheima.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.pojo.Brand;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 品牌数据的测试
 */
public class BrandTest {
    /**
     * 查询所有
     * 1.select *from tb_brand;
     * 2.参数：不需要
     * 3.结果：List<brand>
     */
    @Test
    public void testAdd() throws Exception {
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1;
        String description = "绕地球一圈！";
        int status = 1;
        Properties prop = new Properties();
        prop.load(new FileInputStream("F:/gitee/jdbc/jdbc-java/src/druid.properties"));
        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        //5.获取数据库连接 Connection
        Connection conn = dataSource.getConnection();
        String sql = "insert into tb_brand(brand_name, company_name, ordered, description, status) values (?,?,?,?,?);";
        //获取pstm对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);
        //执行SQL
        int count = pstmt.executeUpdate();
        //处理结果List<brand> 封装brand对象 装载List集合
        System.out.println(count > 0);
        //释放资源
        pstmt.close();
        conn.close();
    }


    public void testSelectAll() throws Exception {

        Properties prop = new Properties();
        prop.load(new FileInputStream("F:/gitee/jdbc/jdbc-java/src/druid.properties"));
        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        //5.获取数据库连接 Connection
        Connection conn = dataSource.getConnection();
        String sql = "select * from tb_brand";
        //获取pstm对象
        PreparedStatement pstm = conn.prepareStatement(sql);
        //设置参数

        //执行SQL
        ResultSet rs = pstm.executeQuery();
        //处理结果List<brand> 封装brand对象 装载List集合
        Brand brand = null;
        List<Brand> brands = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            //封装Brand对象
            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);
            //装载集合
            brands.add(brand);
        }
        System.out.println(brands);
        //释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}
