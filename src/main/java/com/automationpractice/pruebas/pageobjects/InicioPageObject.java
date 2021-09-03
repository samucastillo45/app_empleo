package com.automationpractice.pruebas.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class InicioPageObject extends PageObject {
	
	By btnRegistrar =  By.xpath("//a[@class='login']");
	By txtCorreo = By.name("email_create");
	By btnCreate = By.id("SubmitCreate");
	By btnGenero = By.id("id_gender1");
	By txtNombre = By.name("customer_firstname");
	By txtClave = By.id("passwd");
	By txtApellido = By.name("customer_lastname");
	
	By selectDay = By.id("days");
	By selectMonths = By.id("months");
	By selectYears = By.id("years");
	By selectN = By.id("optin");
	By txtEmpresa = By.name("company");
	By txtDireccion = By.name("address1");
	By txtDireccion2 = By.name("address2");
	By txtCiudad = By.name("city");
	By selectStat = By.id("id_state");
	By txtCodPostal = By.id("postcode");
	By selectCountry = By.id("id_country");
	By txtOtro = By.name("other");
	By txtTele1 = By.name("phone");
	By txtTele2 = By.name("phone_mobile");
	By btnFinal = By.name("submitAccount");
	
	By btnV =  By.xpath("//a[@class='account']");
	
	By mjeError = By.xpath("//div[@id='create_account_error']//li");
	
	public void clickRegister() {
		getDriver().findElement(btnRegistrar).click();
	}
	
	public void escribirCorreo(String correo) {
		getDriver().findElement(txtCorreo).sendKeys(correo);
	}
	
	public void clickCreate() {
		getDriver().findElement(btnCreate).click();
	}
	
	public void clickGender() {
		getDriver().findElement(btnGenero).click();
	}
	
	

	
	public void escribirName(String nombre) {
		getDriver().findElement(txtNombre).sendKeys(nombre);
	}

	public void escribirApellido(String apellido) {
		getDriver().findElement(txtApellido).sendKeys(apellido);
	}
	
	public void escribirClave(String clave) {
		getDriver().findElement(txtClave).sendKeys(clave);
	}
	
	
	public void clickDia() {
		Select d=new Select (getDriver().findElement(selectDay));
		d.selectByValue("4");
	}
	
	
	public void clickMes() {
		Select m=new Select (getDriver().findElement(selectMonths));
		m.selectByValue("7");
	}
	
	public void clickYear() {
		Select y=new Select (getDriver().findElement(selectYears));
		y.selectByValue("1994");
	}
	
	public void clickN() {
		getDriver().findElement(selectN).click();
	}
	
	public void escribirDir(String compa) {
		getDriver().findElement(txtEmpresa).sendKeys(compa);
	}
	
	
	public void escribirComp(String dir) {
		getDriver().findElement(txtDireccion).sendKeys(dir);
	}
	
	public void escribirDir2(String dir2) {
		getDriver().findElement(txtDireccion2).sendKeys(dir2);
	}
	
	public void escribirCiudad(String ciudad) {
		getDriver().findElement(txtCiudad).sendKeys(ciudad);
	}
	
	public void clickState() {
		Select state=new Select (getDriver().findElement(selectStat));
		state.selectByValue("9");
	}
	
	public void escribirCod(String codigopost) {
		getDriver().findElement(txtCodPostal).sendKeys(codigopost);
	}
	
	public void clickCountry() {
		Select count=new Select (getDriver().findElement(selectCountry));
		count.selectByValue("21");
	}
	
	public void escribirOtro(String otro) {
		getDriver().findElement(txtOtro).sendKeys(otro);
	}
	
	public void escribirTel1(String tel1) {
		getDriver().findElement(txtTele1).sendKeys(tel1);
	}
	
	public void escribirTel2(String tel2) {
		getDriver().findElement(txtTele2).sendKeys(tel2);
	}
	
	
	public void clickRegistrarse() {
		getDriver().findElement(btnFinal).click();
	}
	
	
	public void validarPresenciaDeUser() {
		assertThat(getDriver().findElement(btnV).isDisplayed(), Matchers.is(true));
	}
	
	
	public void validarMensajeDeError(String texto) {
		assertThat(getDriver().findElement(mjeError).getText(), Matchers.is(texto));
	System.out.println(getDriver().findElement(mjeError).getText());
	}
	
	
	
}