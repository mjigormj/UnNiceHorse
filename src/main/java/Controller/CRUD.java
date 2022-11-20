package Controller;

import Model.Stock;
import Model.User;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CRUD {

    public static void insertInTableUsuario(String userName, String email, String passwd) throws SQLException {
        if (!verifyIfExistsInTable("usuario", "email", email)) {
            Connection con;
            con = Conector.conect();
            String sql = "insert into usuario(user_name, email, passwd) values ('" + userName + "' , '" + email + "', '" + passwd + "');";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma conta com o email: " + email, "Usuario já cadastrado", JOptionPane.ERROR_MESSAGE);
        }

    }

    //insere valores na tabela Carteira
    public static void insertInTableCarteira(String stockName, int qtdStock, Double valorPago) throws SQLException {
        Connection con;
        con = Conector.conect();
        String sql = "insert into carteira(nmTitulo, qtdTitulo, valorPago) values ('" + stockName + "' , " + qtdStock + ", " + valorPago + ");";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.executeUpdate();

        stmt.close();
        con.close();
    }
    
    //Adicionar dinheiro na tabela
    public static void updateInTableCarteira(Double valor, String email) throws SQLException {
        Connection con;
        con = Conector.conect();

        PreparedStatement stmt = con.prepareStatement("update usuario set valor=" + valor + " where email ='" + email + "';");
        stmt.executeUpdate();     

        stmt.close();
        con.close();
    }
    
    //Remover dinheiro na tabela
    public static void sacarSaldoCarteira(String email) throws SQLException {
        Connection con;
        con = Conector.conect();

        PreparedStatement stmt = con.prepareStatement("update usuario set valor=" + 0 + " where email ='" + email + "';");
        stmt.executeUpdate();     

        stmt.close();
        con.close();
    }

    //retorna todos os valores da tabela Carteira em um ArrayList
    public static ArrayList<String> returnArrayFromTable() throws SQLException {
        Connection con;
        con = Conector.conect();
        PreparedStatement stmt = con.prepareStatement("select * from carteira;");
        ResultSet rs = stmt.executeQuery();

        ArrayList<String> array = new ArrayList();
        while (rs.next()) {
            System.out.println("titulo: " + rs.getString("nmTitulo"));
            array.add(rs.getString("nmTitulo"));
        }
        con.close();

        return array;
    }
    
        //retorna todos os valores da tabela Carteira em um ArrayList
        public static ArrayList<User> returnUsuarioFromTable(String email) throws SQLException, IOException {
        Connection con;
        con = Conector.conect();
        PreparedStatement stmt = con.prepareStatement("select * from usuario where emai" + email + ";");
        ResultSet rs = stmt.executeQuery();

        ArrayList<User> array = new ArrayList();
        System.out.println("titulo: " + rs.getString("user_name"));
        while (rs.next()) {
            User usuario = new User(
            rs.getString("user_name"),
            rs.getString("email"),
            rs.getString("passwd"),
            Double.parseDouble(rs.getString("valor")));
            array.add(usuario);
        }
        con.close();
        return array;
    }
        
    //retorna a quantidade de dinheiro do Usuario
    public static Double returnValorFromUserTable(String email) throws SQLException, IOException {
        Connection con;
        con = Conector.conect();
        Double valor = 0.0;
        PreparedStatement stmt = con.prepareStatement("select valor from usuario where email='" + email + "';");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            valor = Double.parseDouble(rs.getString("valor"));
        }
        con.close();
        return valor;
    }

    //verifica se existe o valor passado na tabela
    public static boolean verifyIfExistsInTable(String tableName, String columnName, String tableValue) throws SQLException {
        boolean thereValue;
        Connection con;
        con = Conector.conect();
        PreparedStatement stmt = con.prepareStatement("select * from " + tableName + " where " + columnName + " = '" + tableValue + "';");
        ResultSet rs = stmt.executeQuery();
        thereValue = rs.next();
        stmt.close();
        con.close();
        return thereValue;
    }
}
