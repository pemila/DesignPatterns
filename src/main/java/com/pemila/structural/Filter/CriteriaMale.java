package com.pemila.structural.Filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 3.实现标准结果，定义过滤条件
 * @author： 月在未央
 * @date： 2018/12/13 14:39
 * @Description：
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(e->e.getGender().equalsIgnoreCase("male"))
                .collect(Collectors.toList());
    }
}
