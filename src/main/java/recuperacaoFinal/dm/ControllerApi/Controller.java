package recuperacaoFinal.dm.ControllerApi;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recuperacaoFinal.dm.Entity.Cliente;
import recuperacaoFinal.dm.Repositoy.RepositoryCliente;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping (value = "/order-api/v1/")
public class Controller {
    @Autowired
    private RepositoryCliente repository;

    @PostMapping
    @ResponseBody
    public Cliente create (@RequestBody Cliente clinte){
        Cliente clienteSaved = repository.save(clinte);
        return clienteSaved;
    }
    @GetMapping("{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById (@PathVariable Long id){
        Optional<Cliente> clienteReturned = repository.findById(id);
        return  clienteReturned;


    }




}
