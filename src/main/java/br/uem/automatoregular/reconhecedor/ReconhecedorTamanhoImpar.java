package br.uem.automatoregular.reconhecedor;

import java.util.Map;

import br.uem.automatoregular.AutomatoRegularImpl;
import br.uem.automatoregular.estado.TipoReconhecedor;

public class ReconhecedorTamanhoImpar implements Reconhecedor {
	
	private String palavra;

	public ReconhecedorTamanhoImpar(String palavra) {
		this.palavra = palavra;
	}

	@Override
	public boolean testar() {
		AutomatoRegularImpl automato = new AutomatoRegularImpl(palavra);
		Map<String, TipoReconhecedor> tipoReconhecedores = automato.run();
		long contador = tipoReconhecedores.values().stream().filter(tipo -> TipoReconhecedor.IMPAR.equals(tipo)).count();
		return tipoReconhecedores.size() == contador;
	}

}
