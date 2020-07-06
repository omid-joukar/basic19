import java.util.Scanner;

/**
 * Created by KPS on 7/6/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a decimal number");
        int decimal = scanner.nextInt();
        int reminder =0,i = 0;
        int[] sum = new int[20];
        while (decimal!=0){
            sum[i++]=(decimal%2);
            decimal = decimal/2;
        }
        i--;
        while (i>=0){
            System.out.print(sum[i--]);
        }
    }
}
