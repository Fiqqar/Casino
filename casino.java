package latihan.pkg10.pplg.pkg2.Casino;

import java.util.Scanner;
import java.util.*;
import java.util.Random;
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
            
            switch (beliToken) {
                case "TIDAK" :
                    System.out.println("Oke, Selamat Tinggal!");
                case "IYA" :
                    int coken = 500;
                    
                    System.out.println("Baik, Token mu sekarang ada " + coken);
                    
                    Scanner scaner3 = new Scanner(System.in); // namaPanggilan diisi dengan inputan user
                    // buat var kosong
                    int taruhan; 
                    // dialog
                    System.out.println("Kamu hanya ada 1 kesempatan untuk taruhan token mu");
                    System.out.print("Kamu ada " + coken + " Token, berapa yang akan kamu taruh untuk Casino? : ");
                    taruhan = scan.nextInt();
                    if (taruhan > coken) {
                        System.out.println("Uang mu tidak cukup! btw makasih uang nya karena kami tidak akan mengembalikan uang mu :v ");
                    } else {
                        Scanner scaner4 = new Scanner(System.in); // namaPanggilan diisi dengan inputan user
                        // buat var kosong
                        int bet;      
                        // dialog
                        System.out.print("Pilih angka 1 sampai 5 : ");
                        bet = scan.nextInt();
                        
                         Random random = new Random();

                         // Menghasilkan angka acak dalam rentang 0 hingga 99 (0-99)
                         int hasil = random.nextInt(5) + 1; 
                         
                         if (bet == hasil) {
                             int menang = coken * 2;
                             System.out.println("WOW kamu menang! angka nya adalah " + hasil + ". token mu di kali dua! jadi token mu sekarang ada " + menang);
                             System.out.println("Sayang sekali, tapi kamu hanya bisa bertaruh sekali. Selamat Tinggal!");
                         } else {
                             int kalah = coken - taruhan;
                             System.out.println("WADUH, kamu kalah! angka nya adalah " + hasil + ". token mu dikurang " + taruhan + " jadi token mu sisa " + kalah);
                             System.out.println("Sayang sekali, tapi kamu hanya bisa bertaruh sekali. Selamat Tinggal!");
                         }
                    }
                
            }
        } else {
            System.out.println("Sayang sekali, kamu belum cukup umur untuk bermain di Casino :v ");
        }
        
    }
}
