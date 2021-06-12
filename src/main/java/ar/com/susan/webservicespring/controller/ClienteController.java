package ar.com.susan.webservicespring.controller;

import org.springframework.web.bind.annotation.RestController;


import ar.com.susan.webservicespring.entities.Cliente;
import ar.com.susan.webservicespring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }
    @GetMapping("clientes")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }
}
