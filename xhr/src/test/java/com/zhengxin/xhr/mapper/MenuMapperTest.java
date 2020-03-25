package com.zhengxin.xhr.mapper;

import com.zhengxin.xhr.bean.Menu;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/24 11:29
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class MenuMapperTest {

    @Autowired
    MenuMapper menuMapper;

    @Test
    void getAllMenu() {

        List<Menu> list = menuMapper.getAllMenu();
        System.out.println(list);
    }
}