package co.usa.ciclo3.Ciclo3.web;

import co.usa.ciclo3.Ciclo3.model.Bicicletas;
import co.usa.ciclo3.Ciclo3.service.BicicletasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins ="*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Bike")
public class BicicletaController {
    @Autowired

    private BicicletasService bicicletasService;

    @GetMapping("/all")
    public List<Bicicletas> getBicicletas(){
        return bicicletasService.getALL();
    }


    //Revisar si esto va con getBicicletas o getBicicletasa
    @GetMapping("/{id}")
    public Optional<Bicicletas> getBicicletas(@PathVariable("id") int id){
        return bicicletasService.getBicicletas(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bicicletas save(@RequestBody Bicicletas p){ //este parametro me pertime colocar la peticion
        return bicicletasService.save(p);
    }
    
}
