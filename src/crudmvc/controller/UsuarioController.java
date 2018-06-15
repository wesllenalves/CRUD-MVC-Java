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

    public boolean salvarUsuario(Usuario user) {

        UsuarioDao dao = new UsuarioDao();
        dao.insere(user.getUser(), user.getPassword());
        return true;

    }

    public boolean excluir(String usuario, String id) {

        UsuarioDao dao = new UsuarioDao();
        dao.excluir(id);
        return true;
    }

    public boolean atualizar(Usuario user, String id) {
        UsuarioDao dao = new UsuarioDao();        
        dao.update(id, user.getUser(), user.getPassword());
            
         return true; 
    }

}
