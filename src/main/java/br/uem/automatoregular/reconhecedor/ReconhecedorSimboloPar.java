package br.uem.automatoregular.reconhecedor;

import br.uem.automatoregular.AutomatoRegularImpl;
import br.uem.automatoregular.estado.TipoReconhecedor;

/**
 * Responsável por reconhecer se um determinado simbolo possui quantidade de
 * caractares de tamanho PAR em um determinada palavra.
 * 
 * @author Fernando
 *
 */
public class ReconhecedorSimboloPar implements Reconhecedor {

	private String simbolo;
	private String palavra;

	/**
	 * 
	 * @param palavra
	 *            Palavra a ser avaliada
	 * @param simbolo
	 *            Simbolo ao qual deseja saber se a quantidade de caracteres
	 *            semelhantes existente na palavrá é PAR
	 */
	public ReconhecedorSimboloPar(String palavra, String simbolo) {
		this.palavra = palavra;
		this.simbolo = simbolo;
	}

	@Override
	public boolean testar() {
		AutomatoRegularImpl automato = new AutomatoRegularImpl(palavra);
		TipoReconhecedor tipoReconhecedor = automato.run().get(simbolo);
		return tipoReconhecedor.equals(TipoReconhecedor.PAR);
	}

}
