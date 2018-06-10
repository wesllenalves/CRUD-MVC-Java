/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc.controller;

import crudmvc.model.Conexao;
import crudmvc.model.Usuario;
import crudmvc.model.UsuarioDao;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesllen
 */
public class UsuarioController {
    Conexao conecta = new Conexao();
    
    public boolean salvarUsuario(Usuario user){    

        UsuarioDao dao = new UsuarioDao();
         dao.insere(user.getUser(), user.getPassword());
         return true;
        
    }
    
//    public boolean listaUsuario(Usuario user){
//        
//        UsuarioDao dao = new UsuarioDao();
//        
//    
//    }
    
//    public static ArrayList<String[]> getUsuarios(){
//     ArrayList<String[]> Usuarios = new ArrayList();
//     ArrayList<Usuario> U = Usuario.getUsuario();
//     for(int i=0; i<U.size();i++){
//     String u[] = new String [2];
//     u[0] = U.get(i).getUser();
//     u[1] = U.get(i).getPassword();
//     }
//     
//     return Usuarios;
//    }
}
