/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc.view;

import java.util.Locale;

/**
 *
 * @author u843573
 */
public class Main
{
    
    public static void main(String[] args)
    {
        ViewMenu menu = new ViewMenu();
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        //menu.setExtendedState(ViewMenu.MAXIMIZED_BOTH);        
        menu.setVisible(true);
    }
    
}
