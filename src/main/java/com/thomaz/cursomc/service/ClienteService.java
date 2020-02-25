package com.thomaz.cursomc.service;

import com.thomaz.cursomc.domain.Cliente;
import com.thomaz.cursomc.repositories.ClienteRepositoey;
import com.thomaz.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepositoey repo;


    public Cliente buscar(Integer id){

        Optional<Cliente> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ", Tipo: "
        + Cliente.class.getName()));

    }
}
