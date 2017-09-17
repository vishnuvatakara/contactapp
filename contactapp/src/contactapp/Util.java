/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactapp;

import java.sql.*;


/**
 *
 * @author vishnu
 */
public class Util {
    static Connection co;
    static{
        try{
            co=DriverManager.getConnection("jdbc:mysql://localhost:3307/contact","root","password");
           
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public PreparedStatement  createPST(String sql) throws SQLException
    {
        PreparedStatement ps=co.prepareStatement(sql);
        return ps;
        
    }
    public boolean modify(PreparedStatement ps) throws SQLException
    {System.out.println("haiiii");
        ps.executeUpdate();
        return true;
    }
    public ResultSet select(PreparedStatement ps) throws SQLException
    {
        ResultSet rs=ps.executeQuery();
        return rs;
    }
    
}
