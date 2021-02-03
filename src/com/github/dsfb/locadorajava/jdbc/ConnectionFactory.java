package com.github.dsfb.locadorajava.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcConnectionPool;

public class ConnectionFactory {
	private JdbcConnectionPool cp = JdbcConnectionPool.
	    create("jdbc:h2:~/test;SCHEMA=PUBLIC", "sa", "sa");
	
	public Connection getConnection() throws SQLException {
		return cp.getConnection();
	}
	
	public void dispose() {
		cp.dispose();
	}
}
