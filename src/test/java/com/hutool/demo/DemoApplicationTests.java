package com.hutool.demo;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(RandomUtil.randomInt(6));
        System.out.println(IdUtil.randomUUID());
        System.out.println(IdUtil.simpleUUID());

        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        System.out.println(now);
        //当前日期字符串，格式：yyyy-MM-dd
        String today= DateUtil.today();
        System.out.println(today);
        BigDecimal num = BigDecimal.valueOf(123);
        System.out.println(num.setScale(2));

        char[] words = "123456".toCharArray();
        System.out.println(words[3]);
        System.out.println("123456".substring(3, 4)+"地方的咖啡打开");

    }

}

