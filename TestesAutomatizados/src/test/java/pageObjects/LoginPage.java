package pageObjects;


import  static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginPage {
	
	public void informarCampoUsuario(String usuario) {
		driver.findElement(By.name("user-name")).sendKeys(usuario);
	}
	
	
		
	public void informarCampoSenha(String senha) {
		driver.findElement(By.name("password")).sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		driver.findElement(By.name("login-button")).click();
	}
}
