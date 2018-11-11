package com.example.myproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 注解表示该 controller 类中所有的方法都是以 json 格式输出的，不用再写 jackjson 的配置了；
 * 
 * 以往 spring 开发 json 接口的时候，需要配置的如下：
 * 	1.添加jackjson等相关jar包
 * 	2.配置spring controller 的扫描
 * 	3.对接的方法添加 @ResponseBody
 * 
 * springboot 的做法是只要在类上添加注解 @RestController 即可，默认类中所有的方法都以 json 的方式返回；
 * 如果需要使用页面开发，只要使用 @Controller 注解即可；
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String index() {
		return "hello world";
	}
	
	@RequestMapping("/hellotest")
	public String test() {
		return "hello test";
	}
}
