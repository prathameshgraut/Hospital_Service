package hospital.com.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import hospital.com.Entity.Doctor;
import hospital.com.Service.DoctorService;

@RestController("/Hospital")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	@PostMapping("/addDoctor")
	public ResponseEntity<Doctor> addDr(@RequestBody Doctor Dr){
		return new ResponseEntity<Doctor>(doctorService.addDoctor(Dr),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getDoctor/{id}")
	public ResponseEntity<Doctor> getDoctor(@PathVariable Integer id){
		return new ResponseEntity<Doctor>(doctorService.getDoctor(id),HttpStatus.OK);
	}
	
	
	//get Doctor
	
	@GetMapping("/getAllDoctor")
	public List<Doctor> getAllDoctor(Doctor dr){
		return doctorService.getAllDoctor();
	}
	
	
	
	
	
}
