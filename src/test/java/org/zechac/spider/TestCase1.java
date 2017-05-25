package org.zechac.spider;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Created by Administrator on 2017/5/25.
 */
@Slf4j
public class TestCase1 {

    @Test
    public void test1(){
        String s=String.format("aa%s",null);
        log.info(s);
    }
}
