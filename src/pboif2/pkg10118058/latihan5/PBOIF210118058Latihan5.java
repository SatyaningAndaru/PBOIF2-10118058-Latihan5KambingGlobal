/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118058.latihan5;

/**
 *
 * @author user
 * Nama         :   Satyaning Andaru Bawalaksana
 * Nim          :   10118058
 * Kelas        :   PBOIF2
 * Deskripsi    :   Program ini berisi program menampilkan
 * Jenis-jenis tipe data bilangan bulat
 */
public class PBOIF210118058Latihan5 {

    /**
     * @param args the command line arguments
     */
    int jumlahKambing=88;
    
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing =" + jumlahKambing);   
        
    }
    
    public void tambahKambing(){
    
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah :" + jumlahKambing );
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210118058Latihan5 kambingSusu = new PBOIF210118058Latihan5();
        
        //
        kambingSusu.getJumlahKambing();
        
        //
        kambingSusu.tambahKambing();
        
        //
        kambingSusu.getJumlahKambing();
    }
    
}
