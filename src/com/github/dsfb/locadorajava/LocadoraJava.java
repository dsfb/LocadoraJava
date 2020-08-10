package com.github.dsfb.locadorajava;

import java.sql.Connection;
import java.sql.SQLException;

import com.github.dsfb.locadorajava.jdbc.ConnectionFactory;

public class LocadoraJava {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("The connection is opened!");
		connection.close();
	}

}
