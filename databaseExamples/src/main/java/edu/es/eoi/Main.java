package edu.es.eoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection con = null;
						
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/beca","root","root");
			
			Statement stm= con.createStatement();
			
			ResultSet rs=stm.executeQuery("SELECT nombre as TITULO from beca.pelicula");
					
			while(rs.next()) {
				
				System.out.println(rs.getString("TITULO"));
				
			}
			
		} catch (SQLException e) {
		
		}finally {
			
			try {
				con.close();
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		}
		
	}

}
