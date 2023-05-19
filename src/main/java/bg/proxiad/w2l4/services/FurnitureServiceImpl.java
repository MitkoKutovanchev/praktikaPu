package bg.proxiad.w2l4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.proxiad.w2l4.models.Furniture;
import bg.proxiad.w2l4.repositories.FurnitureRepository;

@Service
public class FurnitureServiceImpl implements FurnitureService{
	
	@Autowired FurnitureRepository furnitureRepository;

	@Override
	public List<Furniture> listFurniture() {
		return furnitureRepository.listFurniture();
	}
}
