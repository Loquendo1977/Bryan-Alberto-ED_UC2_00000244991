package itson.lesc_uc2_00000244991;

import lesc.LESC;

public class LESC_UC2_00000244991 {

    public static void main(String[] args) {
        LESC instance = new LESC();
        instance.addFirst(1);
        instance.addFirst(2);
        instance.addFirst(3);
        instance.addFirst(4);
        instance.addFirst(5);
        instance.addFirst(6);
        System.out.println("LESC: " + instance.toString());
        System.out.println("Esta vacio? " + instance.isEmpty());
        System.out.println("Tiene un 4? " + instance.contains(4));
        System.out.println("Tamano " + instance.size());
    }
}
