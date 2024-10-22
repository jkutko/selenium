package src.stream;

import java.net.ServerSocket;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        //tworzenie strumienia

        List<String> names = Arrays.asList("Tom","John","Mat");
        Stream<String> streamNames = names.stream();

        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2,3}).stream();
        DoubleStream doubleStream = DoubleStream.of(2,3,5,6);
        IntStream intStream = IntStream.range(1,100);

        // przetwarzanie danych
        // filter - filtrowanie
        // map - zmiana elementuna cos innego np zmiana liczby np pomnożenie x 2
        // limit - zwraca określoną ilość elementów/liczbę
        // peek - pozwala przeprowadzic operację na każdym elemencie



        // zakonczenie strumienia
        // forEach - wykonanie akcji dla każdego z elementów strumienia
        // count - zwraca ilość elementów w strumieniu
        // allMatch - czy wszytskie elementy spełniają warunek
        // collect - zwraca nowy typ na podst stumienia np zwraca liste po np filtorwaniu


        streamNames.filter(el -> el.startsWith("T")) //wykorzystano lambde to zwrócenia
                .map(el -> el.toUpperCase())
                .forEach((el -> System.out.println(el)));


        intStream.filter(el ->el >20)
                .map(el -> el *2)
                .limit(10)
                .forEach(el -> System.out.println(el));



/*        long count = intStream.filter(el ->el >20)
                .map(el -> el *2)
                //.limit(10)
                .count();*/






    }


}
