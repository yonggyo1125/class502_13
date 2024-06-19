package org.choongang.global.configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.Reader;

public class DBConn {
    private static SqlSessionFactory factory;

    static {
        Reader reader = Resources.getResourceAsReader("org/choongang/global/configs/mybatis-config.xml");
    }
}
