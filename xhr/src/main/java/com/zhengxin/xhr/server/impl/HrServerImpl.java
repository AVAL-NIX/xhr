package com.zhengxin.xhr.server.impl;

import com.zhengxin.xhr.bean.Hr;
import com.zhengxin.xhr.mapper.HrMapper;
import com.zhengxin.xhr.server.HrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/4 16:53
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */
@Service
public class HrServerImpl implements HrServer {

    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(s);
        if(hr == null){
            new UsernameNotFoundException(" 用户名不存在");
        }
        return hr;
    }
}
