package com.miniblog.core.cache;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @description: RedisTemplate配置
 */
@Configuration
public class RedisTemplateConfig {
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);

        // 设置键的序列化方式为 String
        template.setKeySerializer(new StringRedisSerializer());

        // 设置值的序列化方式为 JSON
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer(new ObjectMapper()));

        // 设置 Hash 的键和值的序列化方式
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer(new ObjectMapper()));

        template.afterPropertiesSet();
        return template;
    }
}
