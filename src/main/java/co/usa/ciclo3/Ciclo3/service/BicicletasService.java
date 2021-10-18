package co.usa.ciclo3.Ciclo3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.ciclo3.Ciclo3.model.Bicicletas;
import co.usa.ciclo3.Ciclo3.repository.BicicletasRepository;

@Service
public class BicicletasService {

    @Autowired
    private BicicletasRepository bicicletasRepository;

    public List<Bicicletas> getALL(){
        return bicicletasRepository.getALL();
    }

    public Optional<Bicicletas> getBicicletas(int id){
        return bicicletasRepository.getBicicletas(id);
    }

    public Bicicletas save(Bicicletas p){
        if(p.getId()==null){
            return bicicletasRepository.save(p);
        }else{
            Optional<Bicicletas> paux=bicicletasRepository.getBicicletas(p.getId());
            if (paux.isEmpty()){
                return bicicletasRepository.save(p);
            }else{
                return p;
            }
        }
    }

    public Optional<Bicicletas> getBicicletasa(int id) {
        return bicicletasRepository.getBicicletasa(id);
    }



    
}
