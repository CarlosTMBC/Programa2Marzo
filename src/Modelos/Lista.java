
package Modelos;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import javax.swing.JOptionPane;

public class Lista {
    Nodo primero;
    Nodo auxiliar;
    String cadena = "";
    
    public void Apilar(int dato)
    {
        Nodo nuevoNodo = new Nodo(dato);
        if(primero == null)
        {
            primero = nuevoNodo;
        }
        else
        {
            nuevoNodo.siguiente = primero;
            primero =nuevoNodo;
        }
        JOptionPane.showMessageDialog(null, "Nodo APILADO");
    }
    public String Listar()
    {
        auxiliar = primero;
        while(auxiliar!=null)
        {
            cadena = cadena + auxiliar.getDato();
            auxiliar = auxiliar.siguiente;
        }
        return "" ;
    }
}


