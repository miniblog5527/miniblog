package com.miniblog.api.event;

import com.miniblog.api.enums.ArticleEventEnum;
import lombok.*;
import org.springframework.context.ApplicationEvent;

/**
 * 文章事件消息
 *
 * @param <T> 事件内容类型
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
        (callSuper = true)
public class ArticleMsgEvent<T> extends ApplicationEvent {
    private ArticleEventEnum type;
    private T content;

    public ArticleMsgEvent(Object source, ArticleEventEnum type, T content) {
        super(source);
        this.type = type;
        this.content = content;
    }
}
