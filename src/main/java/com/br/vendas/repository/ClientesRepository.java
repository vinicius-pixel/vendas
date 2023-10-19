package com.br.vendas.repository;

import com.br.vendas.model.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Long> {
}
