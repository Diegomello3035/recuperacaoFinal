package recuperacaoFinal.dm.ControllerApi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recuperacaoFinal.dm.Entity.Cliente;
import recuperacaoFinal.dm.Repositoy.RepositoryCliente;


import javax.swing.text.html.Option;
import java.util.Optional;


@RestController
@RequestMapping(value = "/order/v1/")
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