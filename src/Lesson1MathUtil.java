import java.util.Scanner;
public class Lesson1MathUtil {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which method to use");
        String test = scanner.nextLine();

        if(test.equalsIgnoreCase("min")) {
            System.out.println("Please enter first number");
            int a = scanner.nextInt();
            System.out.println("Please enter second number");
            int b = scanner.nextInt();
            System.out.println("Min value: " + min(a, b));
        }
        else if(test.equalsIgnoreCase("max")) {
            System.out.println("Please enter first number");
            int a = scanner.nextInt();
            System.out.println("Please enter second number");
            int b = scanner.nextInt();
            System.out.println("Max value: " + max(a, b));
        }
        else if(test.equalsIgnoreCase("abs")) {
            System.out.println("Please enter number");
            int a = scanner.nextInt();
            System.out.println("Absolute value: " + abs(a));
        }
        else if(test.equalsIgnoreCase("isEven")) {
            System.out.println("Please enter number");
            int a = scanner.nextInt();
            System.out.println("Even value: " + isEven(a));
        }
        else if(test.equalsIgnoreCase("minOfThree")) {
            System.out.println("Please enter first number");
            int a = scanner.nextInt();
            System.out.println("Please enter second number");
            int b = scanner.nextInt();
            System.out.println("Please enter third number");
            int c = scanner.nextInt();
            System.out.println("Min value: " + minOfThree(a, b, c));
        }
        else if(test.equalsIgnoreCase("maxOfThree")) {
            System.out.println("Please enter first number");
            int a = scanner.nextInt();
            System.out.println("Please enter second number");
            int b = scanner.nextInt();
            System.out.println("Please enter third number");
            int c = scanner.nextInt();
            System.out.println("Max value: " + maxOfThree(a, b, c));
        }



        //System.out.println(min(5, 7));
        //System.out.println(max(5,7));
        //System.out.println(abs(-30));
        //System.out.println(isEven(3));
        //System.out.println(min(2, 5, 7));
        //System.out.println(max (44, 34, 7));
    }

    public static int min(int a, int b){
        // TODO tagasta a ja b väikseim väärtus

        if (a>b){
            return b;
        }
        else{
            return a;

        }
    }

    public static int max(int a, int b){
        // TODO tagasta a ja b suurim väärtus
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int abs(int a){
        // TODO tagasta a absoluut arv
        int aAbsolute;
        if (a<0) {
            a = -a;
            aAbsolute = a;
        }
        else{
            aAbsolute = a;
        }
        return aAbsolute;
    }

    public static boolean isEven(int a){
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        if (a%2==0){
            return true;
        }
        return false;
    }

    public static int minOfThree(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a<=b && a<=c){
            return a;
        }
        else if (b<=a && b<=c){
            return b;
        }
        return c;

    }

    public static int maxOfThree(int a, int b, int c){
        // TODO tagasta a, b ja c suurim väärtus
        if (a>=b && a>=c){
            return a;
        }
        else if (b>=a && b>=c){
            return b;
        }
        return c;
    }

}
