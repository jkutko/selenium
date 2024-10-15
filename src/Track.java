package src;

public class Track implements VehicleInterfejsy {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciężarówką " +speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką !!");
    }

    @Override
    public String info() {
        return "Ciężarówka";
    }
}
