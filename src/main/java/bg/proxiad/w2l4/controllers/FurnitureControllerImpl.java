package bg.proxiad.w2l4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.proxiad.w2l4.models.Furniture;
import bg.proxiad.w2l4.services.FurnitureService;

@RestController
public class FurnitureControllerImpl implements FurnitureController {

	@Autowired FurnitureService furnitureService;
	
	@GetMapping("/furniture")
	public List<Furniture> listFurniture () {
		return furnitureService.listFurniture();
	}
}
