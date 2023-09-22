package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class conecta {
    public static Connection getConexao() throws Exception{
        Connection con = null;

        String serverName = "localhost";
        String myDataBase = "alunos";

        String userName = "root";
        String password ="";

        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);

        String url = "jdbc:mysql://"+serverName+"/"+myDataBase;
        con = DriverManager.getConnection(url, userName, password);

        return con;
    }
}
