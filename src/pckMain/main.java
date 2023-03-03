/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckMain;

import Controladores.NodoController;
import Vistas.*;
import Modelos.*;

/**
 *
 * @author umg
 */
public class main {
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmNodos VistaNodos = new frmNodos(VistaPrincipal,true);
        Lista NuevaLista = new Lista();
        
        NodoController Nuevocontrolador = new NodoController(VistaPrincipal,VistaNodos,NuevaLista);
    }
}
