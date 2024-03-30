package ma.j2ee.hospital.repositories;

import ma.j2ee.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByNom(String name);
}
