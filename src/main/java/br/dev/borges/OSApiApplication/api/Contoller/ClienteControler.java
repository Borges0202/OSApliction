
package br.dev.borges.OSApiApplication.api.Contoller;

import br.dev.borges.OSApiApplication.domain.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteControler 
{
    List<Cliente> listaCliente;    
    @GetMapping("/clientes")
    public List<Cliente> listas() 
    {
        listaCliente = new ArrayList<Cliente>();
        listaCliente.add(new Cliente(1, "kge", "kge@teste.com", "11-99999-9999"));
        listaCliente.add(new Cliente(1, "maria", "maria@teste.com", "11-98888-9999"));
        listaCliente.add(new Cliente(1, "joa", "joao@teste.com", "11-99999-9988"));
        
        return listaCliente;
    }
}
