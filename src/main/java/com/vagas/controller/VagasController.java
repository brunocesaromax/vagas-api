package com.vagas.controller;

import com.vagas.model.Vaga;
import com.vagas.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/vagas")
public class VagasController {

    @Autowired
    private VagaRepository vagaRepository;

    @GetMapping
    public List<Vaga> listar(){
        return vagaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscar(@PathVariable Long id){

        Optional<Vaga> vaga  = vagaRepository.findById(id);

        if (!vaga.isPresent()){
            return ResponseEntity.notFound().build();
        }

        return  ResponseEntity.ok(vaga.get());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vaga adicionar(@Valid @RequestBody Vaga vaga){ //@RequestBody transforma json em objeto java
        return vagaRepository.save(vaga);
    }
}
