package com.thomaz.cursomc.domain;

import com.thomaz.cursomc.domain.enunms.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {

    private Integer numeroDeparcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeparcelas) {
        super(id, estado, pedido);
        this.numeroDeparcelas = numeroDeparcelas;
    }

    public Integer getNumeroDeparcelas() {
        return numeroDeparcelas;
    }

    public void setNumeroDeparcelas(Integer numeroDeparcelas) {
        this.numeroDeparcelas = numeroDeparcelas;
    }
}
