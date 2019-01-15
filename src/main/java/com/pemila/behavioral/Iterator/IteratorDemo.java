package com.pemila.behavioral.Iterator;

import com.pemila.util.Logs;

import java.util.Iterator;

/**
 * @author： 月在未央
 * @date： 2019/1/15 14:35
 */
public class IteratorDemo {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("11111");
        collection.add("222222");

        Iterator<String> i = collection.iterator();
        while (i.hasNext()){
            Logs.info(i.next());
        }
    }
}
