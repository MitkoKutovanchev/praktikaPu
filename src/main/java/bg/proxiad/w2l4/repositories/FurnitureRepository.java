package bg.proxiad.w2l4.repositories;

import java.util.List;

import bg.proxiad.w2l4.models.Furniture;

public interface FurnitureRepository {

	List<Furniture> listFurniture();

	Furniture getFurniture(Long id);

	Furniture updateFurniture(Furniture newFurniture);

	void deleteFurniture(Long id);

}
