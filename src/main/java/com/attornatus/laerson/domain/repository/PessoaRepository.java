package com.attornatus.laerson.domain.repository;

import com.attornatus.laerson.domain.model.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);

}