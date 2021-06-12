package ar.com.susan.webservicespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebServiceSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebServiceSpringApplication.class, args);
    }
@GetMapping
    public String saludar (){
        return "<h1>hola mundo!</h1><hr/>chau!!";
}
}
