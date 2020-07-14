package edu.fatecsjc.lp2.domain.repositorios;

import edu.fatecsjc.lp2.domain.generico.Pagamento;

public interface IPagamentoRepositorio extends IRepositorio<Pagamento> {
    public void pagar();
    public void rollback();
}
