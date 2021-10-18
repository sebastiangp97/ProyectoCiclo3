package co.usa.ciclo3.Ciclo3.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="category")
public class Category implements Serializable{

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String name;
	    private String description;
	    
	    
	    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy= "category")
	    @JsonIgnoreProperties("category")
	    private List<Bicicletas> bikes;
}