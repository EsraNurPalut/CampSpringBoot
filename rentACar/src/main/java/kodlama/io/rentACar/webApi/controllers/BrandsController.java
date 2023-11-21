package kodlama.io.rentACar.webApi.controllers;


import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandsRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation(bilgilendirme)
@RequestMapping("/api/brands")
public class BrandsController {
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    BrandService brandService;

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    };
    @PostMapping("/add")
    public void add(CreateBrandsRequest createBrandsRequest)
    {
        this.brandService.add(createBrandsRequest);
    }
}
