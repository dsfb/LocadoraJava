package com.github.dsfb.locadorajava.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcConnectionPool;

public class ConnectionFactory {
	private static JdbcConnectionPool cp = JdbcConnectionPool.
	    create("jdbc:h2:~/test", "sa", "sa");
	
	public Connection getConnection() throws SQLException {
		return cp.getConnection();
	}
}
