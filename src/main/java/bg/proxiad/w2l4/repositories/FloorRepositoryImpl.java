package bg.proxiad.w2l4.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bg.proxiad.w2l4.models.Floor;
import jakarta.annotation.PostConstruct;

@Repository
public class FloorRepositoryImpl implements FloorRepository {
	
	List<Floor> floors;
	
	@PostConstruct
	public void setup() {
		floors = new ArrayList<>();
	}
	
	@Override
	public List<Floor> listFloor() {
		return floors;
	}
	
	@Override
	public Floor getFloor(Long id) {
		return floors.stream().filter(f -> id.equals(f.getId())).findFirst().get();
	}
	
	@Override
	public Floor updateFloor(Floor newFloor) {
		Floor oldFloor = floors.stream().filter(f -> newFloor.getId().equals(f.getId())).findFirst().get();
		oldFloor = newFloor;
		return oldFloor;
	}
	
	@Override
	public void deleteFloor(Long id) {
		Floor oldFloor = floors.stream().filter(f -> id.equals(f.getId())).findFirst().get();
		floors.remove(oldFloor);
	}
}
