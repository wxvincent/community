package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveFilterTests {

    @Autowired
    SensitiveFilter sensitiveFilter;

    @Test
    public void test() {
        String text = "这里是@色@情@的好地方，也可以赌博，哈哈哈！";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
