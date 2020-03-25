package com.zhengxin.xhr.bean;

import lombok.Data;

/**
 * Created by sang on 2018/1/13.
 */
@Data
public class PoliticsStatus {
    private Long id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PoliticsStatus that = (PoliticsStatus) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }


}
