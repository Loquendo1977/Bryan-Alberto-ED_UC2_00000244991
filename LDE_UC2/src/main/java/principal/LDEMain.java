package principal;

import itson.lde_uc2.LDE;


public class LDEMain {

    public static void main(String[] args) {
        LDE instance = new LDE();
        instance.agregarInicio(10);
        instance.agregarInicio(20);
        instance.agregarInicio(30);
        instance.agregarInicio(40);
        instance.agregarInicio(50);
        instance.agregarFinal(1000);
        instance.agregarFinal(2000);
        System.out.println("LDE: " + instance.toString());
        System.out.println("Contiene 21? " + instance.contiene(21));
        System.out.println("Esta vacia?? " + instance.estaVacia());
        System.out.println("Tamano " + instance.tamaño());
    }
    
}
