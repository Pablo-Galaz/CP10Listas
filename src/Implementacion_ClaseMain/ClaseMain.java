package Implementacion_ClaseMain;


//Pablo Galaz Molina  Tarea CP10_Listas

public class ClaseMain {

    public static void main(String[] args) {

        // crear una lista de String. Observar que se declara de tipo
        // interfaz y se crea con la clase. 
        // Es importante notar el uso de la genericidad.
        Lista<String> l = new ListaEnlazada<>();
        // se agregan tres elementos (cadenas en este caso) a la lista.
        l.add("uno");
        l.add("dos");
        l.add("tres");
        // Se obtiene un iterador de la lista y se imprime 
        // lo que hay en la lista
        Iterador<String> it = l.iter();
        int i = 1;
        while (it.hasNext()) {
            System.out.println("Elemento: " + i + "  " + it.next());
            i++;
        }
        System.out.println("-----");
        try {
            // se adiciona un elemento, ahora en una posición intermedia
            l.add(3, "a");
            // se vuelve a imprimir
            it = l.iter();
            i = 1;
            while (it.hasNext()) {
                System.out.println("Elemento: " + i + "  " + it.next());
                i++;
            }
            System.out.println("-----");
            // uso de varios métodos.
            System.out.println("Esta el dos? " + l.contains("dos"));
            System.out.println("Quien esta en la posicion 3 " + l.get(3));
            System.out.println("Eliminar el a");
            l.remove("a");
            // volver a imprimir
            it = l.iter();
            i = 1;
            while (it.hasNext()) {
                System.out.println("Elemento: " + i + "  " + it.next());
                i++;
            }
            System.out.println("-----");
            // eliminar un elemento de la lista
            System.out.println("Eliminar el segundo elemento");
            l.remove(2);
            // iterar para imprimir
            it = l.iter();
            i = 1;
            while (it.hasNext()) {
                System.out.println("Elemento: " + i + "  " + it.next());
                i++;
            }
            System.out.println("Esta vacia? " + l.isEmpty());
        } catch (PosicIncE e) {
            System.out.println("La posicion es incorrecta");
        } catch (ElemNoEncE e) {
            System.out.println("Elemento no encontrado");
        }
    }
}
