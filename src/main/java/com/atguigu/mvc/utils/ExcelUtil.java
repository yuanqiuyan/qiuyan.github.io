package com.atguigu.mvc.utils;

import com.alibaba.excel.EasyExcel;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @description: ExcelUtil
 * @author: zj
 * @date: 2022-07-14 17:07
 */
public class ExcelUtil {

    public static void exportExcel(List<?> objects, Class clazz, String fileName,
                                   String sheetName, HttpServletResponse response) throws IOException {

        // 设置响应头
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");

        // 设置防止中文名乱码
        String exportName = URLEncoder.encode(fileName, "utf-8");
        String sheetSubName = URLEncoder.encode(sheetName, "utf-8");

        // 文件下载方式(附件下载还是在当前浏览器打开)
        response.setHeader("Content-disposition", "attachment;filename=" +
                exportName + ".xlsx");

        // 向Excel中写入数据
        EasyExcel.write(response.getOutputStream(), clazz)
                .sheet(sheetSubName)
                .doWrite(objects);

    }

}
