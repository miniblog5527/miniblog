package com.miniblog.service.article.conveter;

import com.miniblog.api.vo.article.CategoryReq;
import com.miniblog.api.vo.article.SearchCategoryReq;
import com.miniblog.api.vo.article.dto.CategoryDTO;
import com.miniblog.service.article.repository.entity.CategoryDO;
import com.miniblog.service.article.repository.params.SearchCategoryParams;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 微信搜索「沉默王二」，回复 Java
 */

@Mapper
public interface CategoryStructMapper {
    // instance
    CategoryStructMapper INSTANCE = Mappers.getMapper(CategoryStructMapper.class);

    // req to params
    @Mapping(source = "pageNumber", target = "pageNum")
    SearchCategoryParams toSearchParams(SearchCategoryReq req);

    // todo
    // do to dto
//    @Mapping(source = "id", target = "categoryId")
//    @Mapping(source = "categoryName", target = "category")
//    CategoryDTO toDTO(CategoryDO categoryDO);

//    List<CategoryDTO> toDTOs(List<CategoryDO> list);

//    // req to do
//    @Mapping(source = "category", target = "categoryName")
//    CategoryDO toDO(CategoryReq categoryReq);
}
