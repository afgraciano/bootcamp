package com.emazon.api_stock.application.service;


import com.emazon.api_stock.application.mapper.CategoryMapper;
import com.emazon.api_stock.domain.model.Category;
import com.emazon.api_stock.domain.repository.CategoryRepository;
import com.emazon.api_stock.web.dto.DtoCategoryRequest;
import com.emazon.api_stock.web.dto.DtoCategoryResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CategoryService {


    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;



    public DtoCategoryResponse createCategory(DtoCategoryRequest dtoCategoryRequest) {
        Optional<Category> existingCategory = categoryRepository.findByName(dtoCategoryRequest.getName());

        if (existingCategory.isPresent()) {
            throw new RuntimeException("El nombre de la categoría ya existe");
        }

        Category category = categoryMapper.dtoCategoryToCategory(dtoCategoryRequest);
        category = categoryRepository.save(category);

        return categoryMapper.categoryToDtoCategory(category);
    }

}
