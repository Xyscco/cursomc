package com.xico.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xico.cursomc.domains.Pedido;
import com.xico.cursomc.repositories.PedidoRepository;
import com.xico.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return  obj.orElseThrow(() -> new ObjectNotFoundException(    
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
