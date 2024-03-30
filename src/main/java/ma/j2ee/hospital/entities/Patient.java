package ma.j2ee.hospital.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity     // Indique que cette classe est une entité JPA, ce qui signifie qu'elle sera persistée dans la base de données
@Data @NoArgsConstructor @AllArgsConstructor    // Annotations Lombok pour générer automatiquement les getters, setters, constructeurs sans argument et constructeurs avec tous les arguments
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)     // Indique que la clé primaire sera générée automatiquement par la base de données lors de l'insertion d'un nouveau patient
    private Long id;

    private String nom;

    @Temporal(TemporalType.DATE)    // Indique le type de la date (ici, uniquement la date sans heure) pour le champ dateNaissance.
    private Date dateNaissance;

    private boolean malade;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)  // Définit une relation One-to-Many avec la classe RendezVous
    private Collection<RendezVous> rendezVouz;

}
