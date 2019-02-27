package parking.lot;

public class Location {
	private final ParkingLot lot;
	private final String building;
	private final Integer floor;
	private final String name;
	private final String description;

	public Location(ParkingLot lot, String building, Integer floor, String name, String description) {
		this.lot = lot;
		this.building = building;
		this.floor = floor;
		this.name = name;
		this.description = description;
	}
}
