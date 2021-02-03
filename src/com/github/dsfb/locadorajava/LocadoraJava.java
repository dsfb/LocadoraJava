package com.github.dsfb.locadorajava;

import java.sql.Connection;
import java.sql.SQLException;

import com.github.dsfb.locadorajava.dao.Dao;
import com.github.dsfb.locadorajava.jdbc.ConnectionFactory;

public class LocadoraJava {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory(); 
		Connection connection = factory.getConnection();
		System.out.println("The connection is opened!");
		Dao dao = new Dao(connection);
		if (dao.createNonExistentTables()) {
			System.out.println("The non existent tables were created.");
		} else {
			System.out.println("An error has occurred when creating the non existent tables.");
		}
		connection.close();
		factory.dispose();
		System.out.println("The connection is closed!");
	}
}
