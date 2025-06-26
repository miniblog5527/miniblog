package com.miniblog.api.model.vo.recommend;

import com.miniblog.api.model.enums.SidebarStyleEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 侧边推广信息
 */
@Data
@Accessors(chain = true)
public class SideBarDTO {
    // 标题
    private String title;

    // 副标题
    private String subTitle;

    // 图标
    private String icon;

    // 图片
    private String img;

    // 链接
    private String url;

    // 内容
    private String content;

    // 侧边栏项
    private List<SideBarItemDTO> items;

    /**
     * 侧边栏样式
     *
     * @see SidebarStyleEnum#getStyle()
     */
    // 样式
    private Integer style;
}
