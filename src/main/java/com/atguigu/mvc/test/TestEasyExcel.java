package com.atguigu.mvc.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.atguigu.mvc.pojo.Student;
import org.junit.Test;
import java.util.function.Consumer;


import static com.atguigu.mvc.utils.generateStudentUtil.generateStudent;

/**
 * @author yuanqiuyan
 * @create 2022-11-02 16:39
 * 导出Excel报表
 */
public class TestEasyExcel {
    @Test
    public void export1() {
        Consumer<ExcelWriter> consumer = writer -> {
            writer.write(generateStudent(10), EasyExcel.writerSheet("学生信息")
                    .head(Student.class)
                    .build());
        };
//        export("D:/报表.xlsx", consumer);
    }

}
