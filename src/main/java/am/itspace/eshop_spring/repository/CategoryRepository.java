package am.itspace.eshop_spring.repository;
import am.itspace.eshop_spring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
