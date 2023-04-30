/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjdbc;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gauhar
 */
public class MyDao {
    public static MyDao md=null;
public static MyDao getInstance(){
    if(md==null){
        md=new MyDao();
    }
    return md;
}
public Statement getConnection(String url,String user,String password)throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(url,user,password).createStatement();
}
public boolean dataLoader(Statement st,String query) throws SQLException{
    return st.execute(query);
}
public ResultSet fetchData(Statement st,String query)throws SQLException{
    return st.executeQuery(query);
}
public String printData(ResultSet rs,String ot, String ct)throws SQLException{
    StringBuilder sb=new StringBuilder();
    int noc=rs.getMetaData().getColumnCount();
    while(rs.next()){
        for(int i=1;i<=noc;i++){
            sb.append(rs.getString(i)+" <br></br>");
        }
        sb.append(ct);
    }
    return sb.toString();
   }
}
