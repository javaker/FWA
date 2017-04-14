package ru.mysite.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.*;

/**
 * Created by admin on 30.03.2017.
 */
public class MyServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        SQLConnect sqlConnect = new SQLConnect();
//        try {
//            Connection conn = sqlConnect.getConnection();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT id, name FROM tmp");   //Создаем результсет для получения ответа
//            while (rs.next()) { //перебираем наш результсет и выводим на консоль
//                id = rs.getInt("id");
//                name = rs.getString("name");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        String name = req.getParameter("name");
        String secondName = req.getParameter("secondName");
        String buttom = req.getParameter("submitButton");

        System.out.println(name + " " + secondName);

        User user = new User();
        if (buttom.equals("Создать")) System.out.println("Create");//user.addUser(name, secondName);
        if (buttom.equals("Запрос")) System.out.println("Querry"); //user.selectUser(name, secondName);


//        req.setAttribute("id", user.id);
        req.setAttribute("name", name);
        req.setAttribute("secondName", secondName);
        resp.setContentType("text/html; charset=utf-8");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String secondName = req.getParameter("secondName");
//
//        System.out.println(name +" "+ secondName);
//
//        User user = new User();
//        user.addUser(name, secondName);
//
//
////        req.setAttribute("id", user.id);
//        req.setAttribute("name", name);
//        req.setAttribute("secondName", secondName);
//        resp.setContentType("text/html; charset=utf-8");
//        req.getRequestDispatcher("index.jsp").forward(req, resp);
//    }
}
