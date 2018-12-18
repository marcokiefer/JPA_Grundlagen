import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main {

	public static void main(String[] args) {
		System.out.println("JPA-Grundlagen");

		// Tabelle in Datanbank erzeugen
		
		// Verbindung zur Datanbenk
		String datenbank = "jdbc:mysql://localhost:3306/labor?useSSL=false";
		String user = "professor";
		String passwort = "labor1";
		try {
			Connection connection = DriverManager.getConnection(datenbank, user, passwort);
			System.out.println("Verbindung steht");
			String sql = "CREATE TABLE IF NOT EXISTS MAUS(ID CHAR(36), NAME VARCHAR(100), LABORNUMMER INT, TOT BOOL)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.executeUpdate();
			statement.close();
			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
