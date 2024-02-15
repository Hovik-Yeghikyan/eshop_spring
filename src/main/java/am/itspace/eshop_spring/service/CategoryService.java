package am.itspace.eshop_spring.service;

import am.itspace.eshop_spring.entity.Category;

import java.util.List;

public interface CategoryService {

    Category save(Category category);

    List<Category> findAll();
}
