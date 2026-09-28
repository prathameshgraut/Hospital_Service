package hospital.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import hospital.com.Service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	
	
}
