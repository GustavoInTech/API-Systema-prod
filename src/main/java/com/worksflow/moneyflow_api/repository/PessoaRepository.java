package com.worksflow.moneyflow_api.repository;

import com.worksflow.moneyflow_api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
