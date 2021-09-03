package com.automationpractice.pruebas.steps;

import com.automationpractice.pruebas.pageobjects.InicioPageObject;

import net.thucydides.core.annotations.Step;

public class InicioSteps {
	InicioPageObject inicioPOM=new InicioPageObject();
	@Step
	public void abrirAplicaciondeYourLogo() {
		inicioPOM.open();
	}
	
	@Step
	public void clickRegister() {
		inicioPOM.clickRegister();
	}
	
	@Step
	public void escribirCorreo(String correo) {
		inicioPOM.escribirCorreo(correo);
	}
	
	@Step
	public void clickEnCreateAccount() {
		inicioPOM.clickCreate();
	}
	
	@Step
	public void clickEnGender() {
		inicioPOM.clickGender();
	}

	
	
	@Step
	public void escribirNom(String nombre) {
		inicioPOM.escribirName(nombre);
	}
	
	@Step
	public void escribirApe(String apellido) {
		inicioPOM.escribirApellido(apellido);
	}
	
	@Step
	public void escribirG(String clave) {
		inicioPOM.escribirClave(clave);
	}
	
	@Step
	public void clickD(){
		inicioPOM.clickDia();
	}
	
	@Step
	public void clickM(){
		inicioPOM.clickMes();
	}
	
	@Step
	public void clickY(){
		inicioPOM.clickYear();
	}
	
	@Step
	public void clickEnAsd() {
		inicioPOM.clickN();
	}
	
	@Step
	public void escribirDirrecc(String compa) {
		inicioPOM.escribirDir(compa);
	}
	
	@Step
	public void escribirComp(String dir) {
		inicioPOM.escribirComp(dir);
	}
	
	@Step
	public void escribirDirrecc2(String dir2) {
		inicioPOM.escribirDir2(dir2);
	}
	
	@Step
	public void escribirCiudad(String ciudad) {
		inicioPOM.escribirCiudad(ciudad);
	}
	
	@Step
	public void clickStates(){
		inicioPOM.clickState();
	}
	
	@Step
	public void escribirCodPost(String codigopost) {
		inicioPOM.escribirCod(codigopost);
	}
	
	@Step
	public void clickCountr(){
		inicioPOM.clickCountry();
	}
	
	
	@Step
	public void escribirOther(String otro) {
		inicioPOM.escribirOtro(otro);
	}
	
	@Step
	public void escribirTelef1(String tel1) {
		inicioPOM.escribirTel1(tel1);
	}
	
	@Step
	public void escribirTelef2(String tel2) {
		inicioPOM.escribirTel2(tel2);
	}	
	
	@Step
	public void clickRegis(){
		inicioPOM.clickRegistrarse();
	}
	
	@Step
	public void validarPresenciaDeS() {
		inicioPOM.validarPresenciaDeUser();
	}
	
	@Step
	public void validarPresenciaDeMensaje(String mensaje) {
		inicioPOM.validarMensajeDeError(mensaje);
	}

}