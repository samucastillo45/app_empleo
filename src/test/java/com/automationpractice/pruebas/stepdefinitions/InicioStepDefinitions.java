package com.automationpractice.pruebas.stepdefinitions;

import java.util.List;



import com.automationpractice.pruebas.steps.InicioSteps;
import com.automationpractice.pruebas.models.Registro;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class InicioStepDefinitions {
	
	@Steps
	InicioSteps inicioSteps;
	
	@Dado("^que estoy en la pagina de Inicio de LogoYour$")
	public void queEstoyEnLaPaginaDeInicioDeLogoYour() {
		inicioSteps.abrirAplicaciondeYourLogo();
		inicioSteps.clickRegister();
	}

	@Cuando("^ingreso al enlace Sign in$")
	public void ingresoAlEnlaceSignIn(List<Registro> listaRegistro) throws InterruptedException {
		inicioSteps.escribirCorreo(listaRegistro.get(0).getCorreo());
		inicioSteps.clickEnCreateAccount();
		
		
	}

	@Cuando("^lleno los campos de la cuenta$")
	public void llenoLosCamposDeLaCuenta(List<Registro> listaRegistro) throws InterruptedException {
		inicioSteps.clickEnGender();
		inicioSteps.escribirNom(listaRegistro.get(0).getNombre());
		inicioSteps.escribirApe(listaRegistro.get(0).getApellido());
		inicioSteps.escribirG(listaRegistro.get(0).getClave());
		inicioSteps.clickD();
		inicioSteps.clickM();
		inicioSteps.clickY();
		inicioSteps.clickEnAsd();
		inicioSteps.escribirDirrecc(listaRegistro.get(0).getCompa());
		inicioSteps.escribirComp(listaRegistro.get(0).getDir());
		inicioSteps.escribirDirrecc2(listaRegistro.get(0).getDir2());
		inicioSteps.escribirCiudad(listaRegistro.get(0).getCiudad());
		inicioSteps.clickStates();
		inicioSteps.escribirCodPost(listaRegistro.get(0).getCodigopost());
		inicioSteps.clickCountr();
		inicioSteps.escribirOther(listaRegistro.get(0).getOtro());
		inicioSteps.escribirTelef1(listaRegistro.get(0).getTel1());
		inicioSteps.escribirTelef2(listaRegistro.get(0).getTel2());
		inicioSteps.clickRegis();
	}

	@Entonces("^valido que aparezca mi nombre y apellido en el menu$")
	public void validoQueAparezcaElBotonCreateAnAccount() {
		inicioSteps.validarPresenciaDeS();
	}
	
	@Entonces("^valido que aparezca el mensaje de error (.*)$")
	public void validoQueAparezcaElMensajeDeErrorAnAccountUsingThisEmailAddressHasAlreadyBeenRegisteredPleaseEnterAValidPasswordOrRequestANewOne(String mensaje) {
		inicioSteps.validarPresenciaDeMensaje(mensaje);
	}

	
}