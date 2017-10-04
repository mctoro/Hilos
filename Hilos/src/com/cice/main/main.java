package com.cice.main;

import com.cice.imprimir.Imprimir;

public class main {
    
    
    public static void main(String[] args) {
        
        Imprimir imp1 = new Imprimir("1",3000);
        imp1.start();
        
        Imprimir imp2 = new Imprimir("2",1000);
        imp2.start();
    }

 
    
    
}
