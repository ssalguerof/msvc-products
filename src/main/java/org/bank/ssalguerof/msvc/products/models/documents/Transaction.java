package org.bank.ssalguerof.msvc.products.models.documents;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Clase que contiene información de movimientos en los productos del cliente.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
  @Id
  private String id;
  private String idProductoCliente;
  private String idCliente;
  private String codTipoMovimiento;
  private String descTipoMovimiento;
  private Double monto;
  private Date fecMovimiento;
  private String descripcion;
}
