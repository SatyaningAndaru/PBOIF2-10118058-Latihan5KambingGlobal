/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118058.latihan5;

/**
 *
 * @author user
 */
class PBOIF210118058Latihan5Global {
    public void tambahKambing(){
 
     //deklarasi variabel
     int jumlahKambing = 0;
     
     jumlahKambing = jumlahKambing + 5;
     
     
     System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing );
     }
  
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210118058Latihan5Global kambingJantan = new PBOIF210118058Latihan5Global();
        kambingJantan.tambahKambing();
    }

    void getJumlahKambing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  } 
}
