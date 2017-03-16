package TestProject;

public class Controller extends Auto {
    Auto auto;
    mainAuto mn;

    public Controller() {

    }

    public Controller(int place, String name) {
        super(place, name);
        // TODO Auto-generated constructor stub
    }

    public void number() {
        for (int i = 0; i < mainAuto.autos.length; i++) {
            if (auto.getPeople() <= mainAuto.autos[i].getPlace()) {
                System.out.println(mainAuto.autos[i].getPlace());
            }
        }

    }
}
