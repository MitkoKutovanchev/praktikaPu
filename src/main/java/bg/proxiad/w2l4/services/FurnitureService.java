package bg.proxiad.w2l4.services;

import java.util.List;

import bg.proxiad.w2l4.controllers.FurnitureImputBean;
import bg.proxiad.w2l4.models.Furniture;

public interface FurnitureService {

	List<Furniture> listFurniture();

	Furniture getFurniture(Long id);

	Furniture createFurniture(FurnitureImputBean furniture);

	Furniture updateFurniture(Furniture furniture);

	void deleteFurniture(Long id);

}
