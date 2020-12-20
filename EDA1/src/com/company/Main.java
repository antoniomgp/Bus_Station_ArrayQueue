package com.company;

public class Main {

    public static void main(String[] args) {
        BusStop b23 = new BusStop();
        b23.chega_grupo( 14,14,3 );
        b23.chega_grupo( 14,18 ,2);
        System.out.println(b23.fila);
        b23.chegada_bus( 14,29,4 );
        b23.chegada_bus( 14,40,10 );
    }
}
