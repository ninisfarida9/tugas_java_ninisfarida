/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO 330
 */
public class Tugas_JOptionPane {
    public static void main(String[] args) {
        
      String provinsi = JOptionPane.showInputDialog("di mana asal provinsi  anda?");
        System.out.println("provinsi anda di :" + provinsi);
    
      String baju = JOptionPane.showInputDialog("berapa jumlah baju koleksi anda?");
        System.out.println(" berapa jumlah baju koleksi anda? :" + baju);
        
      String tanggal =JOptionPane.showInputDialog("tanggal kelulusan anda?");
        System.out.println("berapa tanggal kelulusan :" + tanggal);
        
      String presiden = JOptionPane.showInputDialog("nama presiden di negara anda?");
        System.out.println("nama presiden di negara anda? :" +presiden);
         
      String restoran = JOptionPane.showInputDialog("di mana restoran favorit anda?");
        System.out.println("di mana restoran favorit anda? :" + restoran);
    
    }
}



