package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.es.eoi.entity.Alumno;

public class AlumnoRepositoryJDCBImpl  {

	
	public Alumno findById(int id) {

		Alumno alumno = null;
		Connection con = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");
			PreparedStatement pst=con.prepareStatement("SELECT * FROM  BECA.ALUMNO WHERE ID=?");
			pst.setInt(1,id);
			
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				alumno = new Alumno();
				alumno.setId(rs.getInt("id"));
				alumno.setApellidos(rs.getString("apellidos"));
				alumno.setEdad(rs.getDouble("edad"));
				alumno.setNombre(rs.getString("nombre"));
				alumno.setTelefono(rs.getString("telefono"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}

		return alumno;

	}

	
	public void save(Alumno alumno) {
	
		Connection con = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");
			PreparedStatement pst=con.prepareStatement("INSERT INTO beca.alumno (apellidos, dni, edad, nombre, telefono) VALUES (?,?,?,?,?)");
			
			pst.setString(1, alumno.getApellidos());
			pst.setString(2, alumno.getDni());
			pst.setDouble(3, alumno.getEdad());
			pst.setString(4, alumno.getNombre());
			pst.setString(5, alumno.getTelefono());

			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}	
		
	}

	
	public Alumno update(Alumno alumno) {

		Connection con = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");
			PreparedStatement pst=con.prepareStatement("UPDATE beca.alumno wshere sdfhaosdhiaoushdoiauh");
			
			pst.setString(1, alumno.getApellidos());
			pst.setString(2, alumno.getDni());
			pst.setDouble(3, alumno.getEdad());
			pst.setString(4, alumno.getNombre());
			pst.setString(5, alumno.getTelefono());

			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}	

		return alumno;
	}

	public void remove(int id) {

		Connection con = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");
			PreparedStatement pst=con.prepareStatement("DELETE FROM beca.alumno WHERE ID=?");			
			pst.setInt(1, id);
		

			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}	
		
	}

}
