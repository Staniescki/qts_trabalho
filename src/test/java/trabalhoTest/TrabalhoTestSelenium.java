package trabalhoTest;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TrabalhoTestSelenium {
	
	 static WebDriver driver = null;
     
     private static String namePaginaPrincipal ;
  
   
   @BeforeClass
   public static void setUp() {
        System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver_win32\\chromedriver.exe");
	        
       
        driver = new ChromeDriver();

       driver.get("C:\\Users\\Diego\\eclipse-workspace\\Trabalho_QTS\\src\\trabalho\\trabalho2-1.html");
   
       namePaginaPrincipal = driver.getWindowHandle();
   }
   
   
   //CASO DE TESTE 1
   
   @Test
   public void testValorValidosCampoNome(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("Diego");
	   campoEndereco.sendKeys("Noel Rosa");
	   campoSexo.sendKeys("m");
	   campoIdade.sendKeys("35");
       submit.click();
       Alert alert = driver.switchTo().alert();
       Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
       alert.accept();
	   
   }
   
   @Test
   public void testValorInvalidosCampoNome(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("");
	   campoEndereco.sendKeys("Noel Rosa");
	   campoSexo.sendKeys("m");
	   campoIdade.sendKeys("35");
       submit.click();
       String codigProximaPagina =  driver.getPageSource();
       Assert.assertTrue(codigProximaPagina.contains("Preencha o campo nome"));
	   
   }
   
   
   //CASO DE TESTE 2
   
   
   @Test
   public void testValorValidosCampoEndereco(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("Felipe");
	   campoEndereco.sendKeys("Assis Brasil");
	   campoSexo.sendKeys("m");
	   campoIdade.sendKeys("30");
       submit.click();
       Alert alert = driver.switchTo().alert();
       Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
       alert.accept();
	   
   }
   
   @Test
   public void testValorInvalidosCampoEndereco(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("Felipe");
	   campoEndereco.sendKeys("");
	   campoSexo.sendKeys("m");
	   campoIdade.sendKeys("31");
       submit.click();
       String codigProximaPagina =  driver.getPageSource();
       Assert.assertTrue(codigProximaPagina.contains("Preencha o campo endereco"));
	   
   }
   
   
   
   //CASO DE TESTE 3
   
   @Test
   public void testValorValidosCampoSexo(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("Roberto");
	   campoEndereco.sendKeys("Plinio");
	   campoSexo.sendKeys("m");
	   campoIdade.sendKeys("15");
       submit.click();
       Alert alert = driver.switchTo().alert();
       Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
       alert.accept();
	   
   }
   
   
   @Test
   public void testValorInvalidosCampoSexo(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("Felipe");
	   campoEndereco.sendKeys("Parana");
	   campoSexo.sendKeys("");
	   campoIdade.sendKeys("31");
       submit.click();
       String codigProximaPagina =  driver.getPageSource();
       Assert.assertTrue(codigProximaPagina.contains("Selecione um valor para o campo sexo"));
	   
   }
   
   //CASO DE TESTE 4
   
   @Test
   public void testValorValidosCampoIdade(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("Paulo");
	   campoEndereco.sendKeys("Baltazar");
	   campoSexo.sendKeys("m");
	   campoIdade.sendKeys("18");
       submit.click();
       Alert alert = driver.switchTo().alert();
       Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
       alert.accept();
	   
   }
   
   
   @Test
   public void testValorInvalidosCampoIdade(){
	   
	   WebElement campoNome = driver.findElement(By.id("nome"));
	   WebElement campoEndereco = driver.findElement(By.id("endereco"));
	   WebElement campoSexo = driver.findElement(By.id("sexo"));
	   WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
	   campoNome.sendKeys("Patrick");
	   campoEndereco.sendKeys("Belo Horizonte");
	   campoSexo.sendKeys("m");
	   campoIdade.sendKeys("-1");
       submit.click();
       String codigProximaPagina =  driver.getPageSource();
       Assert.assertTrue(codigProximaPagina.contains("Preencha o campo idade com valores acima de 0"));
	   
   }
   
   //CASO DE TESTE 5
   
   @Test
   public void testTituloPagina(){
     driver.get("C:\\Users\\Diego\\Desktop\\senai_2020_qts\\src\\main\\java\\trabalho\\trabalho2-1.html");
     String tituloExperado ="Trabalho 2-1";        
     Assert.assertEquals(tituloExperado,driver.getTitle());
   }
   
   
   
	
	
   @AfterClass
   public static void tearDown() {
   	
       driver.quit();
   }
	

}
