package ma.j2ee.hospital.repositories;

import ma.j2ee.hospital.entities.Consultation;
import ma.j2ee.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
