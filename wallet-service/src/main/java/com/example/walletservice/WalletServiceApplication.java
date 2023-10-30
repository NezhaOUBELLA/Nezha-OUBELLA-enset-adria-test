package com.example.walletservice;

import com.example.walletservice.entities.Client;
import com.example.walletservice.entities.Wallet;
import com.example.walletservice.repository.ClientRepository;
import com.example.walletservice.repository.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepository,
							WalletRepository walletRepository){
		return args -> {
			clientRepository.saveAll(List.of(
					Client.builder()
							.nom("Nezha")
							.email("nezh@gmail.com")
							.build(),
					Client.builder()
							.nom("Zainab")
							.email("zainab@gmail.com")
							.build(),
					Client.builder()
							.nom("Fatiza")
							.email("fatiza@gmail.com")
							.build()
			));
			Random random = new Random();
			clientRepository.findAll().forEach(c->{
				for (int i = 0; i < 5; i++) {
					walletRepository.save(
							Wallet.builder()
									.id(UUID.randomUUID().toString())
									.solde(1+ random.nextInt(1000))
									.devise(Math.random()>0.5?"dirham":"dollar")
									.DateCreation(new Date())
									.client(c)
									.build()
					);
				}
			});
		};

	}

}
