package AutoProject;

public class Train extends modelMashine {

    public Train(int place, String name, double capacity) {
        super(place, name, capacity);
    }

    public void move() {
        System.out.println(getName() + "Їде по колії");
    }

}
