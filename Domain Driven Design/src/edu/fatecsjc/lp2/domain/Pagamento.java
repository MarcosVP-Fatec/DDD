package edu.fatecsjc.lp2.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Pagamento {

	String  formaDePagamento; //Cartão de Crédito, Cartão de Débito, Débito em CC, etc.
	int     numeroCartao;
	Date    dataValidade;	
	int	    bancoNumero;
	int		bancoAgencia;
	int	    bancoTipoDaConta;
	String	bancoConta;
	String  bancoDV;
	
}
