package com.miniblog.api.vo.seo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * SEO元标签值对象
 * 支持OGP协议标签(使用property属性)和普通Meta标签(使用name属性)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeoTagVO {
    private String property;
    private String content;
}
