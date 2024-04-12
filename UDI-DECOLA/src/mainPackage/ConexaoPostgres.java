package mainPackage;

import java.sql.*;
import java.util.ArrayList;

public class ConexaoPostgres {

    public static void main(String a[]) {
        String url = "jdbc:postgresql://localhost:5432/public";
        String user = "postgres";
        String password = "lilo181d";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK");

            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();

            // Cria a tabela Cliente
            String createTableQuery = "CREATE TABLE Cliente ("
                    + "id SERIAL PRIMARY KEY,"
                    + "nome VARCHAR(100),"
                    + "cpf VARCHAR(14),"
                    + "endereco VARCHAR(255),"
                    + "data_nascimento DATE,"
                    + "email VARCHAR(100)"
                    + ")";
            stmt.executeUpdate(createTableQuery);
            System.out.println("Tabela Cliente criada com sucesso.");

            String insertQuery = "INSERT INTO Cliente (nome, cpf, endereco, data_nascimento, email) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            ArrayList<Cliente> clientes = new ArrayList<>();
            clientes.add(new Cliente("João", "123.456.789-00", "Rua A", "1990-01-01", "joao@example.com"));
            clientes.add(new Cliente("Maria", "987.654.321-00", "Rua B", "1995-05-10", "maria@example.com"));



        } catch (ClassNotFoundException e) {
            System.out.println("Erro no driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }
    }
}
