package sn.diarrabousso.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseHelper {
    private Connection cnx;
    private PreparedStatement pstmt;
    private static DatabaseHelper db;

    private DatabaseHelper(){

    }
    public static DatabaseHelper getInstance()
    {
        if (db==null)
        {
            db=new DatabaseHelper();
        }
        return db;
    }

    private void openConnection()
    {
        try
        {
            if (cnx==null || cnx.isClosed())
            {
                Class.forName("com.mysql.cj.jdbc.Driver");//Definition de la classe du driver qui sera charge en memoire
                String url = "jdbc:mysql://localhost:3306/devoirjava1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";//Indique la chaine de connexion
                String user = "root", pwd = "";
                cnx = DriverManager.getConnection(url, user, pwd);//Etablie la connexion

            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void prepareStatement(String sql)
    {
        try
        {
            openConnection();
            pstmt=cnx.prepareStatement(sql);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void addParameters(Object[] params)
    {
        try
        {
            for (int i=0;i<params.length;i++)
            {
                pstmt.setObject(i+1,params[i]);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public ResultSet executeQuery()
    {
        try
        {
            return pstmt.executeQuery();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public int executeUpdate()
    {
        try
        {
            return pstmt.executeUpdate();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return 0;
    }
    public void closeConnection()
    {
        try
        {
            if (pstmt != null && !pstmt.isClosed() )
            {
                pstmt.close();
            }
            if (cnx != null && !cnx.isClosed() )
            {
                cnx.close();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
