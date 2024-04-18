package org.bank.ssalguerof.msvc.products.models.services;

import org.bank.ssalguerof.msvc.products.models.documents.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Esta interfaz define operaciones para la gestión de información de productos bancarios.
 * Proporciona métodos para buscar, guardar y eliminar productos.
 */
public interface ProductService {
  /**
   * Busca y devuelve todos los productos.
   *
   * @return un Flux de Product que contiene todos los productos
   */
  public Flux<Product> findAll();

  /**
   * Busca un producto por su ID.
   *
   * @param id el ID del producto a buscar
   * @return un Mono que contiene el producto encontrado, o Mono.empty si no se encuentra
   */
  public Mono<Product> findbyId(String id);

  /**
   * Guarda o actualiza un producto.
   *
   * @param product el producto a guardar o actualizar
   * @return un Mono que contiene el producto guardado o actualizado
   */
  public Mono<Product> save(Product product);

  /**
   * Elimina un producto.
   *
   * @param product el producto a eliminar
   * @return un Mono que indica la finalización de la operación de eliminación
   */
  public Mono<Void> delete(Product product);
}
