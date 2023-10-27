import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        String sing = strings [1];
        int num1 = Integer.parseInt(strings[0]);
        int num2 = Integer.parseInt(strings[2]);
        double res = 0;
        if( num1<1 || num1>10 || num2<1 || num2>10 || strings.length !=3){
            throw new Exception();
        }
        if (sing.equals("+")){
            res = num1 + num2;
        }
        else if (sing.equals("-")){
            res = num1 - num2;
        }
        else if (sing.equals("*")){
            res = num1 * num2;
        }
        else if (sing.equals("/")){
            res = (double) num1 / num2;
        }
        else {
            throw new Exception();
        }
        System.out.println(res);






    }
}