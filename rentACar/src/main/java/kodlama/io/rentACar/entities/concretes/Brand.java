package kodlama.io.rentACar.entities.concretes;

import lombok.*;

import javax.persistence.Entity;

import javax.persistence.*;


@Table(name="brands")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor //prametresiz constructor üretir; No default constructor for entity.
public class Brand {


    @Id   //(primaryKey)
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto +
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;


}
