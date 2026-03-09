package no.hvl.dat107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static no.hvl.dat107.Databaseoppsett.*;

public class Main2_UsingPersonObjects {

	public static void main(String[] args) throws ClassNotFoundException {
		
		List<Person> personer = new ArrayList<>();
		
		String sql = "SELECT id, navn FROM forelesning1.person";

		Class.forName(JDBC_DRIVER);
		
		System.out.println("Kobler til database...");
		try (Connection conn = DriverManager.getConnection(DB_URL, BRUKERNAVN, PASSORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				Person p = new Person();
				p.setId(rs.getInt("id"));
				p.setNavn(rs.getString("navn"));
				personer.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resultat:");
		for (Person p : personer) {
			System.out.println(p);
		}
		
		System.out.println("Ferdig!");
	}

}
