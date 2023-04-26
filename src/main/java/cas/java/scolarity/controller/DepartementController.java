package cas.java.scolarity.controller;

import cas.java.scolarity.models.Departement;
import cas.java.scolarity.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/departements")
@RestController
public class DepartementController {
    @Autowired
    private final DepartementRepository departementRepository;

    public DepartementController(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @PostMapping
    public Departement saveDepartement(@RequestBody Departement departement){
        return departementRepository.save(departement);
    }

    @GetMapping
    public List<Departement> departements(){return departementRepository.findAll();}
}
