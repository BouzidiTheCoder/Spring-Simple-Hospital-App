package ma.j2ee.hospital.repositories;

import ma.j2ee.hospital.entities.Patient;
import ma.j2ee.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous, String> {

}
