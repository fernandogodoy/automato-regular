package br.uem.automatoregular;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.uem.automatoregular.estado.TipoReconhecedor;
import br.uem.automatoregular.util.AutomatoUtil;

public class AutomatoRegularImpl implements AutomatoRegular {

	private String palavra;

	public AutomatoRegularImpl(String palavra) {
		this.palavra = palavra;
	}

	public Map<String, TipoReconhecedor> run() {
		List<String> characteres = AutomatoUtil.toList(palavra);
		Map<String, List<String>> grupos = agrupar(characteres);
		return toEstados(grupos);
	}

	private Map<String, TipoReconhecedor> toEstados(Map<String, List<String>> grupos) {
		return grupos.entrySet().stream().collect(Collectors.toMap(Entry::getKey, v -> TipoReconhecedor.getEstadoBySize(v.getValue())));
	}

	private Map<String, List<String>> agrupar(List<String> characteres) {
		return characteres.stream().collect(Collectors.groupingBy(Function.identity()));
	}

}
