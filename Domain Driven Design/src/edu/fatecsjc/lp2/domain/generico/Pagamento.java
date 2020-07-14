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
