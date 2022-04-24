package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;


@Controller
public class CalculadoraController {
	@GetMapping ("/menu")
	public String mostrarMenuCalculadora() {
		return "index";
	}
	
	@GetMapping ("/calculoSuma")
	public String getSumaPage( @RequestParam (name ="num1") int num1, @RequestParam (name ="num2") int num2, Model model) {//model aloja resultados
		int resultadoS =0;
		Calculadora nuevaCalculadora= new Calculadora();
		nuevaCalculadora.setN1(num1);
		nuevaCalculadora.setN2(num2);		
		nuevaCalculadora.resolverSuma();
		resultadoS=nuevaCalculadora.resolverSuma();
		model.addAttribute("resultadoS",resultadoS);
		return "resultadoS";
	}
	@GetMapping ("/calculoResta")
	public String getRestaaPage( @RequestParam (name ="num1") int num1, @RequestParam (name ="num2") int num2, Model model) {//model aloja resultados
		int resultadoR =0;
		Calculadora nuevaCalculadora= new Calculadora();
		nuevaCalculadora.setN1(num1);
		nuevaCalculadora.setN2(num2);		
		nuevaCalculadora.resolverResta();
		resultadoR=nuevaCalculadora.resolverResta();
		model.addAttribute("resultadoR",resultadoR);
		return "resultadoResta";
	}
	@GetMapping ("/calculoMultiplicacion")
	public String getMultiplicacionPage( @RequestParam (name ="num1") int num1, @RequestParam (name ="num2") int num2, Model model) {//model aloja resultados
		int resultadoM =0;
		Calculadora nuevaCalculadora= new Calculadora();
		nuevaCalculadora.setN1(num1);
		nuevaCalculadora.setN2(num2);		
		nuevaCalculadora.resolverMultiplicacion();
		resultadoM=nuevaCalculadora.resolverMultiplicacion();
		model.addAttribute("resultadoM",resultadoM);
		return "resultadoMultiplicacion";
	}
	@GetMapping ("/calculoDivision")
	public String getDivisionPage( @RequestParam (name ="num1") int num1, @RequestParam (name ="num2") int num2, Model model) {//model aloja resultados
		float resultadoD =0;
		Calculadora nuevaCalculadora= new Calculadora();
		nuevaCalculadora.setN1(num1);
		nuevaCalculadora.setN2(num2);		
		nuevaCalculadora.resolverDivision();
		resultadoD=nuevaCalculadora.resolverDivision();
		model.addAttribute("resultadoD",resultadoD);
		return "resultadoDivision";
	}
	@GetMapping ("/calculoPotencia")
	public String getPotenciaaPage( @RequestParam (name ="num1") int num1, @RequestParam (name ="num2") int num2, Model model) {//model aloja resultados
		int resultadoP =0;
		Calculadora nuevaCalculadora= new Calculadora();
		nuevaCalculadora.setN1(num1);
		nuevaCalculadora.setN2(num2);		
		nuevaCalculadora.resolverPotencia();
		resultadoP=nuevaCalculadora.resolverPotencia();
		model.addAttribute("resultadoP",resultadoP);
		return "resultadoPotencia";
	}
	@GetMapping ("/calculoRaiz")
	public String getRaizPage( @RequestParam (name ="num1") int num1, @RequestParam (name ="num2") int num2, Model model) {//model aloja resultados
		double resultadoRaiz =0;
		Calculadora nuevaCalculadora= new Calculadora();
		nuevaCalculadora.setN1(num1);
		nuevaCalculadora.setN2(num2);		
		nuevaCalculadora.resolverRaiz();
		resultadoRaiz=nuevaCalculadora.resolverRaiz();
		model.addAttribute("resultadoRaiz",resultadoRaiz);
		return "resultadoRaiz";
	}
}

 