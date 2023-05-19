package bg.proxiad.w2l4.repositories;

import java.util.List;

import bg.proxiad.w2l4.models.Floor;

public interface FloorRepository {

	List<Floor> listFloor();

	Floor getFloor(Long id);

	Floor updateFloor(Floor newFloor);

	void deleteFloor(Long id);

}
