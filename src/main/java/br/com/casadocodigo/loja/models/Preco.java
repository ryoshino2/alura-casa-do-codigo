package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Preco {

	private BigDecimal valor;
	@Enumerated(EnumType.STRING)
	private TipoPreco tipoPreco;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoPreco getTipo() {
		return tipoPreco;
	}

	public void setTipo(TipoPreco tipoPreco) {
		this.tipoPreco = tipoPreco;
	}
}