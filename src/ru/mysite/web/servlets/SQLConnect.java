package ru.mysite.web.servlets;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

/**
 * Created by admin on 06.04.2017.
 */
public class SQLConnect {


    private InitialContext ic;
    private DataSource ds;

    public Connection getConnection() throws SQLException, NamingException {
        ic = new InitialContext();
        ds = (DataSource) ic.lookup("java:/comp/env/jdbc/db"); // вместо написать java:/comp/env/jdbc/TestDB
        return ds.getConnection();
    }

}

