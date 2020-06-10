package trabalhoTest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import junit.framework.Assert;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)

public class trabalhoTestMock {
	
	
	@Test
	public void testGetPortoAlegre() {
		
		CorreioService correioService = Mockito.mock(CorreioService.class);
		when(correioService.buscaEndereco("9000000")).thenReturn("Porto Alegre");
		Assert.assertEquals("Porto Alegre", correioService.buscaEndereco("9000000"));
		
	}
	
	
	@Test
	public void testGetAssisBrasil() {
		
		CorreioService correioService = Mockito.mock(CorreioService.class);
		when(correioService.buscaEndereco("8000000")).thenReturn("Av. Assis Brasil");
		Assert.assertEquals("Av. Assis Brasil", correioService.buscaEndereco("8000000"));
		
	}
	
	
	

}
