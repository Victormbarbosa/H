/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_final_valeriaosoriovictorbarbosa;

/**
 *
 * @author Victor
 */
public class ListaCola {

    Node frente;
    Node fin;

    public ListaCola() {
        frente = fin = null;
    }

    public void insertar(String elemento) {
        Node a;
        a = new Node(elemento);
        if (colaVacia()) {
            frente = a;
        } else {
            fin.link = a;
        }
        fin = a;
    }
    
    public void ShowList(){
        Node p=frente;
        while(p!=null){
            System.out.println(""+p.info);
            p=p.link;
        }
    }
    
    public String quitar() {
        String aux;
        if (!colaVacia()) {
            aux = frente.info;
            frente = frente.link;

        } else {
            return "";
        }
        return aux;
    }

    public void borrarCola() {
        while (frente != null) {
            frente = frente.link;
        }

    }

    public boolean colaVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }
}
