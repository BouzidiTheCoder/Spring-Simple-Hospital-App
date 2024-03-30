package ma.j2ee.hospital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date  dateConsultation;
    private String rapport;
    @OneToOne   // Définit une relation One-to-One entre Consultation et RendezVous
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)   // Indique que la propriété rendezVous ne sera écrite que lors de la désérialisation JSON.
    private RendezVous rendezVous;

}
