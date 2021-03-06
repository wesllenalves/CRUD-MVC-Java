package crudmvc.model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author u843573
 */
public class UsuarioDao {

    Conexao conecta = new Conexao();
    //private final Connection conexao;
 PreparedStatement stmt =  null;
 ResultSet rs =  null;
 boolean check = false;

    //insere um registro de usuario no banco de dados...
    public void insere(String user, String password) {
        try {
            conecta.Conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO TB_USUARIO (USERNAME, PASSWORD) VALUES (?,?) ");
            pst.setString(1, user);
            pst.setString(2, password);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro inserido com sucesso.");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao inserir registro\n" + ex.getMessage());
        }

    }

    //insere um registro de usuario no banco de dados...
    public void excluir(String id) {
        Integer numero;
        try {
            numero = Integer.parseInt(id);
            
            conecta.Conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM TB_USUARIO WHERE  ID=  "+numero+" ");            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Excluido com sucesso.");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir registro\n" + ex.getMessage());
        }

    }
    
    //insere um registro de usuario no banco de dados...
    public void update(String id, String usuario, String senha) {
        Integer numero;
        try {
            numero = Integer.parseInt(id);          
            
            conecta.Conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE TB_USUARIO SET USERNAME =? WHERE  ID=  "+id+" "); 
            pst.setString(1, usuario);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro Atualizado com sucesso.");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao Atualizado registro\n" + ex.getMessage());
        }

    }
    public boolean checkUsuario(String usuario) {
        
        try {                  
            
            conecta.Conexao();
            stmt = conecta.conn.prepareStatement("SELECT * FROM TB_USUARIO WHERE USERNAME=?");     
            stmt.setString(1, usuario);
            rs = stmt.executeQuery();
            
            while(rs.next()){                
                check = true;            
            }
            
            
            
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao Atualizado registro\n" + ex.getMessage());
        }
        
        return check;

    }

    /*
    Vai no banco de dados tentando localizar todos os registros e 
    retorna uma lista de objetos do tipo usuário.
     */
//    public List<Usuario> lista(String user, String password) {
//        List<Usuario> usuarios = new ArrayList<Usuario>();
//        try {
//            ps = conexao.prepareStatement("SELECT * FROM TB_USUARIO");
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                usuarios.add(new Usuario(rs.getString("USERNAME"), rs.getString("PASSWORD")));
//            }
//
//            return usuarios;
//        } catch (Exception e) {
//            System.out.println("Erro ao listar registros.");
//        }
//
//        return null;
//    }

    /*
    public static void main(String[] args)
    {
        Usuario u = new Usuario("joao", "123");
        
        UsuarioDao dao = new UsuarioDao();
        String msg = dao.insere(u);
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        UsuarioDao dao = new UsuarioDao();
        List<Usuario> usuarios = dao.lista();
        for (Usuario uu: usuarios) {
            System.out.println( uu.getUser() + " " + uu.getPassword() );
        }
    }
     */
}
