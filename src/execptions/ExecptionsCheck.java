package src.execptions;

import java.util.Scanner;

public class ExecptionsCheck {


    public static void main(String[] args) throws InvalidAgeExecption{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek ");
        int wiek = scanner.nextInt();


        if (wiek <0) {
            throw new InvalidAgeExecption("wiek jest niepoprawny < 0 ");
        }

        if (wiek>= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }

        System.out.println("Twój wiek " + wiek );
    }


}
