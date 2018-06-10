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
//    private PreparedStatement ps;
    private ResultSet rs;

   

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
