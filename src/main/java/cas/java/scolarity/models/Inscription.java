package cas.java.scolarity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Date date;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    @JsonIgnore
    @OneToMany(mappedBy = "inscription")
    private List<Etudiant> etudiants;

    @JsonIgnore
    @OneToMany(mappedBy = "inscription")
    private List<Departement> departements;

    @JsonIgnore
    @OneToMany(mappedBy = "inscription")
    private List<Classe> classes;

    @JsonIgnore
    @OneToMany(mappedBy = "inscription")
    private List<NiveauEtude> niveauEtudes;
}
