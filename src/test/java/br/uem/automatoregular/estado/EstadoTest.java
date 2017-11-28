package br.uem.automatoregular.estado;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EstadoTest {

	@Test
	public void testImparWhen0() {
		List<String> characteres = Arrays.asList(new String[] {"0"});
		assertEquals(TipoReconhecedor.IMPAR, TipoReconhecedor.getEstadoBySize(characteres));
		
		characteres = Arrays.asList(new String[] {"0", "0", "0"});
		Assert.assertEquals(TipoReconhecedor.IMPAR, TipoReconhecedor.getEstadoBySize(characteres));
	}
	
	@Test
	public void testImparWhen1() {
		List<String> characteres = Arrays.asList(new String[] {"1"});
		Assert.assertEquals(TipoReconhecedor.IMPAR, TipoReconhecedor.getEstadoBySize(characteres));
		
		characteres = Arrays.asList(new String[] {"1", "1", "1"});
		Assert.assertEquals(TipoReconhecedor.IMPAR, TipoReconhecedor.getEstadoBySize(characteres));
	}

	@Test
	public void testParWhen0() {
		List<String> characteres = Arrays.asList(new String[] {"0", "0"});
		Assert.assertEquals(TipoReconhecedor.PAR, TipoReconhecedor.getEstadoBySize(characteres));
	}
	
	@Test
	public void testParWhen1() {
		List<String> characteres = Arrays.asList(new String[] {"1", "1"});
		Assert.assertEquals(TipoReconhecedor.PAR, TipoReconhecedor.getEstadoBySize(characteres));
	}
}
