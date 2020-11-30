package Implementacion_ClaseMain;


public class Nodo<E> {

    private E info;
    private Nodo<E> next;

    public Nodo(E info, Nodo<E> next) {
        this.info = info;
        this.next = next;
    }
    public Nodo(E info) {
        this(info, null);
    }
// metodos getter y setter

    public E getInfo() {
        return info;
    }

    public Nodo<E> getNext() {
        return next;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }
    
}
