package Inter;

import transport.CargoAuto;
import transport.PassangerAuto;

public class PickUp implements PassangerAuto, CargoAuto {
	@Override
	public void transportAuto() {
		System.out.println("pickup passanger auto");
	}

	@Override
	public void transportCargo() {
		System.out.println("pickup transport cargo");
	}

	@Override
	public void someFields() {

	}

}