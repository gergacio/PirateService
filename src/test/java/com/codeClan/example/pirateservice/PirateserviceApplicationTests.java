package com.codeClan.example.pirateservice;

import com.codeClan.example.pirateservice.models.Pirate;
import com.codeClan.example.pirateservice.models.Ship;
import com.codeClan.example.pirateservice.repositories.PirateRepository;
import com.codeClan.example.pirateservice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {
	@Autowired // NEW
	PirateRepository pirateRepository;
	@Autowired
	ShipRepository shipRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createPirate(){
		Ship ship = new Ship("Hispaniola");
		shipRepository.save(ship);
		Pirate pirate = new Pirate("John", "Silver", 56, ship);
		pirateRepository.save(pirate);
	}

}
