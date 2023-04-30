/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkg7;
import java.sql.*;
/**
 *
 * @author gauhar
 */
public class MyDao {
    public static MyDao md = null;

    private MyDao() {}

    public static MyDao getInstance() {
        if (md == null) {
            md = new MyDao();
        }
        return md;
    }

    public Connection getConnection(String url, String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }

    public boolean dataLoader(Statement st, String query) throws SQLException {
        return st.execute(query);
    }

    public ResultSet fetchData(Statement st, String query) throws SQLException {
        return st.executeQuery(query);
    }

    public String printData(ResultSet rs, String openTag, String closeTag) throws SQLException {
        StringBuilder sb = new StringBuilder();
        int noc = rs.getMetaData().getColumnCount();
        while (rs.next()) {
            sb.append(openTag);
            for (int i = 1; i <= noc; i++) {
                sb.append(rs.getString(i) + " ");
            }
            sb.append(closeTag);
        }
        return sb.toString();
    }
}

