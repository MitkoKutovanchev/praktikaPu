package bg.proxiad.w2l4.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bg.proxiad.w2l4.models.Furniture;
import jakarta.annotation.PostConstruct;

@Repository
public class FurnitureRepositoryImpl implements FurnitureRepository {
	
	List<Furniture> furniture;
	
	@PostConstruct
	public void setup() {
		furniture = new ArrayList<>();
		furniture.add(new Furniture(1l, 20d, "Chair"));
		furniture.add(new Furniture(2l, 120d, "Table"));
		furniture.add(new Furniture(3l, 30d, "Lamp"));
	}
	

	@Override
	public List<Furniture> listFurniture() {
		return furniture;
	}
	
	@Override
	public Furniture getFurniture(Long id) {
		return furniture.stream().filter(f -> id.equals(f.getId())).findFirst().get();
	}
	
	@Override
	public Furniture updateFurniture(Furniture newFurniture) {
		Furniture oldFurniture = furniture.stream().filter(f -> newFurniture.getId().equals(f.getId())).findFirst().get();
		oldFurniture = newFurniture;
		return oldFurniture;
	}
	
	@Override
	public void deleteFurniture(Long id) {
		Furniture oldFurniture = furniture.stream().filter(f -> id.equals(f.getId())).findFirst().get();
		furniture.remove(oldFurniture);
	}
}
