package com.miniblog.web.front.article.view;

import com.miniblog.api.model.vo.PageListVo;
import com.miniblog.api.model.vo.PageParam;
import com.miniblog.api.model.vo.ResVo;
import com.miniblog.api.model.vo.article.ColumnQueryReq;
import com.miniblog.api.model.vo.article.dto.ColumnDTO;
import com.miniblog.service.article.service.ColumnInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/view/column")
public class ColumnViewController {

    @Autowired
    private ColumnInfoService columnInfoService;

    @Operation(summary = "获取专栏列表", description = "根据名称查询专栏列表，不传则查询全部")
    @PostMapping("/list")
    @Parameter(name = "column", description = "专栏名称（可选）", in = ParameterIn.QUERY)
    public ResVo<PageListVo<ColumnDTO>> list(@RequestBody ColumnQueryReq req) {
        PageParam pageParam = new PageParam();
        pageParam.setPageNum(req.getPageNumber() != null ? req.getPageNumber() : 1);
        pageParam.setPageSize(req.getPageSize() != null ? req.getPageSize() : 10);

        // 根据专栏名称进行条件查询
        String columnName = req.getColumn();
        return ResVo.ok(columnInfoService.queryListColumn(columnName, pageParam));
    }
}
