package com.emazon.api_stock.web.controller;


import com.emazon.api_stock.application.service.CategoryService;
import com.emazon.api_stock.web.dto.DtoCategoryRequest;
import com.emazon.api_stock.web.dto.DtoCategoryResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<DtoCategoryResponse> createCategory(@Valid @RequestBody DtoCategoryRequest dtoCategoryRequest) {

        DtoCategoryResponse createdCategory = categoryService.createCategory(dtoCategoryRequest);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }
}
