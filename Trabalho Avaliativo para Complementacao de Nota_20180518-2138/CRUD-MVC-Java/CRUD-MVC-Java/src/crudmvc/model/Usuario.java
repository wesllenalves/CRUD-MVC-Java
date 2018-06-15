package crudmvc.model;

/*
 * Representa um usuário no aplicativo. 
 */
public class Usuario {
    private String user;
    private String password;
    
    public static final String INSERE = " INSERT INTO TB_USUARIO (USERNAME, PASSWORD) VALUES (?,?) ";
    public static final String LISTA_TODOS = " SELECT * FROM TB_USUARIO ";
    
    
    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
}