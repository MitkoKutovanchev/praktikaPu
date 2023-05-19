package bg.proxiad.w2l4.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bg.proxiad.w2l4.models.ElEquipment;
import bg.proxiad.w2l4.models.Room;
import jakarta.annotation.PostConstruct;

@Repository
public class RoomRepositoryImpl implements RoomRepository {

	List<Room> rooms;
	
	@PostConstruct
	public void setup() {
		rooms = new ArrayList<>();
	}
	
	@Override
	public List<Room> listRooms() {
		return rooms;
	}
	
	@Override
	public Room getRoom(Long id) {
		return rooms.stream().filter(r -> id.equals(r.getId())).findFirst().get();
	}
	
	@Override
	public Room updateRoom(Room newRoom) {
		Room oldRoom = rooms.stream().filter(r -> newRoom.getId().equals(r.getId())).findFirst().get();
		oldRoom = newRoom;
		return oldRoom;
	}
	
	@Override
	public void deleteRoom(Long id) {
		Room oldRoom = rooms.stream().filter(r -> id.equals(r.getId())).findFirst().get();
		rooms.remove(oldRoom);
	}
}
