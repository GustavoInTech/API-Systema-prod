package com.worksflow.moneyflow_api.service;

import com.worksflow.moneyflow_api.model.Lancamento;
import com.worksflow.moneyflow_api.model.Pessoa;
import com.worksflow.moneyflow_api.repository.LancamentoRepository;
import com.worksflow.moneyflow_api.repository.PessoaRepository;
import com.worksflow.moneyflow_api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
        if (pessoa == null || pessoa.isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }
}
