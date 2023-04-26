package cas.java.scolarity.controller;

import cas.java.scolarity.models.ClasseEtude;
import cas.java.scolarity.repository.ClassEtudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/niveau")
@RestController
public class ClasseEtudeController {
    @Autowired
    private ClassEtudeRepository classEtudeRepository;

    @PostMapping
    public ClasseEtude saveNiveau(@RequestBody ClasseEtude ce){
        return classEtudeRepository.save(ce);
    }

    @GetMapping
    public List<ClasseEtude> NiveauEtudes(){
        return classEtudeRepository.findAll();
    }
}
