package com.zlsu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zlsu.vo.User;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		request.setAttribute("msg", "msssssss");
		// response.getWriter().print("jjjjjjj");
		// response.sendRedirect("WEB-INFO/index.jsp");
		return "redirect:jsp/index.jsp";
	}
}
