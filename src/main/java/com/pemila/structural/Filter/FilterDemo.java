package com.pemila.structural.Filter;

import com.pemila.util.Logs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author： 月在未央
 * @date： 2018/12/13 14:47
 * @Description：
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));

        //过滤标准
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        Logs.info("Male:{}",male.meetCriteria(persons));
        Logs.info("Female:{}",female.meetCriteria(persons));
        Logs.info("Single:{}",single.meetCriteria(persons));

    }
}
