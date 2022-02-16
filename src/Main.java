import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import com.dio.bootcamp.dominio.Bootcamp;
import com.dio.bootcamp.dominio.Dev;
import com.dio.bootcamp.dominio.atividades.Atividades;
import com.dio.bootcamp.dominio.atividades.Curso;
import com.dio.bootcamp.dominio.atividades.Mentoria;

public class Main {

	public static void main(String[] args) {

		//Cadastrando atividades para criar bootcamp
		Atividades atividade1 = new Curso("L�gica de Programa��o",
				"Curso com conceitos b�sicos de l�gica", 4);
		
		Atividades atividade2 = new Curso("Introdu��o � POO",
				"Curso com conceitos b�sicos de POO", 2);
		
		Atividades atividade3 = new Mentoria("Mentoria de POO na pr�tica",
				"Mentoria para tirar d�vidas de POO", LocalDate.of(2022, 2, 25));
		
		Set<Atividades> atividades = new LinkedHashSet<Atividades>();
		atividades.add(atividade1);
		atividades.add(atividade2);
		atividades.add(atividade3);
	
		Bootcamp bootcamp = new Bootcamp("Bootcamp POO", "Bootcamp para aprender o b�sico de POO", atividades);
	
		//Criando e cadastrando dev
		Dev dev = new Dev("Maria Antonieta Santos");
	
		dev.inscreverBootcamp(bootcamp);
		
		//Progredindo no bootcamp
		while (!dev.getAtividadesInscritas().isEmpty()) {
			dev.progredir();
			System.out.println("Atividade conclu�da! Sua XP atual �: " + dev.calcularTotalXP()); 
		}
		System.out.println("Bootcamp conclu�do com sucesso.");
	
	}

}
