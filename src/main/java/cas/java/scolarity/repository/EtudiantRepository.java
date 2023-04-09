package cas.java.scolarity.repository;

import cas.java.scolarity.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
