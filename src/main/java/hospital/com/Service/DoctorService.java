package hospital.com.Service;

import java.util.List;

import hospital.com.Entity.Doctor;

public interface DoctorService {
	
	
	public Doctor addDoctor(Doctor d);
	
	public Doctor getDoctor(Integer id);
	
	public List<Doctor> getAllDoctor();
	
	public Doctor updateDoctor(Integer id);
	
	public void deleteDoctor(Integer id);
}
