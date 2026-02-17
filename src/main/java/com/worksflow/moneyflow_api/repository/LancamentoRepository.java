package com.worksflow.moneyflow_api.repository;

import com.worksflow.moneyflow_api.model.Lancamento;
import com.worksflow.moneyflow_api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
