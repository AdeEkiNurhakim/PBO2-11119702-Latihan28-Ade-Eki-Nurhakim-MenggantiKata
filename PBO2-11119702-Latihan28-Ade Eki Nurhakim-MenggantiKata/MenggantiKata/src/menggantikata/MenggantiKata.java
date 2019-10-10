/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menggantikata;

import java.util.Scanner;

/**
 *
 * @author Ekiw
 */
public class MenggantiKata {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Masukkan Kalimat \t : ");
       String kalimat = input.nextLine();
       StringBuffer pretelan = new StringBuffer(kalimat);
       
       System.out.print("Ganti Kata \t : ");
       String ganti = input.nextLine() ;
       
       int id = kalimat.indexOf(ganti);
       
       System.out.print("Kalimat Pengganti \t : ");
       String kalimat2 = input.nextLine();
       StringBuffer man = new StringBuffer (kalimat2);
       
        int id2 = ganti.length();
        pretelan.delete(id,id+id2);
        pretelan.insert(id,man);
        
         System.out.print("Menjadi \t : ");
         System.out.print(pretelan.toString());
               }
}