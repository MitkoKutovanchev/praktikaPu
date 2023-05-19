package bg.proxiad.w2l4.models;

import java.util.List;

public class Room {
	
	private Long id;
	List<Furniture> furniture;
	List<ElEquipment> elEquipment;

	public List<Furniture> getFurniture() {
		return furniture;
	}

	public void setFurniture(List<Furniture> furniture) {
		this.furniture = furniture;
	}

	public List<ElEquipment> getElEquipment() {
		return elEquipment;
	}

	public void setElEquipment(List<ElEquipment> elEquipment) {
		this.elEquipment = elEquipment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
