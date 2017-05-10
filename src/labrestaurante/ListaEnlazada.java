/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrestaurante;

/**
 *
 * @author marvin
 */
public class ListaEnlazada {

    Nodo ptr;
    int tamaño;

    public ListaEnlazada() {
        ptr = null;
        tamaño = 0;

    }

    public Object obtener(int pos) {
        int cont = 0;
        Nodo temporal = ptr;
        while (cont < pos) {
            temporal = temporal.obtenersiguiente();
            cont++;
        }
        return temporal.obtenervalor();
    }

    public void addultimo(Object obj) {

        if (ptr == null) {
            ptr = new Nodo(obj);
        } else {
            Nodo temp = ptr;
            Nodo p = new Nodo(obj);
            while (temp.obtenersiguiente() != null) {
                temp = temp.obtenersiguiente();
            }
            temp.siguiente = p;
        }
        tamaño++;
    }

    public void mayormenor() {
        Nodo p = ptr;
        Nodo q = p.siguiente;
        Nodo antq = p;
        int cont = 0;

        while (q != null) {
            if (Integer.parseInt(p.obtenervalor().toString()) < Integer.parseInt(q.obtenervalor().toString())) {
                antq.enlazarSiguiente(q.obtenersiguiente());
                q.enlazarSiguiente(p);
                p = q;

            }
            q = antq.siguiente;
        }

    }

    public int tamaño() {
        return tamaño;
    }

    public void eliminar(int pos) {
        int cont = 0;
        Nodo p = ptr;

        if (pos == 0) {
            ptr = ptr.obtenersiguiente();
        } else {
            while (cont < pos - 1) {
                p = p.obtenersiguiente();

                cont++;
            }
            p.enlazarSiguiente(p.obtenersiguiente().obtenersiguiente());
        }
        tamaño--;
        int t = tamaño;

    }

    public void eliminarString(String elem) {

        Nodo p = ptr;
        Nodo q = p;
        String p1="";
        String q1="";
       
        p1=p.obtenervalor().toString();
        if (p.obtenervalor().equals(elem)) {
            ptr = ptr.obtenersiguiente();
            
        } else {
          
            while (!q.obtenersiguiente().obtenervalor().toString().equals(elem)) {
                q = q.obtenersiguiente();
                q1=q.obtenervalor().toString();
            }
            q.enlazarSiguiente(q.obtenersiguiente().obtenersiguiente());
            q1=q.obtenervalor().toString();
        }
        tamaño--;
    }
}
