package edu.fatecsjc.lp2.application;

import edu.fatecsjc.lp2.domain.generico.Pagamento;
import edu.fatecsjc.lp2.domain.services.PagamentoService;
import edu.fatecsjc.lp2.domain.valueObject.CartaoDeCredito;

public class PagamentoAppService {
    private int usuarioId;
    private PagamentoService pagamentoService;
    public PagamentoAppService(int usuarioId) {
        this.usuarioId = usuarioId;
        this.pagamentoService = new PagamentoService();
    }

    public void efetuarPagamento(CartaoDeCredito cartao, Pagamento pagamento){
        pagamento.setUsuarioId(usuarioId);
        pagamentoService.realizarPagamento(pagamento, cartao);
    }
}