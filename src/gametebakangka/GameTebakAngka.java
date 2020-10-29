package gametebakangka;

import java.util.Random;

public class GameTebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        Player player = new Player();
        int angkaDicari = random.nextInt(100 - 1) + 1;
        
        System.out.println("Halo ! Silakan tebak angka yang sudah saya siapkan dari 1-100");
        boolean done = false;
        
        while (done == false){
            int tebakan = player.tebak();
            if (tebakan == angkaDicari){
                System.out.println("Tebakan Anda benar !");
                done = true;
            } else if (tebakan > angkaDicari){
                System.out.println("Angka terlalu besar, coba lagi !");
            } else if (tebakan < angkaDicari){
                System.out.println("Angka terlalu kecil, coba lagi");
            }
        }
    }
    
}
