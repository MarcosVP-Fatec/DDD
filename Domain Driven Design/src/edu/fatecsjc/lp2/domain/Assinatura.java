package edu.fatecsjc.lp2.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Assinatura {
	
	int 		registroInterno;
	String 		planoDeAssinatura;
	int 		diaPagamento;
	Date 		inicio;
	Date		limiteDegustacao; //Usar quando a assinatura for promocional
	Usuario 	usuario;
	Pagamento 	pagamento;

}
