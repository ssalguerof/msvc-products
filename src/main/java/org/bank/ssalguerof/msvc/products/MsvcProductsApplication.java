package org.bank.ssalguerof.msvc.products;

import org.bank.ssalguerof.msvc.products.models.dao.CustomerDao;
import org.bank.ssalguerof.msvc.products.models.dao.CustomerProductDao;
import org.bank.ssalguerof.msvc.products.models.dao.ProductDao;
import org.bank.ssalguerof.msvc.products.models.documents.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class MsvcProductsApplication{

	public static void main(String[] args) {
		SpringApplication.run(MsvcProductsApplication.class, args);
	}

}
