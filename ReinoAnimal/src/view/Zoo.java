package view;

import java.util.LinkedList;
import java.util.List;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class Zoo {

	public static void main(String[] args) {
		List<Animal> zoologico = new LinkedList<>();
		
		Mamifero camelo = new Mamifero();
		camelo.setAlimento("Vegetais");
		camelo.setAmbiente("Deserto");
		camelo.setComprimento(300);
		camelo.setCor("Laranja");
		camelo.setNome("Camelo");
		camelo.setVelocidade(20);
		zoologico.add(camelo);
		
		Mamifero urso = new Mamifero();
		urso.setAlimento("Vegetais e carnes");
		urso.setAmbiente("Taigas e tundras");
		urso.setComprimento(400);
		urso.setCor("Cinza");
		urso.setNome("Urso-do-Canadá");
		urso.setVelocidade(14);
		zoologico.add(urso);	
		
		Peixe tubarao = new Peixe();
		tubarao.setAmbiente("Água");
		tubarao.setCaracteristica("Barbatanas e caudas");
		tubarao.setComprimento(300);
		tubarao.setCor("Cinza");
		tubarao.setNome("Tubarão");
		tubarao.setPatas(0);
		tubarao.setVelocidade((float) 1.5);
		zoologico.add(tubarao);
		
		
		System.out.println("Zoológico");
		System.out.println("-------------------------------------");
		for(Animal i : zoologico) {
			i.dados();
			System.out.println("-------------------------------------");
		}

	}

}
