package com.atguigu.mvc.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yuanqiuyan
 * @create 2022-11-02 16:31
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor // 一定要有无参构造方法
public class Student {

    @ExcelProperty(value = "姓名")
    private String name;

    @ExcelProperty(value = "性别")
    private Integer sex;

    @ExcelProperty(value = "生日")
    private Date birthday;

    @ExcelProperty(value = "体重KG")
    private BigDecimal weight;

    private String memo;

}
