package br.uem.automatoregular.reconhecedor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReconhecedorSimboloImparTest {

	@Test
	public void deveriaRetornarVerdadeiro() {
		Reconhecedor reconhecedor = new ReconhecedorSimboloImpar("0", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloImpar("01", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloImpar("01010", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloImpar("0010", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloImpar("0100", "0");
		assertTrue(reconhecedor.testar());

	}

	@Test
	public void deveriaRetornarFalso() {
		Reconhecedor reconhecedor = new ReconhecedorSimboloImpar("00", "0");
		assertFalse(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloImpar("0000", "0");
		assertFalse(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloImpar("001", "0");
		assertFalse(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloImpar("00100", "0");
		assertFalse(reconhecedor.testar());

	}

}
