package itson.ldec_uc2_00000244991;

import ldec.LDEC;

public class LDEC_UC2_00000244991 {

    public static void main(String[] args) {
        LDEC instance = new LDEC();
        instance.addFirst(10);
        instance.addFirst(20);
        instance.addFirst(30);
        instance.addFirst(40);
        instance.addFirst(50);
        
        System.out.println("LDEC: " + instance.toString());
        System.out.println("Esta vacia? : " + instance.isEmpty());
        System.out.println("tamano: " + instance.size());
        System.out.println("Tiene 15? " + instance.contains(15));
    }
}
