package bg.proxiad.w2l4.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.proxiad.w2l4.controllers.FurnitureInputBean;
import bg.proxiad.w2l4.models.Furniture;
import bg.proxiad.w2l4.repositories.FurnitureRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class FurnitureServiceImpl implements FurnitureService {
	
	@Autowired FurnitureRepository furnitureRepository;

	@Override
	public List<Furniture> listFurniture() {
//		return (List<Furniture>) furnitureRepository.findByPriceOrderByTypeDesc(500d);
		
		return (List<Furniture>) furnitureRepository.findAll();
	}

	@Override
	public Furniture getFurniture(Long id) {
		return furnitureRepository.findById(id).get();
	}

	@Override
	public Furniture createFurniture(FurnitureInputBean furniture) {
		Furniture f = new Furniture();
		f.setPrice(furniture.getPrice());
		f.setType(furniture.getType());
		return furnitureRepository.save(f);
	}

	@Override
	public Furniture updateFurniture(Furniture furniture) {
		Furniture furnitureNew = furnitureRepository.findById(furniture.getId()).get();
		furnitureNew.setPrice(furniture.getPrice());
		furnitureNew.setType(furniture.getType());
		return furnitureNew;
	}

	@Override
	public void deleteFurniture(Long id) {
		furnitureRepository.deleteById(id);
	}
}
