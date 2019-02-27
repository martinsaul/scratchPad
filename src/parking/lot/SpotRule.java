package parking.lot;

public class SpotRule {
	private final SpotType type;
	private final VehicleSize maxSize, minSize;
	private final ParkingLot locationBound;

	public SpotRule(SpotType type, VehicleSize maxSize, VehicleSize minSize, ParkingLot locationBound) {
		this.type = type;
		this.maxSize = maxSize;
		this.minSize = minSize;
		this.locationBound = locationBound;
	}
}
