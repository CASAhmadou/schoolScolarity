package cas.java.scolarity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String libelle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inscription_id")
    private Inscription inscription;

    @JsonIgnore
    @OneToMany(mappedBy = "departement")
    private List<NiveauEtude> niveauEtudes;

}
