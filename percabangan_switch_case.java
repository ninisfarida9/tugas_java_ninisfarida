/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author LENOVO 330
 */
public class percabangan_switch_case {
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
         String kelompok = "melati 03";
         
                 switch(kelompok){
            case "mawar 02" :
                System.out.println("mawar 02");
            case"melati 03"    :
                System.out.println("melati 03");
            case"anggrek 01"   :
                System.out.println("anggrek 01");
            default :
                System.out.println("tidak punya nama atau anggota kelompok");
                break;
                    
            
        }
        
    }
    
}


 

