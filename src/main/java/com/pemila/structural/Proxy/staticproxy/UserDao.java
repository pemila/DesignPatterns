package com.pemila.structural.Proxy.staticproxy;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 15:51
 */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        Logs.info("保存数据");
    }
}
