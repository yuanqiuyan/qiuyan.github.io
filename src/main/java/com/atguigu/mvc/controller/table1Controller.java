package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuanqiuyan
 * @create 2022-11-01 19:42
 */
@Controller
public class table1Controller {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/table1")
    public String downExcel(){
        return "table1";//导出Excel
    }

    @RequestMapping(value = "/play2")
    public String play2(){
        return "play2";//导出Excel
    }

    @RequestMapping(value = "/Christmas")
    public String Christmas(){
        return "Christmas";//导出Excel
    }

    @RequestMapping(value = "/tableImport")
    public String tableImport(){
        return "tableImport";//导出Excel
    }
}
