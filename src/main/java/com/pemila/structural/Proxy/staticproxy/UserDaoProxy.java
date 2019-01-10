package com.pemila.structural.Proxy.staticproxy;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 15:55
 */
public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        Logs.info("开始事务...");
        target.save();
        Logs.info("提交事务...");
    }
}
