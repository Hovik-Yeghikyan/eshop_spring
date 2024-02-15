package am.itspace.eshop_spring.service;

import am.itspace.eshop_spring.entity.Category;
import am.itspace.eshop_spring.entity.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {


    Product save(Product product);

    List<Product> findAll();

    Product findById(int id);

}
