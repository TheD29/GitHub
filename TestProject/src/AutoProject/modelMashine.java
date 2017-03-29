package AutoProject;

public abstract class modelMashine implements autoInterface {
    private int place;
    private String name;
    private double capaCity;

    public modelMashine() {
    }

    public modelMashine(int place, String name, double capaCity) {
        this.place = place;
        this.name = name;
        this.capaCity = capaCity;
    }


    public double TrunkCapaCity() {
        return getPlace() * getCapaCity();
    }


    public void mashineParam() {
        System.out.println("К-сть місць: " + getPlace() + ' ' + "Вид Авто" + getName());
    }


    public void move() {
        System.out.println(getName() + "Їде по дорозі");
    }

    public String getName() {
        return name;
    }

    public int getPlace() {
        return place;
    }

    public double getCapaCity() {
        return capaCity;
    }
    public modelMashine getAuto (int place) throws  MyExeprions {
        if (getPlace() > place) return this;
        throw new MyExeprions();
    }

}
