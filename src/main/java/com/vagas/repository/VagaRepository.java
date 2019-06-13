package com.vagas.repository;


import com.vagas.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VagaRepository extends JpaRepository<Vaga, Long> {

    Optional<Vaga> findByDescricaoAndAndEmpresa(String descricao, String empresa);
}
