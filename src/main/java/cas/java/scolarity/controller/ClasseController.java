package cas.java.scolarity.controller;

import cas.java.scolarity.models.Classe;
import cas.java.scolarity.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/classes")
@RestController
public class ClasseController {
    @Autowired
    private final ClasseRepository classeRepository;

    public ClasseController(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    @PostMapping
    public Classe saveClasse(@RequestBody Classe classe){
        return classeRepository.save(classe);
    }

    @GetMapping
    public List<Classe> classes(){
        return classeRepository.findAll();
    }
}
