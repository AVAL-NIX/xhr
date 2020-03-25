package com.zhengxin.xhr.server;

import com.zhengxin.xhr.bean.Menu;

import java.util.List;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/4 17:02
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */
public interface MenuService {


    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId();

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
