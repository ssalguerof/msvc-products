package org.bank.ssalguerof.msvc.products.models.services;

import org.bank.ssalguerof.msvc.products.models.dao.ProductDao;
import org.bank.ssalguerof.msvc.products.models.documents.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;

    @Override
    public Flux<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Mono<Product> findbyId(String id) {
        return productDao.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        return productDao.save(product);
    }

    @Override
    public Mono<Void> delete(Product product) {
        return productDao.delete(product);
    }
}
