package org.bank.ssalguerof.msvc.products.controllers;

import org.bank.ssalguerof.msvc.products.models.documents.Product;
import org.bank.ssalguerof.msvc.products.models.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Controlador REST encargado de administrar la información de los productos bancarios.
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {
  @Autowired
  private ProductService productService;

  /**
   * Obtiene todos los productos bancarios.
   *
   * @return un Flux de Product representando todos los productos
   */
  @GetMapping
  public Flux<Product> findAll() {
    return productService.findAll();
  }

  /**
   * Busca un producto bancario por su ID.
   *
   * @param id el ID del producto a buscar
   * @return un Mono que contiene el producto encontrado, o Mono.empty si no se encuentra
   */
  @GetMapping("/{id}")
  public Mono<Product> findById(@PathVariable String id) {
    return productService.findbyId(id);
  }

  /**
   * Guarda un nuevo producto bancario.
   *
   * @param product el producto a guardar
   * @return un Mono que contiene el producto guardado
   */
  @PostMapping
  public Mono<Product> saveProduct(@RequestBody Product product) {
    return productService.save(product);
  }

  /**
   * Actualiza un producto bancario existente.
   *
   * @param product el producto con los datos actualizados
   * @return un Mono que contiene el producto actualizado
   */
  @PutMapping
  public Mono<Product> updateProduct(@RequestBody Product product) {
    return productService.findbyId(product.getId())
      .flatMap(existingProduct -> {
        BeanUtils.copyProperties(product, existingProduct, "id");
        return productService.save(existingProduct);
      });
  }

}
