package br.uem.automatoregular.reconhecedor;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ReconhecedorSimboloParTest {

	@Test
	public void deveriaRetornarVerdadeiro() {
		Reconhecedor reconhecedor = new ReconhecedorSimboloPar("00", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloPar("0101", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloPar("1010", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloPar("001", "0");
		assertTrue(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloPar("00100", "0");
		assertTrue(reconhecedor.testar());

	}

	@Test
	public void deveriaRetornarFalso() {
		Reconhecedor reconhecedor = new ReconhecedorSimboloPar("0", "0");
		assertFalse(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloPar("000", "0");
		assertFalse(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloPar("0001", "0");
		assertFalse(reconhecedor.testar());

		reconhecedor = new ReconhecedorSimboloPar("0001", "0");
		assertFalse(reconhecedor.testar());

	}

}
