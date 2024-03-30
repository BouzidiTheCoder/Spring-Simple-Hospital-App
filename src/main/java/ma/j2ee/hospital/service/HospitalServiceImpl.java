package ma.j2ee.hospital.service;

import jakarta.transaction.Transactional;
import ma.j2ee.hospital.entities.Consultation;
import ma.j2ee.hospital.entities.Medecin;
import ma.j2ee.hospital.entities.Patient;
import ma.j2ee.hospital.entities.RendezVous;
import ma.j2ee.hospital.repositories.ConsultationRepository;
import ma.j2ee.hospital.repositories.MedecinRepository;
import ma.j2ee.hospital.repositories.PatientRepository;
import ma.j2ee.hospital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

//Implémentation des services métier pour la gestion hospitalière.

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private ConsultationRepository consultationRepository;
    private RendezVousRepository rendezVousRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, ConsultationRepository consultationRepository, RendezVousRepository rendezVousRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezVousRepository = rendezVousRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
