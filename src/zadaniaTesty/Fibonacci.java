package src.zadaniaTesty;

public class Fibonacci {

    // stworzenie metody dla n-tego wyrazy ciagu fibonacciego
    // n1=1
    // n2 = 1
    // n3 = n2 + 1

    public static void main(String[] args) {
        fibo(1);
        fibo(2);
        fibo(5);
        fibo(7);
    }


    public static void fibo(int n) {
        long n1 = 1;
        long n2 = 1;

        for (int i = 3; i <=n; i++) {   // i = 3 bo znamy wartosc dla n1 i n2
            long temp = n2 +n1;         // zmienna tymczasowa - przechowa sumę dwóch poprzednich wyrazów
            n1 = n2;                    // nadpisujemy n1 i ustawiamy wartosc n2
            n2 = temp;                  // n2 wynosi temp
        }
        System.out.println(n2);
    }

}
