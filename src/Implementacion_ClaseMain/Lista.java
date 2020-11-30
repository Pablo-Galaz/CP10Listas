package Implementacion_ClaseMain;


public interface Lista<E> {
// añadir un objeto de tipo E en la posición index de la lista

    void add(int index, E element) throws PosicIncE;
// añadir un objeto de tipo E al final de la lista

    void add(E element);
// eliminar el elemento que está en la posición index, lo devuelve

    E remove(int index) throws PosicIncE;
//eliminar el objeto x de la lista

    void remove(E x) throws ElemNoEncE;
// contiene la lista el objeto x?

    boolean contains(E x);
//obtener el objeto que está en la posición index

    E get(int index) throws PosicIncE;
    // obtener el índice en el que está el objeto x

    int getIndex(E x);
// poner en la posicion index el elemento (cambia el que está)

    void set(int index, E element) throws PosicIncE;
// eliminar todos los elementos de la lista, limpiarla

    void clear();
// obtener un iterador de la lista

    Iterador iter();
// obtener el tamaño de la lista.

    int size();
// está la lista vacía?

    boolean isEmpty();
}
