package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;
    @Test
    void dochat() {
        String answer = aiManager.dochat(1811774637469532161L,"邓紫棋的歌，推荐几首？");
        System.out.println(answer);
    }
}