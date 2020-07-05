/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO 330
 */
public class Tugas_scanner {
   public static void main(String[] args) {
        int jarak = 0;
        int ukuran = 0;
        int tinggi = 0;
        int jauh = 0;
        int banyak = 0;
        
        //membuat scanner
        System.out.println("berapa umur nenek dan kakek anda?");
        Scanner inputUser = new Scanner(System.in);
        jarak = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("barapa ukuran baju anda?");
        inputUser = new Scanner(System.in);
        ukuran = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa tinggi bangunan kantor anda?");
        inputUser = new Scanner(System.in);
        tinggi= Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa jauh kamu mencari anjing mu yang hilang?");
        inputUser = new Scanner(System.in);
        jauh = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa banyak anak ayam yang di belakang rumah anda?");
        inputUser = new Scanner(System.in);
        banyak = Integer.parseInt(inputUser.nextLine());
        //output
        System.out.println("berapa usia kakek anda " + jarak);
        System.out.println("berapa tinggi anda " + ukuran);
        System.out.println("berapa lebar rumah anda" + tinggi);
        System.out.println("berapa jauh kamu berjalan " + jauh);
        System.out.println("berapa banyak kucing anda " + banyak);
        
    }
 
}

