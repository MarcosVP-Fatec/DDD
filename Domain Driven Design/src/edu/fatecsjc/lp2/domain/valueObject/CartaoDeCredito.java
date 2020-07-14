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