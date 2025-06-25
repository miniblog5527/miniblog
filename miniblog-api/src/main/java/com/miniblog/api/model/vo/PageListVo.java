package com.miniblog.api.model.vo;

import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Data
public class PageListVo<T> {

    private List<T> list;


    private Boolean hasMore;
    private Integer PageNum;
    private Integer PageSize;
    private Long Total;
    private Integer Pages;


    public static <T> PageListVo<T> emptyVo() {
        PageListVo<T> vo = new PageListVo<>();
        vo.setList(Collections.emptyList());
        vo.setHasMore(false);
        return vo;
    }

    public static <T> PageListVo<T> newVo(List<T> list, long pageSize) {
        PageListVo<T> vo = new PageListVo<>();
        vo.setList(Optional.ofNullable(list).orElse(Collections.emptyList()));
        vo.setHasMore(vo.getList().size() == pageSize);
        return vo;
    }
}
