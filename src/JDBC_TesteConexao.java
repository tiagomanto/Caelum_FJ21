import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_TesteConexao {

	public static void main(String[] args) throws SQLException {

		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "toor");
		System.out.println("Conectado!");
		conexao.close();

	}

}
