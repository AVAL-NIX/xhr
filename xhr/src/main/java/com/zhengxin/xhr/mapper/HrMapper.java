package com.zhengxin.xhr.mapper;

import com.zhengxin.xhr.bean.Hr;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/4 16:56
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */
@Repository
public interface HrMapper {


    @Select(" select * from hr WHERE username=#{username}; ")
    Hr loadUserByUsername(String username);


}
