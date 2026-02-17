package com.worksflow.moneyflow_api.repository.lancamento;

import com.worksflow.moneyflow_api.model.Lancamento;
import com.worksflow.moneyflow_api.repository.filter.LancamentoFilter;
import com.worksflow.moneyflow_api.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    public Page<ResumoLancamento> resumir(LancamentoFilter filtro, Pageable pageable);
}
