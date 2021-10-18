package co.usa.ciclo3.Ciclo3.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.ciclo3.Ciclo3.model.Bicicletas;
import co.usa.ciclo3.Ciclo3.repository.crud.BicicletasCrudRepository;
import java.util.List;
import java.util.Optional;

@Repository
public class BicicletasRepository {

    @Autowired
    private BicicletasCrudRepository bicicletasCrudRepository;

    public List<Bicicletas> getALL(){
        return (List<Bicicletas>) bicicletasCrudRepository.findAll();
    }

    public Optional<Bicicletas> getBicicletas(int id){
        return bicicletasCrudRepository.findById(id);
    }

    public Optional<Bicicletas> getBicicletasa(int id){
        return bicicletasCrudRepository.findById(id);
    }

    public Bicicletas save(Bicicletas p){
        return bicicletasCrudRepository.save(p);
    }
}
