package am.itspace.eshop_spring.service.impl;

import am.itspace.eshop_spring.entity.Category;
import am.itspace.eshop_spring.entity.Product;
import am.itspace.eshop_spring.repository.ProductPictureRepository;
import am.itspace.eshop_spring.repository.ProductRepository;
import am.itspace.eshop_spring.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
