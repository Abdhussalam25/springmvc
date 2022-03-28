package com.training.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
		String encodedPWD = bpe.encode("mgr@123");
		System.out.println(encodedPWD);
	}
}

// ('admin' , $2a$10$wZuTOExEn9AJsQ9YuzwlxuxgInrkgK.cUGKCEki5aC8oT7B/E0kna , ADMIN, 1) //admin123
//('employee', $2a$10$e4PoxkewubDLvcRYBNOapufXUlr8olUA9TYrZrnQ9l1hJZakphxfS ,'EMPLOYEE',1)emp@123
//('manager', $2a$10$ch.Bhj.reKqrsD6EOYrPs.XMxrnZO3XipIBwHKAHgAYRTYe9acF6S, 'MANAGER',mgr@123