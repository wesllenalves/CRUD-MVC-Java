package crudmvc.model;

import static com.sun.org.apache.regexp.internal.RETest.test;
import static jdk.nashorn.internal.objects.NativeRegExp.test;



/*
 * Representa um usuário no aplicativo. 
 */
public class Usuario {
    private String user;
    private String password;
    
    public static final String INSERE = " INSERT INTO TB_USUARIO (USERNAME, PASSWORD) VALUES (?,?) ";
    public static final String LISTA_TODOS = " SELECT * FROM TB_USUARIO ";
    public static final String DELETE = " SELECT * FROM TB_USUARIO ";
    public static final String UPDATE = " SELECT * FROM TB_USUARIO ";
    
//    @test
//    public Usuario(String user, String password) {
//        this.user = user;
//        this.password = password;
//    }

    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
   
    
}