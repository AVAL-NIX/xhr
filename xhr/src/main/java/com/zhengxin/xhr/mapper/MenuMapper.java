package com.zhengxin.xhr.mapper;

import com.zhengxin.xhr.bean.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MenuMapper {

    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
