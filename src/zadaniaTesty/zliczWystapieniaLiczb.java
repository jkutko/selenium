package src.zadaniaTesty;

import java.util.HashMap;
import java.util.Map;

public class zliczWystapieniaLiczb {

    //zlicz wystąpienie liczby w danym ciągu
    // int[] numbers = new int[] {1,2,3,4,5,3};

    public static void main(String[] args) {

        liczbyWystapienia(new int[] {1,2,3,4,5,3});

    }

    public static void liczbyWystapienia(int[] numbers) {
        Map<Integer, Integer> wystapienia = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {                   //przechodzimy przez tablicę cała - iterujemy
            if (wystapienia.containsKey(numbers[i])) {              // jeżeli nasza mapa zawiera klucz z numbers o indeksie i
                Integer value = wystapienia.get(numbers[i]);        // pobieramy wartość dla tego klucza
                wystapienia.put(numbers[i], value + 1);             // klucz sie nie zmienia nadpisujemy wartość

        }else {                                                     // jak nie zawiera klucza to dodajemy taki klucz
            wystapienia.put(numbers[i], 1);
        }
    }

        for(Integer key : wystapienia.keySet()) {
            System.out.println("Liczba " +key +" wystąpuje " +wystapienia.get(key));
        }


    }


}
