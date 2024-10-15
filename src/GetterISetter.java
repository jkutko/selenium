package src;

public class GetterISetter {

    private String name = "Nazwa";

// getter odczytuje wartość można modyfikować wartość i już bedzie zmieniona wszędzie
    public String getName() {
        return name + "dodaje swoje";
    }


// setter tylko umożliwia przypisanie wartości (ustawić wartość) nie ma działania na nim - ne bedzie mógł pobrać i dziaac na nim

    public void setName(String name) {
        this.name = name;
    }
}
