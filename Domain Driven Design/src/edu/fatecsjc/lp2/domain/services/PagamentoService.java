package edu.fatecsjc.lp2.domain.services;

import edu.fatecsjc.lp2.domain.generico.Pagamento;
import edu.fatecsjc.lp2.domain.repositorios.IRepositorio;
import edu.fatecsjc.lp2.domain.valueObject.CartaoDeCredito;

public class PagamentoService extends DomainService<Pagamento> {

    private static IRepositorio<Pagamento> repositorio;

    public PagamentoService() {
        super(repositorio);
    }
    @Override
    public void inserir(Pagamento model){
        if(model != null){
            repositorio.inserir(model);
        }
    }
    public void realizarPagamento(Pagamento p, CartaoDeCredito cartao){
        if(cartao != null){
            repositorio.inserir(p);
            this.liberarAcesso();
            this.emailConfirmacao();
        }
    }
    
    public void liberarAcesso(){
        //TODO liberar acesso
    }
    public void emailConfirmacao(){
        //TODO email de confirmacao
    }
}