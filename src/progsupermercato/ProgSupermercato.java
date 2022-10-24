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
        TesseraOro TO2 = new TesseraOro("sus","sus1");
        System.out.println(TO1.getNomeCliente());   
        System.out.println(TO2.getNomeCliente());
        System.out.println(TO1.getPunti());
        TO1.acquisto(120);
        System.out.println(TO1.getPunti());
        TO1.ritiraPremio();
        System.out.println(TO1.getPunti());
        TO1.acquisto();
        System.out.println(TO1.getPunti());
        TO1.ritiraPremio();
        System.out.println(TO1.getPunti());
    }
    
}
