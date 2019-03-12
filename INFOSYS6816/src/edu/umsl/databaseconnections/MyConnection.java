package edu.umsl.databaseconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	Connection conn = null;

	public static void main(String[] args) {
		String createTableSQL = "create table PERSON( ID INTEGER, NAME VARCHAR(256), AGE INTEGER)";
		String insertTableSQL = "INSERT INTO PERSON(ID,NAME,AGE) VALUES('1','Test','26')";
		String selectSQLStatement = "SELECT * FROM PERSON";
		MyConnection conn = new MyConnection();
		try {
			conn.getConnection();
			conn.createTable(createTableSQL);
			conn.insertSQL(insertTableSQL);
			conn.selectSQL(selectSQLStatement);
			conn.shutdownDB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getConnection() throws Exception {
		// hsqldb.jar should be in the class path or made part of the current
		// jar
		Class.forName("org.hsqldb.jdbcDriver");

		conn = DriverManager.getConnection("jdbc:hsqldb:mem", "sa", // username
				"");

	}

	public void createTable(String sqlStatement) {

		Statement statement = null;

		try {
			statement = conn.createStatement();
			int i = statement.executeUpdate(sqlStatement);

			if (i == -1) {
				System.out.println("Error : " + sqlStatement);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertSQL(String insertSQLStatement) {
		Statement statement = null;
		try {
			statement = conn.createStatement();
			int i = statement.executeUpdate(insertSQLStatement);
			if (i == -1) {
				System.out.println("Error : " + insertSQLStatement);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectSQL(String selectSQLStatement) {
		Statement statement = null;
		try {
			statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(selectSQLStatement);
			while (rs.next()) {
				System.out.println(rs.getInt("ID"));
				System.out.println(rs.getInt("AGE"));
				System.out.println(rs.getString("NAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void shutdownDB() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
