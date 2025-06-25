package com.miniblog.api.vo.seo;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * SEO元数据配置类
 * 用于构建页面搜索引擎优化所需的OGP标签和JSON-LD数据
 */
@Data
@Builder
public class Seo {
    private List<SeoTagVO> ogp;
    private Map<String, Object> jsonLd;
}
