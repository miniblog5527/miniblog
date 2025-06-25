package com.miniblog.web.admin.rest;


import com.miniblog.api.model.vo.ResVo;
import com.miniblog.api.model.vo.article.ColumnArticleReq;
import com.miniblog.api.model.vo.article.ColumnReq;
import com.miniblog.service.article.converter.ColumnArticleStructMapper;
import com.miniblog.service.article.repository.mapper.column.ColumnArticleMapper;
import com.miniblog.service.article.service.ColumnArticleService;
import com.miniblog.service.article.service.ColumnSettingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Tag(name = "专栏管理")
@RequestMapping(path= {"/admin/column","/api/admin/column"})
public class ColumnSettingRestController {

    @Autowired
    private ColumnSettingService columnSettingService;
    @Autowired
    private ColumnArticleStructMapper columnArticleStructMapper;
    @Autowired
    private ColumnArticleService columnArticleService;

    @Operation(summary = "保存专栏" ,description = "保存专栏")
    @PostMapping(path = "/saveColumn")
    public ResVo<String> saveColumn(@RequestBody ColumnReq req){
        columnSettingService.saveColumn(req);
        return ResVo.ok();

    }

    @Operation(summary = "删除专栏" ,description = "删除专栏")
    @PostMapping(path = "/deleteColumn")
    public ResVo<String> deleteColumn(@RequestBody ColumnReq req){
        columnSettingService.deleteColumn(req);
        return ResVo.ok();
    }

    @Operation(summary = "教程增加" ,description = "为专栏增加教程")
    @PostMapping(path = "/addColumnArticle")
    public ResVo<String> addColumnArticle(@RequestBody ColumnArticleReq req){
        log.info("addColumnArticle req:{}", req);
        Long columnId = req.getColumnId();
        Long articleId = req.getArticleId();
        columnArticleService.addColumnArticle(columnId, articleId);
        return ResVo.ok();
    }

    @Operation(summary = "教程删除", description = "为专栏删除教程")
    @DeleteMapping(path = "/column/{columnId}/article/{articleId}")
    public ResVo<String> deleteColumnArticle(@PathVariable Long columnId, @PathVariable Long articleId) {
        log.info("deleteColumnArticle req: columnId={}, articleId={}", columnId, articleId);
        columnArticleService.deleteColumnArticle(columnId, articleId);
        return ResVo.ok();
    }



}
