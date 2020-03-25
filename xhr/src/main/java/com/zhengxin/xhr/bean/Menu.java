package com.zhengxin.xhr.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.List;


@Data
public class Menu {

    private Long id;
    private String url;
    private String path;
    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    private Object component;
    private String name;
    private String iconCls;
    private Long parentId;
    private List<Role> roles;
    private List<Menu> children;
    private MenuMeta meta;

}
