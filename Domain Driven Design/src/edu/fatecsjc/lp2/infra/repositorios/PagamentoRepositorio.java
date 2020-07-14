package edu.fatecsjc.lp2.infra.repositorios;

import edu.fatecsjc.lp2.domain.generico.Pagamento;
import edu.fatecsjc.lp2.domain.repositorios.IPagamentoRepositorio;

public class PagamentoRepositorio implements IPagamentoRepositorio {

    @Override
    public void alterar(Pagamento model) {
        // TODO Auto-generated method stub
    }

    @Override
    public void buscar(String filtro, int pagina, int qtdRegistros, long totalRegistros) {
        // TODO Auto-generated method stub
    }

    @Override
    public Pagamento excluir(Pagamento model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pagamento inserir(Pagamento model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void pagar() {
        // TODO Auto-generated method stub
    }

    @Override
    public void rollback() {
        // TODO Auto-generated method stub
    }
   
}