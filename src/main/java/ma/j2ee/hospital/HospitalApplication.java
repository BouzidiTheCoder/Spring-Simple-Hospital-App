package ma.j2ee.hospital;

import ma.j2ee.hospital.entities.*;
import ma.j2ee.hospital.repositories.ConsultationRepository;
import ma.j2ee.hospital.repositories.MedecinRepository;
import ma.j2ee.hospital.repositories.PatientRepository;
import ma.j2ee.hospital.repositories.RendezVousRepository;
import ma.j2ee.hospital.service.HospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    CommandLineRunner start(HospitalService hospitalService,
                            PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            RendezVousRepository rendezVousRepository
    ){

        return args -> {

            Stream.of("Mohamed", "Hassan", "Najat")
                    .forEach(name->{

                        // Création et sauvegarde de patients
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        hospitalService.savePatient(patient);

                    });

            Stream.of("Aymane", "Amine", "Rachid")
                    .forEach(name->{

                        // Création et sauvegarde de médecins
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentis");
                        hospitalService.saveMedecin(medecin);

                    });

            // Recherche d'un patient par ID et par nom
            Patient patient=patientRepository.findById(1L).orElse(null);
            Patient patient1=patientRepository.findByNom("Hassan");

            // Recherche d'un médecin par nom
            Medecin medecin=medecinRepository.findByNom("Amine");

            // Création et sauvegarde d'un rendez-vous
            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            RendezVous savedRDV = hospitalService.saveRDV(rendezVous);
            System.out.println(savedRDV.getId());

            // Récupération du premier rendez-vous
            RendezVous rendezVous1= rendezVousRepository.findAll().get(0);

            // Création et sauvegarde d'une consultation associée au rendez-vous
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de la consultation .....");
            hospitalService.saveConsultation(consultation);

        };
    }
}
