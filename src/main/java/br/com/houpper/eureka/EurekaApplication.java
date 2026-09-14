package br.com.houpper.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Esta aplicação atua como um servidor Eureka, permitindo que microsserviços se registrem e localizem outros serviços
 * disponíveis no ambiente.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    /**
     * Inicializa o servidor de descoberta de serviços da aplicação.
     *
     * @param args Os argumentos da linha de comando.
     */
    static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}