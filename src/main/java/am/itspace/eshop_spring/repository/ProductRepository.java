package am.itspace.eshop_spring.repository;
import am.itspace.eshop_spring.entity.Product;
import am.itspace.eshop_spring.entity.ProductPicture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
