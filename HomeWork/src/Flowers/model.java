package Flowers;

public class model {
	protected String flower;
	protected int countFlowers;
	protected double price;
	private double sum;

	public model() {
		// TODO Auto-generated constructor stub
	}

	public model(String flower, int countFlowers, double price) {
		super();
		this.flower = flower;
		this.countFlowers = countFlowers;
		this.price = price;
	}

	public double getSum() {
		return sum = getPrice() * getCountFlowers();
	}

	public int getCountFlowers() {
		return countFlowers;
	}

	public String getFlower() {
		return flower;
	}

	public double getPrice() {
		return price;
	}

}
