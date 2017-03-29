package AutoProject;


public class mainAuto {
    static modelMashine[] autos = new modelMashine[]{new Train(150, "Train", 15), new AirBuss(300, "AirBuss", 25),
            new Car(4, "Car", 5), new miniBuss(8, "miniBuss", 7), new Buss(18, "Buss", 8.3),
            new BigBuss(55, "BigBuss", 10), new BigBuss2(55, "BigBuss", 10)};

    public static void main(String[] args) {
        int people = 10;
        boolean isCheck = true;
        modelMashine element = autos[0];
        while (isCheck) {
            isCheck = false;
            for (int i = 0; i < autos.length - 1; i++) {
                if (autos[i].getPlace() > autos[i + 1].getPlace()) {
                    element = autos[i];
                    autos[i] = autos[i + 1];
                    autos[i + 1] = element;
                    isCheck = true;
                }
            }
        }

        for (int i = 0; i < autos.length; i++) {
          /*  if (autos[i].getPlace() > people) {
                System.out.println("Кількість місць не підходить");
            }else {
                try {
                    throw  new MyExeprions();
                }catch ( MyExeprions myExeprions){
                    myExeprions.print("Підходить");
                }
            }*/
            try {
                if (autos[i].getPlace() < people) {
                    System.out.println("Кількість місць підходить");
                } else {
                    throw new MyExeprions();
                }
            } catch (MyExeprions myExeprions) {
                System.out.println("Трабла");
            }
            // System.out.println("К-сть пасажирів: " + autos[i].getPlace() + " Модель: " + autos[i].getName() + " "
            //          + "Вантажо підйомність: " + autos[i].TrunkCapaCity());
            
        }

    }

}
