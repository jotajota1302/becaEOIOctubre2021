package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.es.eoi.entity.Alumno;

public class AlumnoRepositoryJDCBImpl implements AlumnoRepository {

	@Override
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

	@Override
	public void save(Alumno alumno) {

	}

	@Override
	public Alumno update(Alumno alumno) {

		return null;

	}

	@Override
	public void remove(int id) {

	}

}
