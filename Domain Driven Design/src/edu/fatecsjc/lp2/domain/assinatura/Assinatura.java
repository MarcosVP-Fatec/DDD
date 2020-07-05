package edu.fatecsjc.lp2.domain.Assinatura;

import java.util.Date;

import edu.fatecsjc.lp2.domain.Pagamento.Pagamento;
import edu.fatecsjc.lp2.domain.Usuario.Usuario;
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
