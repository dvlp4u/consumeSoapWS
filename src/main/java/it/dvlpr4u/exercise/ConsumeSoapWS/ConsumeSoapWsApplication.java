package it.dvlpr4u.exercise.ConsumeSoapWS;

import it.dvlpr4u.exercise.ConsumeSoapWS.Client.BibliotecaClient;
import it.dvlpr4u.exercise.ConsumeSoapWS.Configuration.BibliotecaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConsumeSoapWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeSoapWsApplication.class, args);
	}


}
