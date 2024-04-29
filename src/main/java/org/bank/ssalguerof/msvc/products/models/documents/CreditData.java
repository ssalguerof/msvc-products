package org.bank.ssalguerof.msvc.products.models.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa la información de un crédito, ya sea empresarial o personal.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditData {
  private Double montoAprobado;     // Monto aprobado para el crédito
  private Double saldoPendiente;    // Saldo pendiente del crédito
  private Integer cuotasPagadas;    // Número de cuotas pagadas
  private Integer cuotasTotales;    // Número total de cuotas del crédito
  private String indVencido;       // Indica si el crédito está vencido
  // Métodos getter y setter generados automáticamente por Lombok
}
