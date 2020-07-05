package edu.fatecsjc.lp2.domain.Pagamento;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Pagamento {

	String formaDePagamento; 
	int numeroCartao;
	Date dataValidade;
	int bancoNumero;
	int bancoAgencia;
	int bancoTipoDaConta;
	String bancoConta;
	String bancoDV;

}
