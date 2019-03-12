package edu.umsl.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FoodItem {
	Connection conn = null;

	public static void main(String[] args) {
		String createTableSQL = "CREATE Table FoodItemTable(ID INTEGER, NAME VARCHAR(256), CALORIES INTEGER)";
		String insertTableSQL = "INSERT INTO FoodItemTable(ID,NAME,CALORIES) VALUES('0001','Chicken','125')";
		String selectSQLStatement = "SELECT * FROM FoodItemTable";
		FoodItem conn = new FoodItem();
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
		Class.forName("org.hsqldb.jdbcDriver");

		conn = DriverManager.getConnection("jdbc:hsqldb:mem", "sa","");

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
				System.out.println(rs.getInt("CALORIES"));
				System.out.println(rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void shutdownDB() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}

