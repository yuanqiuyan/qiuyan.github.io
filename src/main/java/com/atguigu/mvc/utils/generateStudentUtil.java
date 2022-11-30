package com.atguigu.mvc.utils;

import com.atguigu.mvc.pojo.Student;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yuanqiuyan
 * @create 2022-11-02 16:34
 * 随机生成Student对象
 */
public class generateStudentUtil {
    public static List<Student> generateStudent(int size) {
        List<Student> stues = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            stues.add(new Student("姓名" + i, (int) (Math.random() * 2), randomDate(), randomWeight(), "备注"));
        }
        return stues;
    }

    public static Date randomDate() {
        LocalDateTime localDateTime = LocalDateTime.of(randomInt(1990, 2022), randomInt(1, 12), randomInt(1, 28), randomInt(0, 23), randomInt(0, 59), randomInt(0, 59), randomInt(0, 999));
        ZonedDateTime zdt = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zdt.toInstant());
    }

    public static int randomInt(int min, int max) {
        int de = max - min;
        // 二进制长度
        int bitCount = Integer.toBinaryString(de).length();
        int ans = 0;
        do {
            ans = 0;
            for (int i = 0; i < bitCount; i++) {
                ans += random0_1() << i;
            }
        } while (ans > de);
        return ans + min;
    }

    public static int random0_1() {
        return (int) (Math.random() * 2);
    }

    public static BigDecimal randomWeight() {
        return BigDecimal.valueOf((Math.random() * 10));
    }

}
