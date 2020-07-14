package edu.fatecsjc.lp2.domain.repositorios;

public interface IRepositorio<T>{
    void alterar(T model);
    void buscar(String filtro, int pagina, int qtdRegistros, long totalRegistros);
    T excluir(T model);
    T inserir(T model);
}
