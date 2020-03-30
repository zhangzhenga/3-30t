/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: PersonTest.java 
 * @Prject: zhangzheng-common3
 * @Package: com.zheng.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年3月30日 下午2:43:23 
 * @version: V1.0   
 */
package com.zheng.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: PersonTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年3月30日 下午2:43:23  
 */
public class PersonTest {

	@Test
	public void test() {
		Calendar cal=Calendar.getInstance();
		cal.set(2010, 0,1);
		Date date = new Date();
		Date date2 = cal.getTime();
		long time = date.getTime();
		long time2 = date2.getTime();
		SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<10000;i++){
			Person p=new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			long random=(long) (Math.random()*(time-time2)+time2);
			p.setCreated(sm.format(new Date(random)));
			System.out.println(p);
		}
	}

}
