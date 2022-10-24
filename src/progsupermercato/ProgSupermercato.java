/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsupermercato;

/**
 *
 * @author gabriel.ricaldone
 */
public class ProgSupermercato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TesseraOro TO1 = new TesseraOro();
        TesseraOro TO2 = new TesseraOro("test4","test3");
        TesseraOro TO3 = new TesseraOro();
        Tessera T1 = new Tessera();
        Tessera T2 = new Tessera("test","test1");
        Tessera T3 = new Tessera();
              
        System.out.println(TO1.getNomeCliente());   
        System.out.println(TO2.getNomeCliente());
        System.out.println(TO3.getNomeCliente());
        
        System.out.println(T1.getNomeCliente());   
        System.out.println(T2.getNomeCliente());
        System.out.println(T3.getNomeCliente());
        
        System.out.println(TO1.getPunti());
        TO1.acquisto(120);
        System.out.println(TO1.getPunti());
        TO1.ritiraPremio();
        System.out.println(TO1.getPunti());
        TO1.acquisto();
        System.out.println(TO1.getPunti());
        TO1.ritiraPremio();
        System.out.println(TO1.getPunti());
        
        System.out.println(T1.getPunti());
        T1.acquisto(120);
        System.out.println(T1.getPunti());
        T1.ritiraPremio();
        System.out.println(T1.getPunti());
        T1.acquisto();
        System.out.println(T1.getPunti());
        T1.ritiraPremio();
        System.out.println(T1.getPunti());
    }
    
}
