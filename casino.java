package latihan.pkg10.pplg.pkg2.Casino;

import java.util.Scanner;
import java.util.*;
public class casino {
    public static void main(String[] args) {
        Random r;
       Scanner scan = new Scanner(System.in);
       String namaLengkap= "";
       
        System.out.println("Selamat datang di Java Casino!");
        System.out.print("Sebutkan nama anda : ");
        namaLengkap = scan.nextLine();
        
        Scanner scaner = new Scanner(System.in); // namaPanggilan diisi dengan inputan user
        // buat var kosong
        int umur;      
        // dialog
        System.out.print("Berapa umur anda? : ");
        // assign variabel menggunakan Scanner
        umur = scan.nextInt();
        
        if (umur >= 18) {
            System.out.println("Kamu sudah cukup umur! Untuk bermain, kamu harus deposit uang terlebih dahulu");
            
            Scanner scaner2 = new Scanner(System.in); // namaPanggilan diisi dengan inputan user
            // buat var kosong
            String token = "";      
            // dialog
            System.out.print("Kami ada tawaran.");
            // assign variabel menggunakan Scanner
            token = scan.nextLine();
            
            Scanner scaner1 = new Scanner(System.in); // namaPanggilan diisi dengan inputan user
            // buat var kosong
            String beliToken ="";      
            // dialog
            System.out.print(" Kamu bisa membeli 500 token dengan harga 50 Dollar, apakah kamu ingin membeli nya? (ketik IYA jika mau dan TIDAK jika tidak mau) : ");
            beliToken = scan.nextLine();
            
            if (beliToken == "IYA") {
            
            } else {
                
            }
        } else {
            System.out.println("Sayang sekali, kamu belum cukup umur untuk bermain di Casino :v ");
        }
        
    }
}
