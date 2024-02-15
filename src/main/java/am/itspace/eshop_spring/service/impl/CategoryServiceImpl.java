package am.itspace.eshop_spring.service.impl;

import am.itspace.eshop_spring.entity.Category;
import am.itspace.eshop_spring.repository.CategoryRepository;
import am.itspace.eshop_spring.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
