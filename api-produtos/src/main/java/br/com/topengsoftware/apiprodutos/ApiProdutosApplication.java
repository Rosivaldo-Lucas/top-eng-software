package br.com.topengsoftware.apiprodutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.topengsoftware.apiprodutos")
public class ApiProdutosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiProdutosApplication.class, args);
    }

}
