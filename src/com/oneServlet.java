package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "oneServlet")
public class oneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        System.out.println("get");
        String name=(request.getParameter("name"));
        float weight= Float.parseFloat((request.getParameter("w")));
        float height= Float.parseFloat((request.getParameter("h")));
        float bmi=weight/(height*height);
        String msg=null;
        if (bmi<18.5)
            msg="您比较瘦";
        else {
            msg="您比较胖";
        }
        out.println(msg);
        out.flush();
        out.close();
    }
}
