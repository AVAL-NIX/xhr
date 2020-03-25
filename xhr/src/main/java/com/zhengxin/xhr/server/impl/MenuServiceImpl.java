package com.zhengxin.xhr.server.impl;

import com.zhengxin.xhr.bean.Menu;
import com.zhengxin.xhr.mapper.MenuMapper;
import com.zhengxin.xhr.server.MenuService;
import com.zhengxin.xhr.util.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/4 17:02
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }

    @Override
    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(HrUtils.getCurrentHr().getId());
    }

    @Override
    public List<Menu> menuTree() {
        return menuMapper.menuTree();
    }

    @Override
    public List<Long> getMenusByRid(Long rid) {
        return menuMapper.getMenusByRid(rid);
    }


}
