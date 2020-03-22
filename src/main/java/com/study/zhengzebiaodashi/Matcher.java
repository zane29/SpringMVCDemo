package com.study.zhengzebiaodashi;

import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/8/13.
 */
public class Matcher {

    Pattern p = Pattern.compile("a*b");
    java.util.regex.Matcher m = p.matcher("aaaaab");
    boolean b = m.matches();

}
