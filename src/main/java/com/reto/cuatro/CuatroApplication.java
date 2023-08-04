package com.reto.cuatro;

import com.reto.cuatro.repository.GadgetRepository;
import com.reto.cuatro.repository.OrderRepository;
import com.reto.cuatro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
@SpringBootApplication
public class CuatroApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private GadgetRepository gadgetRepositoy;

	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(CuatroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		
		userRepository.deleteAll();
		gadgetRepositoy.deleteAll();
		orderRepository.deleteAll();

		
	}
}
