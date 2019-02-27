package parking.lot;

public abstract class Vehicle {

	private final VehicleSize size;
	private final String plate;
	private final Owner owner;

	protected Vehicle(VehicleSize size, String plate, Owner owner) {
		this.size = size;
		this.plate = plate;
		this.owner = owner;
	}
}
