package br.com.xmuproject.cliente;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

/**
 * @AUTHOR MURILO TADEU D. TISCHER ON 2/7/2023
 */
@Entity
public class Cliente extends PanacheEntity {
    String nome;

}
