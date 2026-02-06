
package br.dev.borges.OSApiApplication.api.Contoller;

import br.dev.borges.OSApiApplication.domain.model.Cliente;
import br.dev.borges.OSApiApplication.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteControler 
{
    
    @Autowired
    private ClienteRepository clienteRepository;
       
    @PostMapping("/clientes/{clienteID}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente)
    {    
        return clienteRepository.save(cliente);
    }
}

