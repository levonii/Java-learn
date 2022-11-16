package com.atguigu.redis.servlet;

import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//处理验证验证码请求的Servlet
@WebServlet("/CheckCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phoneNo = request.getParameter("phone_no");
        String inputCode = request.getParameter("verify_code");
        if (phoneNo == null || inputCode == null || "".equals(phoneNo) || "".equals(inputCode)) {
            return;
        }
        //拼接
        String codeKey = phoneNo + ":code";
        Jedis jedis = new Jedis("192.168.6.100", 6379);
        String redisCode = jedis.get(codeKey);
        if (inputCode.equals(redisCode)) {
            jedis.del(codeKey);
            //给前台响应
            response.getWriter().write("true");
        }
        jedis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
