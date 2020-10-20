/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5KambingGlobal;

/**
 *
 * @author Aris Prabowo
 * IF 10K
 * 10119914
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    int jumlahKambing = 88;
    
    public void getJumlahKambing()
    {
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        Main kambingSusu = new Main();
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
    }
    
}
