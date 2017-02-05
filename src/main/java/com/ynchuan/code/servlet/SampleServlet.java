package com.ynchuan.code.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;	

public class SampleServlet extends HttpServlet {

    private static final long serialVersionUID = 7065409287377444221L;

    public SampleServlet(){
        System.out.println("SampleServlet is initialized!");
    }
    
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().append("<h1>SampleServlet.doGet() is called!</h1>");

    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        response.getWriter()
                .append("<h1>SampleServlet.doPost() is called!</h1>");

    }
    
    public void init() throws ServletException {
        super.init();
        ServletContext servletContext = this.getServletContext();
//        WebApplicationContext ctx = WebApplicationContextUtils
//                .getWebApplicationContext(servletContext);
//        someData = ctx.getBean("someData", SampleData.class);
    }

}