package com.thomaz.cursomc.repositories;

import com.thomaz.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository  extends JpaRepository<Endereco,Integer> {
}
