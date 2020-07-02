package edu.fatecsjc.lp2.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Pagamento {

	String  formaDePagamento; //Cart�o de Cr�dito, Cart�o de D�bito, D�bito em CC, etc.
	int     numeroCartao;
	Date    dataValidade;	
	int	    bancoNumero;
	int		bancoAgencia;
	int	    bancoTipoDaConta;
	String	bancoConta;
	String  bancoDV;
	
}
