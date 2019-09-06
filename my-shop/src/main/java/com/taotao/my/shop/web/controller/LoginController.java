package com.taotao.my.shop.web.controller;

import com.taotao.my.shop.commons.context.SpringContext;
import com.taotao.my.shop.entity.User;
import com.taotao.my.shop.service.UserService;
import com.taotao.my.shop.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther 姜志涛
 * @Date 2019/9/4 0004
 * @Time 下午 18:55
 */
public class LoginController extends HttpServlet {

    private UserService userService = SpringContext.getBean(UserServiceImpl.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User admin = userService.login(email, password);

        //登陆成功
        if (admin != null){
            resp.sendRedirect("/main.jsp");
        }
        //登陆失败
        else {
            req.setAttribute("message","用户名或者密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }

    }
}
