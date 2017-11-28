package br.uem.automatoregular.estado;

import java.util.List;

public enum TipoReconhecedor {
	
	PAR, IMPAR;

	public static TipoReconhecedor getEstadoBySize(List<String> characteres) {
		return characteres.size() % 2 == 0 ? PAR : IMPAR;
	}

}
