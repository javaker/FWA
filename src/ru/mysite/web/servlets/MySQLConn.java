//package ru.mysite.web.servlets;
//
//
//import java.sql.*;
//
///**
// * Created by admin on 04.04.2017.
// */
//public class MySQLConn {
//    public static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/test_db?user=root&password=toor";
//
////    public static void main(String[] args) throws SQLException {
////        MySQLConn sql = new MySQLConn();
////        try {
////            sql.mysql();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
//
////
//
//       public void mysqlGet(User user) throws SQLException {
//
//        try (java.sql.Connection conn = DriverManager.getConnection(JDBC_URL)) {    //Получаем драйвер MySQL. DriverManager находит его по ClassPath, делает driver.accept(JDBC_URL) и если получает success то возращает нам экземпляр драйвера
//
//            Statement stmt = conn.createStatement();    //Создаем стейтмент для запроса
////            stmt.execute("DROP TABLE IF EXISTS Tmp;");  //Дропаем таблиуц если она уже есть
////            stmt.execute("CREATE TABLE Tmp (id INT, name VARCHAR(64));");   //Создаем новую таблицу Tmp
////
////            stmt.execute("INSERT INTO Tmp (id, name) VALUES (1, 'Misha')"); //Заполняем таблицу одним значением
//
//            ResultSet rs = stmt.executeQuery("SELECT id, name FROM tmp");   //Создаем результсет для получения ответа
//
//            while (rs.next()) { //перебираем наш результсет и выводим на консоль
//                user.id = rs.getInt("id");
//                user.name = rs.getString("name");
//
//
//            }
//        }
//    }
//}
