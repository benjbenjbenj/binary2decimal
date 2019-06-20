import java.util.Scanner;

public class Binary2decimal {
    public static void main (String[] args) {
        boolean on=true;
        while (on) {
            Scanner inn = new Scanner(System.in);
            System.out.println("Insert binary number (max 8 chars): ");

            String input = inn.next();

            int decimal = 0;
                for(int i = 0; i<input.length();i++){
                    char e = input.charAt(i);
                    if (e=='1'){
                        decimal +=Math.pow(2,(input.length()-i-1));
                    }
                }
            
            System.out.println(decimal);

        }
    }
}
