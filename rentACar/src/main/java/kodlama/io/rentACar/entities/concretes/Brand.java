package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Brand {
    private int id;
    private String name;



}
