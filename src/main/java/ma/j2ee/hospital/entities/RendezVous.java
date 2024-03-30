package ma.j2ee.hospital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class RendezVous {

    @Id
    private String id;

    private Date date;
    @Enumerated(EnumType.STRING)    // Indique que le champ status est une énumération et que la valeur sera stockée sous forme de chaîne de caractères
    private StatusRDV status;

    @ManyToOne
    @JsonProperty (access = JsonProperty.Access.WRITE_ONLY)
    private Patient patient;

    @ManyToOne
    private Medecin medecin;

    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;

}
