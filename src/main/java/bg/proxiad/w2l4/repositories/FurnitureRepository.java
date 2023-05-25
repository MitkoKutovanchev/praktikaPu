package bg.proxiad.w2l4.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bg.proxiad.w2l4.models.Furniture;

public interface FurnitureRepository extends CrudRepository<Furniture, Long> {
	
	List<Furniture> findByPriceOrderByTypeDesc(Double price);

//
//	Furniture getFurniture(Long id);
//
//	Furniture updateFurniture(Furniture newFurniture);
//
//	void deleteFurniture(Long id);
//
//	Furniture create(Furniture furniture);

}
