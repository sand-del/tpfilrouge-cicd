package com.example.tpfinalcicd;

import org.springframework.boot.SpringApplication;

public class TestTpFinalCicdApplication {

	public static void main(String[] args) {
		SpringApplication.from(TpFinalCicdApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
