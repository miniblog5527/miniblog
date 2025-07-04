package com.miniblog.api.model.vo.article.dto;

import com.miniblog.api.model.enums.PushStatusEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author XuYifei
 * @date 2024-07-12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Tag(name = "文章分类DTO", description = "文章分类DTO")
public class CategoryDTO implements Serializable {
    // 默认分类名称
    public static final String DEFAULT_TOTAL_CATEGORY = "全部";
    // 默认分类
    public static final CategoryDTO DEFAULT_CATEGORY = new CategoryDTO(0L, "全部");

    private static final long serialVersionUID = 8272116638231812207L;
    // 空分类
    public static CategoryDTO EMPTY = new CategoryDTO(-1L, "illegal");

    @Schema(description = "分类ID")
    private Long categoryId;

    @Schema(description = "分类名称")
    private String category;

    @Schema(description = "分类排序")
    private Integer rank;

    @Schema(description = "分类状态")
    private Integer status;


    // 构造函数，传入分类ID和分类名称
    public CategoryDTO(Long categoryId, String category) {
        this(categoryId, category, 0);
    }

    // 构造函数，传入分类ID、分类名称和分类排序
    public CategoryDTO(Long categoryId, String category, Integer rank) {
        this.categoryId = categoryId;
        this.category = category;
        this.status = PushStatusEnum.ONLINE.getCode();
        this.rank = rank;
    }
}
