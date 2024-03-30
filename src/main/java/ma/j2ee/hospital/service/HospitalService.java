package ma.j2ee.hospital.service;

import ma.j2ee.hospital.entities.Consultation;
import ma.j2ee.hospital.entities.Medecin;
import ma.j2ee.hospital.entities.Patient;
import ma.j2ee.hospital.entities.RendezVous;

public interface HospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
