package org.bank.ssalguerof.msvc.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación que inicia el servicio de productos.
 */
@SpringBootApplication
public class MsvcProductsApplication {
  /**
   * Método principal que inicia la aplicación Spring Boot.
   *
   * @param args los argumentos de línea de comandos
   */
  public static void main(String[] args) {
    SpringApplication.run(MsvcProductsApplication.class, args);
  }

}
