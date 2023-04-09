package cas.java.scolarity.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "")
    private Long id;

    private String nom;

    private String prenom;

    private String matricule;

    @Column(name = "date_naissance")
    private Date dateNaissance;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inscription_id")
    private Inscription inscription;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classe_niveau_id")
    private ClasseEtude classeEtude;
}
