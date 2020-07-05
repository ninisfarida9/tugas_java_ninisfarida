/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO 330
 */
public class Tugas_bufferedreader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
    String nama;
    String status;
    String suku;
    String hobi;
    String alamatrumah;
     //object InputStream
   InputStreamReader isr = new InputStreamReader (System.in);
   // object contoscanner
   BufferedReader br = new BufferedReader(isr);
   // mengisi veriabel nama dengan BufferedRider
   System.out.println("Siapa Nama Anda ?");
   nama = br.readLine();
   
   System.out.println("Apa status Anda ?");
   status = br.readLine();
   
   System.out.println(" apa Nama suku Anda ?");
   suku = br.readLine();
   
   System.out.println("apa hobi anda ?");
   hobi = br.readLine ();
   
   System.out.println("alamat rumah anda ?");
   alamatrumah = br.readLine();
   
   //tampilkan nama
   System.out.println("nama anda adalah ?" + nama);
   System.out.println("Apa status Anda ?" + status);
   System.out.println("apa nama anda ?" + suku);
   System.out.println("apa hobi anda ?" + hobi);
   System.out.println(" alamat rumah anda?" + alamatrumah);
   
   
   


           
    
}
}  


    
    

