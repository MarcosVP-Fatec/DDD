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