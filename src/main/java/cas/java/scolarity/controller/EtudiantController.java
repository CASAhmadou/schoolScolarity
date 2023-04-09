package cas.java.scolarity.controller;

import cas.java.scolarity.models.Etudiant;
import cas.java.scolarity.repository.EtudiantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/etudiants")
@RestController
public class EtudiantController {
    private final EtudiantRepository etudiantRepository;

    public EtudiantController(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @PostMapping
    public Etudiant save(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @GetMapping
    public List<Etudiant> etudiants(){
      return etudiantRepository.findAll();
    }
}
