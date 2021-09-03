package com.automationpractice.pruebas.models;



public class Registro {
	String correo,nombre,apellido,clave,dir,compa,dir2,ciudad,codigopost,otro,tel1,tel2;

	
	
	public Registro(String correo, String nombre, String apellido, String clave,  String dir,  String compa, String dir2,
			String ciudad, String codigopost, String otro, String tel1, String tel2) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.dir = dir;
		this.compa = compa;
		this.dir2 = dir2;
		this.ciudad = ciudad;
		this.codigopost = codigopost;
		this.otro = otro;
		this.tel1 = tel1;
		this.tel2 = tel2;
	}

	public String getCorreo() {
		return correo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getClave() {
		return clave;
	}

	
	public String getDir() {
		return dir;
	}
	
	public String getCompa() {
		return compa;
	}
	
	public String getDir2() {
		return dir2;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	public String getCodigopost() {
		return codigopost;
	}
	
	public String getOtro() {
		return otro;
	}
	
	public String getTel1() {
		return tel1;
	}
	
	public String getTel2() {
		return tel2;
	}
	
}
	
	
	
	
	

