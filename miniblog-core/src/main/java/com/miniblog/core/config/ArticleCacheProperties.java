package com.miniblog.core.config;

import com.miniblog.api.vo.article.dto.ArticleDTO;
import jakarta.validation.Valid;
import lombok.Data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Valid
@ConfigurationProperties(prefix = "hot.article-cache")
public class ArticleCacheProperties {

    /**
     * 热点文章缓存的过期时间，默认为1天，单位为秒
     */
    private Long expireSeconds = 60 * 60 * 24L;

    /**
     * 热点文章缓存的最大数量，默认为10
     */
    private Integer maximumSize = 10;

}
