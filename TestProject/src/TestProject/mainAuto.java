package TestProject;

public class mainAuto {
    static Auto[] autos = new Auto[]{new Train(150, "Train"), new Car(4, "Car"), new AirBuss(300, "AirBuss"),
            new miniBuss(8, "miniBuss"), new Buss(18, "Buss"), new BigBuss(55, "BigBuss")};

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setPeople(15);

        Auto element = autos[0];
        for (int i = 0; i < autos.length - 1; i++) {

            if (autos[i].getPlace() > autos[i + 1].getPlace()) {
                element = autos[i];
                autos[i] = autos[i + 1];
                autos[i + 1] = element;
                i = 0;
            }

        }
        Controller controller = new Controller();
        controller.number();

		/*
         * if (autos.getPlace() >= people) System.out.println(car.getName());
		 * else if (miniBuss.getPlace() >= people)
		 * System.out.println(miniBuss.getName()); else if (buss.getPlace() >=
		 * people) System.out.println(buss.getName());
		 */

    }

}
