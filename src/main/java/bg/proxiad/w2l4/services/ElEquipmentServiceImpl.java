package bg.proxiad.w2l4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.proxiad.w2l4.repositories.ElEquipmentRepository;

@Service
public class ElEquipmentServiceImpl implements ElEquipmentService {

	@Autowired
	private ElEquipmentRepository elEquipmentRepository;
}
