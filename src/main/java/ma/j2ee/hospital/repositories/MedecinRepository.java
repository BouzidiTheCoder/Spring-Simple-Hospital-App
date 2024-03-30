package ma.j2ee.hospital.repositories;

import ma.j2ee.hospital.entities.Medecin;
import ma.j2ee.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
