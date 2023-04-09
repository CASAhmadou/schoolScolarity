package cas.java.scolarity.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "niveau_etude")
public class NiveauEtude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String libelle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departement_id")
    private Departement departement;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inscription_id")
    private Inscription inscription;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "classe_niveau",
            joinColumns = { @JoinColumn(name = "niveau_etude_id") },
            inverseJoinColumns = { @JoinColumn(name = "classe_id") }
    )
    private List<Classe> classes = new ArrayList<>();
}
