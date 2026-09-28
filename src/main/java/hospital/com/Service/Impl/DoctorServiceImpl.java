package hospital.com.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Emp.com.Exception.ResourceNotFound;
import hospital.com.Entity.Doctor;
import hospital.com.Repo.DoctorRepo;
import hospital.com.Service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepo dRepo;

	
	public DoctorServiceImpl(DoctorRepo dRepo) {
		this.dRepo = dRepo;
	}

	
	@Override
	public Doctor addDoctor(Doctor d) {
		return dRepo.save(d);
	}

	@Override
	public Doctor getDoctor(Integer id) {
		return dRepo.findById(id).orElseThrow(()-> new ResourceNotFound ("Doctor","Id",id));
	}

	@Override
	public List<Doctor> getAllDoctor() {
		return dRepo.findAll();
	}

	@Override
	public Doctor updateDoctor(Integer id) {
		Doctor dc = dRepo.findById(id).orElseThrow(()->new ResourceNotFound ("Doctor","Id",id));
		dc.setName(dc.getName());
		dc.setAddress(dc.getAddress());
		dc.setEducation(dc.getEducation());
		dc.setMobNo(dc.getMobNo());
	
		return dRepo.save(dc);
	}

	@Override
	public void deleteDoctor(Integer id) {
		dRepo.deleteById(id);		
	}
	
	

}
