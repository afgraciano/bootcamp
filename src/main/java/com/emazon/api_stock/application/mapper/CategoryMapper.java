package com.emazon.api_stock.application.mapper;

import com.emazon.api_stock.domain.model.Category;
import com.emazon.api_stock.web.dto.DtoCategoryRequest;
import com.emazon.api_stock.web.dto.DtoCategoryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    Category dtoCategoryToCategory(DtoCategoryRequest dtoCategoryRequest);

    DtoCategoryResponse categoryToDtoCategory(Category category);

}