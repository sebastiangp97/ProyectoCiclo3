package co.usa.ciclo3.Ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="Bicicletas")
public class Bicicletas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String brand;
    private Integer model;
    private Integer category_id;
    private String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Integer getModel() {
        return model;
    }
    public void setModel(Integer model) {
        this.model = model;
    }
    public Integer getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

    


    
}
