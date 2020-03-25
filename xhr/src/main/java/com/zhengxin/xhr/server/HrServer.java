package com.zhengxin.xhr.server;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/4 16:53
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */

public interface HrServer  extends UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
