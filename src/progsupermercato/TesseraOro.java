/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* SOTTOCLASSE TESSERAORO
l posto della normale tessera può essere rilasciata al cliente una speciale tessera “Oro” del tutto analoga alla precedente eccetto per il fatto che:
1. non riceve punti omaggio al momento del rilascio
2. per tutti gli importi superiori ai 100 euro il cliente riceve 2 punti ogni 10 euro di spesa.
*/

package progsupermercato;

/**
 *
 * @author gabriel.ricaldone
 */
public class TesseraOro extends Tessera {
    TesseraOro(String nomeCliente, String codiceCliente) {
        super(nomeCliente,codiceCliente);
        punti = 0;
    }
    
    TesseraOro() {
       super();
       punti = 0;
    }
}