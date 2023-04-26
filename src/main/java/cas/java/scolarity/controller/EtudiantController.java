package cas.java.scolarity.controller;

import cas.java.scolarity.models.Etudiant;
import cas.java.scolarity.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/etudiants")
@RestController
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public EtudiantController(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @PostMapping
    public Etudiant saveEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @GetMapping
    public List<Etudiant> etudiants(){
      return etudiantRepository.findAll();
    }
}
