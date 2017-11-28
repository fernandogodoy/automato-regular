package br.uem.automatoregular;

import java.util.Map;

import br.uem.automatoregular.estado.TipoReconhecedor;

public interface AutomatoRegular {

	Map<String, TipoReconhecedor> run();

}
