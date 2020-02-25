package com.thomaz.cursomc.repositories;

import com.thomaz.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositoey extends JpaRepository<Cliente, Integer> {
}
