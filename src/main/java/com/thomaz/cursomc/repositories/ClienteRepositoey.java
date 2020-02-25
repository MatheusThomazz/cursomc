package com.thomaz.cursomc.repositories;

import com.thomaz.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositoey extends JpaRepository<Cliente, Integer> {
}
