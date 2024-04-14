package org.bank.ssalguerof.msvc.products.controllers;

import org.bank.ssalguerof.msvc.products.models.documents.Customer;
import org.bank.ssalguerof.msvc.products.models.documents.Product;
import org.bank.ssalguerof.msvc.products.models.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public Flux<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> findById(@PathVariable String id){return productService.findbyId(id);}

    @PostMapping
    public Mono<Product> saveProduct(@RequestBody Product product){
        return  productService.save(product);
    }
    @PutMapping
    public Mono<Product> updateProduct(@RequestBody Product product){
        return productService.findbyId(product.getId())
                .flatMap(existingProduct->{
                    BeanUtils.copyProperties(product, existingProduct, "id");
                    return  productService.save(existingProduct);
                });
    }

}
