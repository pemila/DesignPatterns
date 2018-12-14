package com.pemila.structural.composite;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2018/12/14 17:29
 * @Description：
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Grade lv0 = new Grade("董事会","0");
        Grade lv1 = new Grade("总经理","1");
        Grade lv20 = new Grade("经营经理","2");
        Grade lv21 = new Grade("生产经理","2");
        Grade lv22 = new Grade("财务经理","2");
        Grade lv30 = new Grade("销售部","3");
        Grade lv31 = new Grade("市场部","3");
        Grade lv32 = new Grade("品管部","3");
        Grade lv33 = new Grade("生产部","3");
        Grade lv34 = new Grade("供应部","3");
        Grade lv35 = new Grade("财务部","3");
        Grade lv36 = new Grade("仓库","3");

        lv0.add(lv1);
        lv1.add(lv20); lv1.add(lv21); lv1.add(lv22);

        lv20.add(lv30); lv20.add(lv31);
        lv21.add(lv32); lv20.add(lv33);
        lv22.add(lv34); lv22.add(lv35);lv22.add(lv36);

        Logs.info(lv0.toString());
    }
}
