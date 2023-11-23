package kodlama.io.rentACar.business.consretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandsRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;


    //iş kuralları
    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand>brands =brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();
        for (Brand brand :brands) {
            GetAllBrandsResponse response = new GetAllBrandsResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());


            brandsResponses.add(response);

        }
        return brandsResponses;

    }

    @Override
    public void add(CreateBrandsRequest createBrandsRequest) {
         Brand brand =new Brand();
         brand.setName(createBrandsRequest.getName());
         this.brandRepository.save(brand);
    }
}
