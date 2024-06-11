/**
 * Beispiele zur Vorlesung PRG2, VL1
 * Erläuterungen dazu in den Vorlesungsmaterialien
 * 
 * @autor Iris Hanheide, FHDW Paderborn
 */

// einzeiliger Kommentar

public class HelloFhdw {
    private static int number = 0;

    public static void welcome() { // keine Übergabeparameter, kein Rückgabewert
        System.out.println("Hello FHDW!");
        System.out.println("Your number is " + number + ".");
    }

    private static int add(int x, int y) { // mit Übergabeparameter, mit Rückgabewert
        return x + y;
    }

    public static void setNumber(int no) {
        number = no;
    }

    public static void main(String[] args) throws Exception {
        int breite = 3;
        welcome();
        setNumber(5);
        welcome();
        System.out.println("3 + 4 = " + add(breite, 4));
        System.out.println("Hello World!");

        App.main(null);
    }

    // Einige öffentliche statische Beispielmethoden
    public static void variables() {
        // Variablendefinition mit Initialisierung
        boolean bigApple = true;
        char aChar = 'x';
        int anInt = 1234;
        double aDouble = 0.12345e2;

        short hexWord = 0x7A3;
        byte bits = 0b0010010;

        // Optische Trenner verbessern die Lesbarkeit
        int x = 0b01010011_10101000_11001111_11110000;
        double y = 3.141_592_653;
        long creditCardNumber = 1234_5678_9012_3456L;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        // Long −2^63 … 2^63−1

        // Ausgabe der Variablenwerte
        System.out.println("b: " + bigApple);
        System.out.println("c: " + aChar);
        System.out.println("i: " + anInt);
        System.out.println("d: " + aDouble);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println(hexWord + bits);

        System.out.println("creditCardNumber: " + creditCardNumber);
        System.out.println("hexBytes: " + hexBytes);
        System.out.println("hexWords: " + hexWords);
        System.out.println("maxlong: " + maxLong);
    }

    public static void strings() {
        double hoehe = 5.5, breite = 7.;

        System.out.println("Höhe\t= " + hoehe);
        System.out.print("Breite\t= " + breite + "\n");

        System.out.printf("Breite * Höhe = %4.2f", breite * hoehe);

        // Ganzzahlig
        System.out.printf("Zahl:%d\n", 15);
        System.out.printf("Zahl:%5d\n", 15);
        System.out.printf("Zahl:%05d\n", 15);
        System.out.printf("Zahl:%-5d\n", 15);
        System.out.printf("Zahl:%d\n", 15);
        System.out.printf("Zahl:%02X\n\n", 15);

        // Fließkomma
        System.out.printf("%f\n", 10.0 / 7.0);
        System.out.printf("%8.3f\n", 10.0 / 7.0);
        System.out.printf("%-8.3f\n\n", 10.0 / 7.0);

        // Strings
        System.out.printf("%s\n", "Hallo");
        System.out.printf("%8s\n", "Hallo");
        System.out.printf("%-8s\n", "Hallo");
        System.out.printf("%8.3s\n", "Hallo");
    }

    public static void arithmeticOperators() {
        int a = 5;
        System.out.println("01. " + 13 / 5);
        System.out.println("02. " + 13 % 5);
        System.out.println("03. " + -12. / 2.5);
        System.out.println("04. " + 12. % 2.5);
        System.out.println("05. " + ++a + " " + a);
        System.out.println("06. " + a++ + " " + a);
        System.out.println("07. " + --a + " " + a);
        System.out.println("08. " + a-- + " " + a);

        double x = 0.7 + 0.1;
        double y = 0.9 - 0.1;
        System.out.println("09. " + (y - x));
    }

    public static void cast() {
        int x = 5, y = 3;
        double z = x / y;
        System.out.println(z);

        z = (double) x / y;
        System.out.println(z);

        long a = 9123456789123456789L;
        System.out.println(a);

        double b = a;
        long c = (long) b;
        System.out.println(c);
    }

    public static void logicalOperators() {
        int a = 2, b = 3;
        System.out.println("01. " + (a == 2 && b < 8));
        System.out.println("02. " + (a != 2 || !(b < 2)));
        System.out.println("03. " + (a == 2 ^ (b > 0)));
        System.out.println("04. " + (a == 0 && b++ == 3));
        System.out.println("05. " + b);
        System.out.println("06. " + (a == 0 & b++ == 3));
        System.out.println("07. " + b);
        System.out.println("08. " + (a == 2 || b++ == 3));
        System.out.println("09. " + b);
        System.out.println("10. " + (a == 2 | b++ == 3));
        System.out.println("11. " + b);
    }

    public static void conditions() {
        int a = -7, b = 9;

        boolean ungerade = (a % 2 == 0) ? false : true; // ungerade
        int max = a > b ? a : b; // Maximum
        int betrag = a >= 0 ? a : -a; // Betrag

        System.out.println("ungerade: " + ungerade);
        System.out.println("absoluter Betrag: " + betrag);
        System.out.println("Maximum: " + max);
    }

    public static void branches() {
        int zahl = 4;
        if (zahl == 6 || zahl == 8)
            System.out.println("Knapp daneben");
        else if (zahl == 7)
            System.out.println("Treffer");
        else
            System.out.println("Weit daneben");
    }

    public static void selection() {
        int zahl = 6;
        switch (zahl) {
            case 6: // ohne "break" fällt der Programmfluss in den nächsten "case"
            case 8:
                System.out.println("Knapp daneben");
                break;
            case 7:
                System.out.println("Treffer");
                break;
            default:
                System.out.println("Weit daneben");
        }
    }

    public static void whileLoop() {
        // kopfgesteuert
        int n = 100, summe = 0, i = 1;
        while (i <= n) {
            summe += i;
            i++;
        }
        System.out.println("Summe 1 bis " + n + ": " + summe);

        // fußgesteuert
        n = 200;
        do {
            summe += i;
            i++;
        } while (i <= n);
        System.out.println("Summe 1 bis " + n + ": " + summe);
    }

    public static void forLoop() {
        double budget = 1.;
        int anzahl = 0;
        for (double preis = 0.1; budget >= preis; preis += 0.1) {
            budget -= preis;
            anzahl++;
        }
        System.out.println(anzahl + " Bonbons gekauft.");
        System.out.println("Restgeld: " + budget);
        System.out.printf("Restgeld: %4.2f", budget);
    }

}
