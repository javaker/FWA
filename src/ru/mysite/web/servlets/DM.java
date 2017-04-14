package ru.mysite.web.servlets;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

/**
 * Created by admin on 05.04.2017.
 */
public class DM {
    public static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/test_db?user=root&password=toor";

    public static void main(String[] args) {
        Enumeration<Driver> iter = DriverManager.getDrivers();
        while (iter.hasMoreElements()){
            Driver driver = iter.nextElement();
            System.out.println(driver);
        }
        try (Connection conn = DriverManager.getConnection(JDBC_URL)){
            System.out.println("conn " + conn);
        } catch (Exception e){

        }
    }
}
