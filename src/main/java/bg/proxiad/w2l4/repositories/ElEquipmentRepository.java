package bg.proxiad.w2l4.repositories;

import java.util.List;

import bg.proxiad.w2l4.models.ElEquipment;

public interface ElEquipmentRepository {

	List<ElEquipment> listElEquipment();

	ElEquipment getElEquipment(Long id);

	void deleteElEquipment(Long id);

	ElEquipment updateElEquipment(ElEquipment newFurniture);

}
