package com.pemila.structural.Flyweight;

/**
 * @author： 月在未央
 * @date： 2019/1/10 15:09
 */
public class FlyweightClient {
    public static void main(String[] args) {
        Goods G1 = GoodsFactory.GetGoods("魅族");
        G1.showPrice("16");
        Goods G2 = GoodsFactory.GetGoods("魅族");
        G2.showPrice("32");
        Goods G3 = GoodsFactory.GetGoods("魅族");
        G3.showPrice("64");
    }
}
