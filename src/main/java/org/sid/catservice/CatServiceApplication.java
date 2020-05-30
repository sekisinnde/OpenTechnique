package org.sid.catservice;

import org.junit.jupiter.api.Test;
import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
	//@Autowired
	//private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	//@Override
	//public void run(String... args) throws Exception {
		//produitRepository.save(new Produit(null,"Ordinateur Lx 45",6700,3));
		//produitRepository.save(new Produit(null,"Imprimante HP 45",1700,3));
		//produitRepository.save(new Produit(null,"Smart Phone Sumsung S9",8000,13));

		//produitRepository.findAll().forEach(p->{
			//System.out.println(p.toString());
		//});
	//}

	@Test
	public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
		GreetClient client = new GreetClient();
		client.startConnection("127.0.0.1", 6666);
		String response = client.sendMessage("hostname server");
		assertEquals("hello client", response);
	}




}
