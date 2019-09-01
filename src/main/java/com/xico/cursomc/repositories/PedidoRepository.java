package com.xico.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xico.cursomc.domains.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
