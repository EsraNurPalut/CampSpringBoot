package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Brand {
    @Id //(primaryKey)
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto +
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

}
