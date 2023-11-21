package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepository extends JpaRepository<Brand,Integer> {

    //List<Brand> getAll(); springjpa tüm işlemleri gerçekleştiriyor. Inmemory Gerek yok.
}



