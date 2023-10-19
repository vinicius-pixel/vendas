package com.br.vendas.resource;

import com.br.vendas.model.Cliente;
import com.br.vendas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/clientes")
public class ClientesRest {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    @ResponseBody
    public Cliente salvarCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.salvarCliente(cliente);
    }

}
