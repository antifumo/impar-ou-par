import java.util.Scanner;

public class App {
   public static void main(String[] args){
        String input = "";
        int number = 0;
        System.out.println(" um numero aqui" );
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        number = Integer.parseInt(input);
        if (number % 2 == 0){
            System.out.println("O numero " + number + " e par");
        } else {
            System.out.println("O numero " + number + " e impar");
        }
    }
}
