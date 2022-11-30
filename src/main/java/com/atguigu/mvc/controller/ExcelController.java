package com.atguigu.mvc.controller;

import com.atguigu.mvc.mapper.node3Mapper;
import com.atguigu.mvc.pojo.node3;
import com.atguigu.mvc.utils.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author yuanqiuyan
 * @create 2022-11-03 15:23
 */
@RestController
@Slf4j
public class ExcelController {

    @Resource
    private node3Mapper nodeMapper;

    @GetMapping("/excel")
    public void excel(HttpServletResponse response) throws IOException {

        long st = System.currentTimeMillis();

        List<node3> node = nodeMapper.selectSub(0, 10000);

        ExcelUtil.exportExcel(node, node3.class, "node_info", "sheet_one", response);

        log.info("export excel success, cost {} s.", (System.currentTimeMillis() - st) / 1000);

    }


}
