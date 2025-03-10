package ed_uc2;

/**
 *
 * @author LENOVO
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazadaSimple instance = new ListaEnlazadaSimple();
        instance.addFirst(22);
        System.out.println(instance.getElement(0));
        System.out.println(instance.contains(11));
        instance.addLast(11);
        instance.removeLast();
        System.out.println(instance.size());
        System.out.println(instance.isEmpty());
        System.out.println(instance.toString());
    }
    
}
