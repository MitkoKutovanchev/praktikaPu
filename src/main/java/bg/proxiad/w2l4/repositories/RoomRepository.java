package bg.proxiad.w2l4.repositories;

import java.util.List;

import bg.proxiad.w2l4.models.Room;

public interface RoomRepository {

	List<Room> listRooms();

	Room getRoom(Long id);

	Room updateRoom(Room newFurniture);

	void deleteRoom(Long id);

}
