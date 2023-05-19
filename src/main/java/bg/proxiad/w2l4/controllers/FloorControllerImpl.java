package bg.proxiad.w2l4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import bg.proxiad.w2l4.repositories.FloorRepository;

@Controller
public class FloorControllerImpl implements FloorController {
	
	@Autowired FloorRepository floorRepository;
}
