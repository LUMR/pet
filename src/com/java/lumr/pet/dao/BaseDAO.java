package com.java.lumr.pet.dao;

import java.sql.*;

/**mysql
 * Created by fsweb on 17-3-24.
 */
public class BaseDAO {
    protected Connection conn;
    protected PreparedStatement pstmt;
    protected ResultSet result;

    public void getConn() {
        try {
            Class.forName("jdbc.java.Mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/pet";
        String user = "webuser";
        String password = "wwwlumr";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeAll() {
        try {
            if (result != null) {
                result.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
