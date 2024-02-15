package am.itspace.eshop_spring.service;

import am.itspace.eshop_spring.entity.Product;
import am.itspace.eshop_spring.entity.ProductPicture;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductPictureService {

    ProductPicture save(ProductPicture productPicture);

    void saveAll(Product product, List<MultipartFile> multipartFiles);

    List<ProductPicture> findAllByProduct(Product product);
}
