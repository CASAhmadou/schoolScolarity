package cas.java.scolarity.controller;

import cas.java.scolarity.models.NiveauEtude;
import cas.java.scolarity.repository.NiveauEtudeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/licences")
@RestController
public class NiveauEtudeCOntroller {
    private final NiveauEtudeRepository niveauEtudeRepository;

    public NiveauEtudeCOntroller(NiveauEtudeRepository niveauEtudeRepository) {
        this.niveauEtudeRepository = niveauEtudeRepository;
    }

    @PostMapping
    private NiveauEtude saveLicence(@RequestBody NiveauEtude n){
        return niveauEtudeRepository.save(n);
    }

    @GetMapping
    private List<NiveauEtude> niveauEtudeList(){return niveauEtudeRepository.findAll();}
}
