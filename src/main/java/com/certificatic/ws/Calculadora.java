package com.certificatic.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculadora {
	
	@WebMethod
	public int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	@WebMethod
	public int restar(int num1, int num2) {
		return num1 - num2;
	}
	
	@WebMethod
	public int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	@WebMethod
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	@WebMethod
	private int nuevoMetodo(int v1, int v2) {
		return v1 + v2;
	}
	

}
