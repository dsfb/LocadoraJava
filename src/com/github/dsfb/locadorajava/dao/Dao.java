package com.github.dsfb.locadorajava.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	private Connection conn;

	public Dao(Connection conn) {
		this.conn = conn;
	}

	public boolean createNonExistentTables() {
		try {
			Statement st = conn.createStatement();
			// st.execute("create table customer(id integer, name varchar(10))");
			st.execute("CREATE TABLE IF NOT EXISTS filme(id INTEGER, id_cliente INTEGER, name VARCHAR(128), preco FLOAT)");
			/*
	        st.execute("insert into customer values (1, 'Thomas')");
	        Statement stmt = conn.createStatement();
	        ResultSet rset = stmt.executeQuery("select name from customer");
	        while (rset.next()) {
	            String name = rset.getString(1);
	            System.out.println(name);
	        }
	        */
			st.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}
