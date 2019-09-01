package com.xico.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xico.cursomc.domains.Pagamento;;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
