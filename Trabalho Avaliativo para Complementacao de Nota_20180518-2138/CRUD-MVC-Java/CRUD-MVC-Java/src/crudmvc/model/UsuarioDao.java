package crudmvc.model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author u843573
 */
public class UsuarioDao
{
    private Connection conexao; 
    private PreparedStatement ps;
    private ResultSet rs;
    
    public UsuarioDao() 
    {
        conexao = Conexao.abreConexao();
    }
    
    //insere um registro de usuario no banco de dados...
    public String insere(Usuario obj) 
    {
        String msg = "Registro inserido com sucesso.";
        try
        {
            ps = conexao.prepareStatement(Usuario.INSERE);
            ps.setString(1, obj.getUser());
            ps.setString(2, obj.getPassword());
            ps.executeUpdate();
        }
        catch (Exception e) 
        {
            System.out.println("Erro ao inserir registro");
            msg = "Erro ao inserir registro";
        }
        
        return msg;
    }    
    
    /*
    Vai no banco de dados tentando localizar todos os registros e 
    retorna uma lista de objetos do tipo usuário.
    */
    public List<Usuario> lista()
    {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try
        {
            ps = conexao.prepareStatement(Usuario.LISTA_TODOS);
            rs = ps.executeQuery();
            while (rs.next())
            {
                usuarios.add( new Usuario(rs.getString("USERNAME"), rs.getString("PASSWORD")) );
            }

            return usuarios;
        }
        catch(Exception e) 
        {
            System.out.println("Erro ao listar registros.");
        }
        
        return null;
    }
    
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


