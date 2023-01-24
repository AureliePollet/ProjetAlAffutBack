package fr.alaffut.springboot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ALAffutApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ALAffutApplication.class, args);
	}

	
	
	
	
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        
    }
	
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();  
    }

}
