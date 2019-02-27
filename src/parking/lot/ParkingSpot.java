package parking.lot;

public class ParkingSpot {
	private final SpotRule rules;
	private final int number;
	private final Location location; //

	public ParkingSpot(SpotRule rules, int number, Location location) {
		this.rules = rules;
		this.number = number;
		this.location = location;
	}
}
