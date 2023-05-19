package bg.proxiad.w2l4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bg.proxiad.w2l4.services.ElEquipmentService;

@RestController
public class ElEquipmentControllerImpl implements ElEquipmentController {
	
	@Autowired ElEquipmentService elEquipmentService;
}
