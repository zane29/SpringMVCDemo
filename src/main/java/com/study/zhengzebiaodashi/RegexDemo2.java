package com.study.zhengzebiaodashi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能：
 * 获取下面这个字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		// 定义字符串
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
        String str ="WO men shi ZHONG guo ren,(234 234 34a 456   AAA )QING wen NI shi SHEN men ren?NI cai cai HA HA ! ";
		// 规则
		String regex = "\\b\\w{3}\\b";
        String regex2 = "\\b\\[a-z]\b";

		// 把则编译成模式对象
		Pattern p = Pattern.compile(regex);
		Pattern p2 = Pattern.compile(regex2);
		// 通过模式对象得到匹配器对象
		Matcher m = p.matcher(s);
		Matcher m2 = p.matcher(s);

        // 调用匹配器对象的功能
		// 通过find方法就是查找有没有满足条件的子串
		// public boolean find()
		// boolean flag = m.find();
		// System.out.println(flag);
		// // 如何得到值呢?
		// // public String group()
		// String ss = m.group();
		// System.out.println(ss);
		//
		// // 再来一次
		// flag = m.find();
		// System.out.println(flag);
		// ss = m.group();
		// System.out.println(ss);

//		while (m.find()) {
//			System.out.println(m.group());
//		}
        while (m2.find()) {
            System.out.println(m2.group());
        }

		// 注意：一定要先find()，然后才能group()
		// IllegalStateException: No match found
		// String ss = m.group();
		// System.out.println(ss);
	}
}
