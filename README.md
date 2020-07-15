
# Domain Driven Design - DDD

Ex: Pagamento

# Application
```java
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
```
# Domain
## Entidade - Pagamento
```java
package edu.fatecsjc.lp2.domain.generico;

import java.util.Date;

import edu.fatecsjc.lp2.domain.enums.TipoPagamentoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Pagamento {

	TipoPagamentoEnum formaDePagamento; 
	Date dataValidade;
	int bancoNumero;
	int bancoAgencia;
	int bancoTipoDaConta;
	String bancoConta;
	String bancoDV;
	int usuarioId;
}

```
## Objeto de Valor - Cartão de Crédito
```java
package edu.fatecsjc.lp2.domain.valueObject;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CartaoDeCredito {
    String numero;
    Date validade;
    String cvv;
}
```
# Serviço

## Serviço - DomainService
```java
package edu.fatecsjc.lp2.domain.services;

import edu.fatecsjc.lp2.domain.repositorios.IRepositorio;

public abstract class DomainService <T> {
    private IRepositorio<T> repositorio;

    public DomainService(IRepositorio <T> repositorio)
    {
        this.repositorio = repositorio;
    }
    public void alterar(T model) {
        repositorio.alterar(model);
    }
    public void buscar(String filtro, int pagina, int qtdRegistros, long totalRegistros) {
        repositorio.buscar(filtro, pagina, qtdRegistros, totalRegistros);
    }
    public void excluir(T model) {
        repositorio.excluir(model);
    }
    public void inserir(T model) {
        repositorio.inserir(model);
    }
}
```

## Serviço - PagamentoService
```java
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
```

## Repositorio - IRepositorio
```java
package edu.fatecsjc.lp2.domain.repositorios;

public interface IRepositorio<T>{
    void alterar(T model);
    void buscar(String filtro, int pagina, int qtdRegistros, long totalRegistros);
    T excluir(T model);
    T inserir(T model);
}
```

## Repositorio - IPagamentoRepositorio
```java
package edu.fatecsjc.lp2.domain.repositorios;

import edu.fatecsjc.lp2.domain.generico.Pagamento;

public interface IPagamentoRepositorio extends IRepositorio<Pagamento> {
    public void pagar();
    public void rollback();
}
```

# Infra

## Repositorio - PagamentoRepositorio
```java
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
```
