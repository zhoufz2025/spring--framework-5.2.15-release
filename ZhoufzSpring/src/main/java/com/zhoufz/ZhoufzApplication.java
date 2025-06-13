package com.zhoufz;

import com.zhoufz.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhoufz
 * 日期 2025/6/11
 */
@ComponentScan("com.zhoufz")
public class ZhoufzApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ZhoufzApplication.class);

		UserService userService = (UserService)context.getBean("userService");
		System.out.println(userService);


	}
}
