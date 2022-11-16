package com.atguigu.redis;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class JedisTest {
    /*
        测试连接Redis服务
        能连接上的前提：
            1.关闭虚拟机的防火墙
            2.修改Redis的配置文件
                2.1 将bind 127.0.0.1 注释掉
                2.2 将保护模式关闭，即protected-mod的值设置为no
     */
    Jedis jedis = new Jedis("192.168.6.100", 6379);

    @Test
    public void testConnection() {

        String ping = jedis.ping();
        System.out.println("ping = " + ping);
        jedis.close();
    }

    /*
    测试Redis数据
     */
    @Test
    public void testRedis() {
//获取所有key
        Set<String> keys = jedis.keys("*");
        System.out.println("keys = " + keys);
        //判断key是否存在
        Boolean k1 = jedis.exists("k1");
        System.out.println("k1 = " + k1);
        //获取key中值得类型
        String k11 = jedis.type("k1");
        System.out.println(k11);
        //获取key的值
        String k12 = jedis.get("k1");
        System.out.println("k1 = " + k12);
        //获取k2 的值
        List<String> k2 = jedis.lrange("k2", 0, -1);
        for (String s : k2) {
            System.out.println("s = " + s);

        }

    }
}
