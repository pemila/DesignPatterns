package com.pemila.structural.Filter;

import java.util.List;

/**
 * 2.创建一个过滤标准接口
 * @author： 月在未央
 * @date： 2018/12/13 14:36
 * @Description：
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
