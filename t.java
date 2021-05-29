package com.gyhao.sboot.springboot001.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyhao.sboot.springboot001.servce.MainService;

@Controller
@RequestMapping("/userControl")
public class MainControl {

	@Autowired
	private MainService serv;
	
	/**
	 * 此地址为页面访问地址
	 * 此时访问地址为：http://localhost:8080/userControl/aa
	 * @param model
	 * @return
	 */
	@RequestMapping("/aa")
	public String list(ModelMap model) {
		System.out.println("in control ...");
		 serv.save();
		 //返回页面地址,Thymleaf 模板引擎根据这个地址在templates文件夹下找对应HTML页面。
		return "perList";
	}
	
}
