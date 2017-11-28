package br.uem.automatoregular.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class AutomatoUtil {

	public static final List<String> toList(String palavra) {
		return Arrays.asList(palavra.split("\\B")).stream()
												.filter(letra -> StringUtils.isNotBlank(letra))
												.collect(Collectors.toCollection(LinkedList::new));
	}
}
