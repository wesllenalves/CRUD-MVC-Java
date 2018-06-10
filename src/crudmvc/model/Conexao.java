package crudmvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    
    private  String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private  String URL = "jdbc:derby://localhost:1527/sample";
    private  String USR = "app";
    private  String PWD = "app";
    public Statement stm;
    public Connection conn;
    public ResultSet rs;
    
    
    public void Conexao() {        
        try {
            System.setProperty("jdbc.Drivers", DRIVER);
            conn=DriverManager.getConnection(URL, USR, PWD);
            //JOptionPane.showMessageDialog(null, "conectado sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro de conexao" + ex.getMessage());
        }
        
                 
            
//        try {
//            Class.forName(DRIVER);
//            return DriverManager.getConnection(URL, USR, PWD);
//        } catch (Exception e) {
//            System.out.println("Erro ao conectar database");
//            System.out.println(e.getMessage());
//            return null;
//        }
    }
    
    public void executaSQL(String SQL){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro executa SQL\n" + ex.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            conn.close();            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao fechar conexao" + ex.getMessage());
        }
        //        Connection conn = Conexao.abreConexao();
//        if (conn != null)
//            System.out.println("OK conectado.");
//        
 }
}
