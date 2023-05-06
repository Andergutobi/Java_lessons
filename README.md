<!DOCTYPE html>
<html>
<head>
	<title>Cheat Sheet de Java</title>
	<style>
		table {
		  border-collapse: collapse;
		  width: 100%;
		}

		th, td {
		  text-align: left;
		  padding: 8px;
		}

		tr:nth-child(even){background-color: #f2f2f2}

		th {
		  background-color: #4CAF50;
		  color: white;
		}
	</style>
</head>
<body>

	<h1>Cheat Sheet de Java</h1>

	<table>
	  <thead>
	    <tr>
	      <th>Concepto</th>
	      <th>Ejemplo de código</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <td>Clases y Objetos</td>
	      <td>
	      	<pre>
public class Persona {
	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void saludar() {
		System.out.println("Hola, mi nombre es " + this.nombre);
	}
}

Persona persona = new Persona("Juan", 25);
persona.saludar();
	      	</pre>
	      </td>
	    </tr>
	    <tr>
	      <td>Variables y Tipos de Datos</td>
	      <td>
	      	<pre>
int edad = 25;
double precio = 3.99;
String nombre = "Juan";
boolean esMayorDeEdad = true;
	      	</pre>
	      </td>
	    </tr>
	    <tr>
	      <td>Operadores Aritméticos</td>
	      <td>
	      	<pre>
int resultado = 2 + 3;
int resultado2 = 5 - 3;
int resultado3 = 2 * 3;
double resultado4 = 10.0 / 3.0;
int resultado5 = 10 % 3;
	      	</pre>
	      </td>
	    </tr>
	    <tr>
	      <td>Operadores de Comparación</td>
	      <td>
	      	<pre>
int edad = 25;
boolean esMayorDeEdad = edad > 18;
boolean esIgual = edad == 25;
boolean noEsIgual = edad != 18;
boolean esMenorIgual = edad <= 30;
boolean esMayorIgual = edad >= 20;
	      	</pre>
	      </td>
	    </tr>
	    <tr>
	      <td>Operadores Lógicos</td>
	      <td>
	      	<pre>
boolean esMayorDeEdad = true;
boolean tieneLicencia = false;
boolean puedeConducir = esMayorDeEdad && tieneLicencia;
boolean noPuedeConducir = !puedeConducir;
boolean puedeTomarBebidasAlcoholicas = esMayorDeEdad || tieneLicencia;
	      	</pre>
	      </td>
	    </tr>
	    <tr>
	      <td>Condicionales</td>
	      <td>
	      	<pre>
int edad = 25;

if (edad > 18) {
	System.out.println("Es mayor de edad
