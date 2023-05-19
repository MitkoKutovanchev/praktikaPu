package bg.proxiad.w2l4.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bg.proxiad.w2l4.models.ElEquipment;
import jakarta.annotation.PostConstruct;

@Repository
public class ElEquipmentRepositoryImpl implements ElEquipmentRepository {
	
	List<ElEquipment> elEquipment;
	
	@PostConstruct
	public void setup() {
		elEquipment = new ArrayList<>();
	}
	
	@Override
	public List<ElEquipment> listElEquipment() {
		return elEquipment;
	}
	
	@Override
	public ElEquipment getElEquipment(Long id) {
		return elEquipment.stream().filter(e -> id.equals(e.getId())).findFirst().get();
	}
	
	@Override
	public ElEquipment updateElEquipment(ElEquipment newElEquipment) {
		ElEquipment oldElEquipment = elEquipment.stream().filter(f -> newElEquipment.getId().equals(f.getId())).findFirst().get();
		oldElEquipment = newElEquipment;
		return oldElEquipment;
	}
	
	@Override
	public void deleteElEquipment(Long id) {
		ElEquipment oldElEquipment = elEquipment.stream().filter(f -> id.equals(f.getId())).findFirst().get();
		elEquipment.remove(oldElEquipment);
	}
}
