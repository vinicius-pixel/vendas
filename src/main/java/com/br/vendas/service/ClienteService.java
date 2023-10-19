package com.br.vendas.service;

import com.br.vendas.model.Cliente;
import com.br.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClientesRepository clientesRepository;

    public Cliente salvarCliente(Cliente cliente) throws Exception {
        try {
            if (cliente != null) {
                clientesRepository.save(cliente);
                return cliente;
            }
        }catch (Exception e){
            throw new Exception("Erro ao salvar", e.getCause());
        }
        return null;
    }
}

