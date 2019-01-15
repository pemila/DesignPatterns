package com.pemila.behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 自定义集合
 * @author： 月在未央
 * @date： 2019/1/15 14:22
 */
public class MyCollection<T> {
    private List<T> list = new ArrayList<>();

    public void add(T t){
        list.add(t);
    }

    public void remove(T t){
        list.remove(t);
    }

    public Iterator<T> iterator(){
        return new MyIterator(list);
    }

    /** 自定义迭代器*/
    private class MyIterator implements Iterator<T> {
        private List<T> datas;
        //当前位置指针
        private int curPos;

        public MyIterator(List<T> list) {
            this.datas = list;
        }

        @Override
        public boolean hasNext() {
            return curPos < datas.size();
        }

        @Override
        public T next() {
            T t = datas.get(curPos);
            curPos++;
            return t;
        }
    }
}
