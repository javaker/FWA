package ru.mysite.web.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by admin on 06.04.2017.
 */
public class User {
    int id;
    String name;
    String secondName;

    public void addUser(String name, String secondName) {

        SQLConnect sqlConnect = new SQLConnect();
        try {
            PreparedStatement preparedStatement = null;
            String insertTableSQL = "INSERT INTO Tmp"
                    + "(name, secondName) VALUES"
                    + "(?,?)";

            Connection conn = sqlConnect.getConnection();
            preparedStatement = conn.prepareStatement(insertTableSQL);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, secondName);

            // execute insert SQL stetement
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void selectUser() {
        SQLConnect sqlConnect = new SQLConnect();
        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name, secondName FROM tmp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

