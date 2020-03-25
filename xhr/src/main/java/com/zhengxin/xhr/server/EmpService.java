package com.zhengxin.xhr.server;

import com.zhengxin.xhr.bean.Employee;

import java.util.List;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/24 16:54
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */
public interface EmpService {


    public List<Employee> getEmployeeByPage(Integer page, Integer size, String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope);


    public Long getCountByKeywords(String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope);
}
