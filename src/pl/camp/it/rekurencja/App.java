package pl.camp.it.rekurencja;

public class App {
    public static void main(String[] args) {
        System.out.println(silnia(1093));
        System.out.println(power(4, 5));
        System.out.println(fib(39));

        /*int a = 2147483647;
        a++;
        System.out.println(a);*/
    }

    public static void metoda() {
        System.out.println("metoda dziala !!!");
        metoda();
    }

    public static int silnia(int x) {
        if(x == 1) {
            return 1;
        }
        return x * silnia(x-1);
    }

    public static int power(int base, int to) {
        if(to == 1) {
            return base;
        }
        return base * power(base, to - 1);
    }

    public static int fib(int x) {
        if(x == 1 || x == 2) {
            return 1;
        }
        return fib(x-1) + fib(x-2);
    }
}
