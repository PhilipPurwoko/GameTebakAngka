package gametebakangka;
import java.util.Scanner;

public class Player {
    int score = 100;
    int totalTebak = 1;
    
    int tebak(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tebakan Anda : ");
        int tebakan = input.nextInt();
        ++this.totalTebak;
        return tebakan;
    }
    
    void kurangi(){
        this.score -= 2;
    }
    
    void bonus(){
        this.score += 50;
    }
    
    boolean ok(){
        boolean status = this.score > 0;
        return status;
    }
}
