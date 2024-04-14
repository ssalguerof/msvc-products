package org.bank.ssalguerof.msvc.products.models.services;

import org.bank.ssalguerof.msvc.products.models.documents.Customer;
import org.bank.ssalguerof.msvc.products.models.documents.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    public Flux<Product> findAll();
    public Mono<Product> findbyId(String id);
    public Mono<Product> save(Product product);
    public Mono<Void> delete(Product product);

}
