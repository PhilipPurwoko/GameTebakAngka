package gametebakangka;
import java.util.Scanner;

public class Player {
    int tebak(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tebakan Anda : ");
        int tebakan = input.nextInt();
        return tebakan;
    }
}
