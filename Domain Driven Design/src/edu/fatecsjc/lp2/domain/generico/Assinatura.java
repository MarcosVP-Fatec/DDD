package edu.fatecsjc.lp2.domain.generico;

import java.util.Date;

import edu.fatecsjc.lp2.domain.generico.Pagamento;
import edu.fatecsjc.lp2.domain.principal.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Assinatura {

	int registroInterno;
	String planoDeAssinatura;
	int diaPagamento;
	Date inicio;
	Date limiteDegustacao; // Usar quando a assinatura for promocional
	Usuario usuario;
	Pagamento pagamento;

}
