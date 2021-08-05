package br.com.stefanini.exercicioUm.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdExercicioUm?useSSL=false&relaxAutoCommit=true",
				"root", "root");
	}

	public void close() throws Exception {
		con.close();
	}

}
