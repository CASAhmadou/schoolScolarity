package cas.java.scolarity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "classe_niveau")
public class ClasseEtude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigInteger classe_id;
    private BigInteger niveau_etude_id;

    @JsonIgnore
    @OneToMany(mappedBy = "classeEtude")
    private List<Etudiant> etudiants;

    @JsonIgnore
    @OneToOne(mappedBy = "classeEtude", cascade = CascadeType.ALL)
    private Paiement paiement;
}
