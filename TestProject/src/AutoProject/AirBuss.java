package AutoProject;

public class AirBuss extends modelMashine {

    public AirBuss(int place, String name, double capacity) {
        super(place, name, capacity);
    }

    @Override
    public void move() {
        System.out.println(getName() + "Літає");
    }



}
