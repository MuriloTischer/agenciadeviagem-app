package br.com.xmuproject.reserva;

import br.com.xmuproject.cliente.Cliente;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 2/7/2023
 */
@Entity
public class Reserva extends PanacheEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    public Cliente cliente;
}
