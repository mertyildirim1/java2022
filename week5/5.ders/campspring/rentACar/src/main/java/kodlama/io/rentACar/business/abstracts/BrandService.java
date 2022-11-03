package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();

	void add(CreateBrandRequest creatBrandRequest);
	void update(CreateBrandRequest createBrandRequest, int id);
	void delete(int id);
}