/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsupermercato;

import java.util.Scanner;

/* CLASSE BASE TESSERA
Un supermercato fornisce ai suoi clienti una tessera che consente di accumulare punti in base alle spese effettuate. Il cliente può scegliere in un catalogo vari premi, ciascuno dei quali "costa" un certo numero di punti. Realizzare la classe Tessera che memorizza codice e nome del cliente, numero di punti accumulati (al rilascio della tessera viene assegnato un punteggio di partenza di 10 punti). Realizzare i seguenti metodi:
1. Costruttore per inizializzare gli attributi (autogestito)
2. "acquisto" riceve come parametro l'importo della spesa e incrementa il punteggio di 1 punto ogni 10 euro di spesa.
3. "ritiraPremio" riceve come parametro il numero di punti associati al premio e li scala dal punteggio accumulato.
4. metodi set e get*/
/**
 *
 * @author gabriel.ricaldone
 */
public class Tessera {
    protected int punti;
    protected String nomeCliente;
    protected String codiceCliente;
    Scanner input = new Scanner(System.in);
    
    Tessera(String nomeCliente, String codiceCliente) {
        this.nomeCliente = nomeCliente;
        this.codiceCliente = codiceCliente;
        punti = 10;
    }
    
    Tessera() {
        System.out.println("Mi dia il nome del cliente");
        this.nomeCliente = input.nextLine();
        System.out.println("Mi dia il codice del cliente");
        this.codiceCliente = input.nextLine();
        punti = 10;
    }
    
    public void acquisto(int importo) {
        punti += importo / 10;
    }
    
    public void acquisto() {
        int importo = -1; 
        System.out.println("Quanto ha speso?");
        do {
            importo = input.nextInt();
        } while(importo < 0);
        punti += importo / 10;
    }
    
    public void ritiraPremio (int scelta) {
        int premi[] = {5,10,15,20,25};
        switch (scelta) {
            case 1:
                if (punti >= premi[0]) {
                    punti -= premi[0];
                }
                break;
            case 2:
                if (punti >= premi[1]) {
                    punti -= premi[1];
                }
                break;
            case 3:
                if (punti >= premi[2]) {
                    punti -= premi[2];
                }
                break;
            case 4:
                if (punti >= premi[3]) {
                    punti -= premi[3];
                }
                break;
            case 5:
                if (punti >= premi[4]) {
                    punti -= premi[4];
                }
                break;
            default:
                System.out.println("Errore durante il ritiro del premio, riprovare");
                break;
        }
    }
   
    public void ritiraPremio () {
        int premi[] = {5,10,15,20,25};
        System.out.println("Quale premio vuole? (1. valore:" + premi[0] + "| 2. valore: " + premi[1] + "| 3. valore: " + premi[2] + "| 4. valore: " + premi[3] + "| 5. valore: " + premi[4] + ")");
        System.out.println("Punti attuali: " + punti);
        int scelta = input.nextInt(); 
        switch (scelta) {
            case 1:
                if (punti >= premi[0]) {
                    punti -= premi[0];
                }
                break;
            case 2:
                if (punti >= premi[1]) {
                    punti -= premi[1];
                }
                break;
            case 3:
                if (punti >= premi[2]) {
                    punti -= premi[2];
                }
                break;
            case 4:
                if (punti >= premi[3]) {
                    punti -= premi[3];
                }
                break;
            case 5:
                if (punti >= premi[4]) {
                    punti -= premi[4];
                }
                break;
            default:
                System.out.println("Errore durante il ritiro del premio, riprovare");
                break;
        }
    }
    
    public int getPunti() {
        return punti;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public String getCodiceCliente() {
        return codiceCliente;
    }
   
    
    public void setPunti(int punti) {
        this.punti = punti;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }
}
