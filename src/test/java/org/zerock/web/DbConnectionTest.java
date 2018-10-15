package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DbConnectionTest {
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:[ip]:5432/dbname";
	private static final String USER = "username";
	private static final String PW = "pw";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
