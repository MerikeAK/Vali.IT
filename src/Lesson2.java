import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        //exercise1();
        //exercise2(5);
        //exercise3(3, 3);
        //System.out.println(fibonacci(5));
        //exercise5();
        exercise7();
    }

    public static void exercise1() {
        // TODO loo 10 elemendile täisarvude massiv
        // TODO loe sisse konsoolist 10 täisarvu
        // TODO trüki arvud välja vastupidises järiekorras
        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            a[i] = number;
        }
        for (int b = a.length - 1; b > 0; b--) {
            System.out.println(a[b]);
        }
    }

    public static void exercise2(int x) {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10
        int abc = 0;
        for (int i = 0; i < 60; i += 2) {
            if (abc < x) {
                System.out.println(i + " ");
                abc += 1;
            }
        }

    }

    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
        int[][] multipTable = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print((i + 1) * (j + 1));
            }
            System.out.println(" ");
        }

    }

    public static int fibonacci(int n) {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int m = 0; m < fibonacci.length; m++) {
            System.out.print(fibonacci[m]);
        }
        System.out.println(" ");
        return fibonacci[n - 1];
        }

        public static void exercise5 () {
            // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
            //1. input n 2. print n 3. if n = 1 then STOP 4. if n is odd then n ←− 3n + 1 5. else n ←− n/2 6. GOTO 2

        }

        public static void exercise6 () {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */
        }

        public static void exercise7 () {
            // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
            BigDecimal a = new BigDecimal("1.89");
            BigDecimal b = new BigDecimal("394486820340");
            BigDecimal c = new BigDecimal("15");
            BigDecimal d = new BigDecimal("4");

            //res1 =b/c
            //res2=res1 - d
            //res3=a * res2

            BigDecimal res1 = b.divide(c, RoundingMode.DOWN);

            BigDecimal res2 = res1.subtract(d);

            BigDecimal res3 = a.multiply(res2);
            System.out.println(res3);



        }

        public static void exercise8 () {
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
        }

        public static void exercise9 () {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
        }

    }
