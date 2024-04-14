package org.bank.ssalguerof.msvc.products.models.dao;

import org.bank.ssalguerof.msvc.products.models.documents.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductDao extends ReactiveMongoRepository<Product, String> {

}
