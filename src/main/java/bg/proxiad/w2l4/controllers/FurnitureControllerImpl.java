package bg.proxiad.w2l4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bg.proxiad.w2l4.models.Furniture;
import bg.proxiad.w2l4.services.FurnitureService;

@RestController
@RequestMapping(path = "/furniture")
public class FurnitureControllerImpl implements FurnitureController {

	@Autowired FurnitureService furnitureService;
	
	@GetMapping
	public List<Furniture> listFurniture () {
		return furnitureService.listFurniture();
	}
	
	@GetMapping("/{id}")
	public Furniture getFurniture(@PathVariable Long id) {
		return furnitureService.getFurniture(id);
	}
	
	@PostMapping
	public Furniture createFurniture(@RequestBody FurnitureImputBean furniture) {
		return furnitureService.createFurniture(furniture);
	}
	
	@PutMapping
	public Furniture updateFurniture(@RequestBody Furniture furniture) {
		return furnitureService.updateFurniture(furniture);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = {"/{id}"})
	public void deleteFurniture(@PathVariable Long id) {
		furnitureService.deleteFurniture(id);
	}
}
