package hospital.com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital.com.Entity.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Integer>{

}
