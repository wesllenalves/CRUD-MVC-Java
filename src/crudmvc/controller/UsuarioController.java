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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesllen
 */
public class UsuarioController {

    Conexao conecta = new Conexao();

    public boolean salvarUsuario(Usuario user) {
        if((user.getUser().equals("")) || (user.getPassword().equals(""))){
        JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
        return false;
        }      
        
        UsuarioDao dao = new UsuarioDao();        
       if( dao.checkUsuario(user.getUser())){
       JOptionPane.showMessageDialog(null, "Usuario já cadastrado por favor coloque outro");
       }else{  
        dao.insere(user.getUser(), user.getPassword());
       }
        return true;

    }

    public boolean excluir(String usuario, String id) {

        UsuarioDao dao = new UsuarioDao();
        dao.excluir(id);
        return true;
    }

    public boolean atualizar(Usuario user, String id) {
        if((user.getUser().equals("")) || (user.getPassword().equals(""))){
        JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
        return false;
        }
        UsuarioDao dao = new UsuarioDao();        
       if( dao.checkUsuario(user.getUser())){
       JOptionPane.showMessageDialog(null, "Usuario já cadastrado por favor coloque outro");
       }else{ 
        dao.update(id, user.getUser(), user.getPassword());
       }
            
         return true; 
    }

}
