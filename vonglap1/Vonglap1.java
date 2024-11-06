
package vonglap1;

import java.util.Random;
import java.util.Scanner;

public class Vonglap1 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int numberToGuess = random.nextInt(50) + 1;
            
            int guess = 0;
            
            while (guess != numberToGuess) {
                System.out.print("Doan so giua 1 and 50: ");
                
                guess = scanner.nextInt();
                
                if (guess < numberToGuess) {
                    System.out.println("So cua ban lon hon.");
                } else if (guess > numberToGuess) {
                    System.out.println("So cua ban nho hon.");
                } else {
                    System.out.println("Chuc mung ban da doan dung so!");
                }
            }
        }
    }
}
    
    

