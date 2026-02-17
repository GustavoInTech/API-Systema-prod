package com.worksflow.moneyflow_api.repository;

import com.worksflow.moneyflow_api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
