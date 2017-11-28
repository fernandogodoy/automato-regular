package br.uem.automatoregular;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import br.uem.automatoregular.estado.TipoReconhecedor;

public class AutomatoRegularImplTest {

	@Test
	public void deveriaRetornarVazio() {
		AutomatoRegular automato = new AutomatoRegularImpl("");
		Map<String, TipoReconhecedor> estados = automato.run();
		assertEquals(0, estados.size());
	}

	@Test
	public void deveriaRetornarIMPAR() {
		AutomatoRegular automato = new AutomatoRegularImpl("0");
		assertEquals(automato.run().get("0"), TipoReconhecedor.IMPAR);
		
		automato = new AutomatoRegularImpl("1");
		assertEquals(automato.run().get("1"), TipoReconhecedor.IMPAR);
		
		automato = new AutomatoRegularImpl("01");
		assertEquals(automato.run().get("0"), TipoReconhecedor.IMPAR);
		assertEquals(automato.run().get("1"), TipoReconhecedor.IMPAR);
		
		automato = new AutomatoRegularImpl("10");
		assertEquals(automato.run().get("1"), TipoReconhecedor.IMPAR);
		assertEquals(automato.run().get("0"), TipoReconhecedor.IMPAR);
	}


	@Test
	public void deveriaRetornarPAR() {
		AutomatoRegular automato = new AutomatoRegularImpl("00");
		assertEquals(automato.run().get("0"), TipoReconhecedor.PAR);
		
		automato = new AutomatoRegularImpl("11");
		assertEquals(automato.run().get("1"), TipoReconhecedor.PAR);
		
		automato = new AutomatoRegularImpl("0101");
		assertEquals(automato.run().get("0"), TipoReconhecedor.PAR);
		assertEquals(automato.run().get("1"), TipoReconhecedor.PAR);
		
		automato = new AutomatoRegularImpl("1010");
		assertEquals(automato.run().get("1"), TipoReconhecedor.PAR);
		assertEquals(automato.run().get("0"), TipoReconhecedor.PAR);
	}


}
