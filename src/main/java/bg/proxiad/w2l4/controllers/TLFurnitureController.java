package bg.proxiad.w2l4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bg.proxiad.w2l4.models.Furniture;
import bg.proxiad.w2l4.services.FurnitureService;
import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping(path = "/tl/furniture")
public class TLFurnitureController {
	
@Autowired FurnitureService furnitureService;
	
	@GetMapping
	public String listFurniture (Model model) {
		model.addAttribute("allFurniture", furnitureService.listFurniture());
		return "listAll";
	}
	
	@GetMapping(path="/add")
	public String addFurniture (Model model) {
		model.addAttribute("furniture", new FurnitureInputBean());
		return "addNewFurniture";
	}
	
	@GetMapping(path="/update/{id}")
	public String updateFurniture (@PathVariable Long id, Model model) {
		Furniture oldFurniture = furnitureService.getFurniture(id);
		FurnitureInputBean furniture = new FurnitureInputBean();
		furniture.setPrice(oldFurniture.getPrice());
		furniture.setType(oldFurniture.getType());
		model.addAttribute("furniture", furniture);
		model.addAttribute("furnitureId", id);
		return "updateFurniture";
	}
	
	@PostMapping
	public String createFurniture(@ModelAttribute(name = "furniture") FurnitureInputBean furniture) {
		furnitureService.createFurniture(furniture);
		return "redirect:/tl/furniture";
	}
	
	@PostMapping(path = "/{id}")
	public String updateFurniture(@PathVariable Long id, @ModelAttribute(name = "furniture") FurnitureInputBean furniture) {
		Furniture updatedFurniture = new Furniture();
		updatedFurniture.setId(id);
		updatedFurniture.setPrice(furniture.getPrice());
		updatedFurniture.setType(furniture.getType());
		furnitureService.updateFurniture(updatedFurniture);
		return "redirect:/tl/furniture";
	}
}
