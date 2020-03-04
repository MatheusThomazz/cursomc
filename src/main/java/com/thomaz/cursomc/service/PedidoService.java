package com.thomaz.cursomc.service;

import com.thomaz.cursomc.domain.Pedido;
import com.thomaz.cursomc.repositories.PedidoRepository;
import com.thomaz.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id){
        Optional<Pedido> obj = pedidoRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado Id: " + id
        + ",Tipo: " + Pedido.class.getName() ));
    }
}
