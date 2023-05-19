package bg.proxiad.w2l4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.proxiad.w2l4.repositories.FloorRepository;

@Service
public class FloorServiceImpl implements FloorService{

	@Autowired
	private FloorRepository floorRepository;
}
