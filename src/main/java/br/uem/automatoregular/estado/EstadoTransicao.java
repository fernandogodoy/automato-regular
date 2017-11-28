package br.uem.automatoregular.estado;

import br.uem.automatoregular.reconhecedor.Reconhecedor;

public enum EstadoTransicao {

	FINAL, INTERMEDIARIA;

	public static EstadoTransicao verify(Reconhecedor reconhecedor) {
		return reconhecedor.testar() ? FINAL : INTERMEDIARIA;
	}

}
