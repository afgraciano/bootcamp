package com.emazon.api_stock.application.mapper;

import com.emazon.api_stock.domain.model.Category;
import com.emazon.api_stock.web.dto.DtoCategoryRequest;
import com.emazon.api_stock.web.dto.DtoCategoryResponse;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CategoryMapper {


    DtoCategoryResponse categoryToDtoCategory(Category category);

    Category dtoCategoryToCategory(DtoCategoryRequest dtoCategoryRequest);

}