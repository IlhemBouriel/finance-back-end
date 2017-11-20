package com.example.SpringFinance.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringFinance.Model.Topic;
import com.example.SpringFinance.Service.HelloService;

@RestController
public class HelloController {
		
	@Autowired
	public HelloService service;
	
		@RequestMapping("/finance")
		public List<Topic> sayHi() {
			return service.getAllTopics();
		}
		
		@RequestMapping("/parser")
		public Map<String, String[]> parseFlux()
		{
			return service.getAllCours();
		}
		
		@RequestMapping("/palmaresH")
		public Map<Integer, Map<String,String>> parsePalmaresH()
		{
			return service.getPalmaresH();
		}
		
		@RequestMapping("/palmaresB")
		public Map<Integer, Map<String,String>> parsePalmaresB()
		{
			return service.getPalmaresB();
		}
		
		@RequestMapping("/palmaresV")
		public Map<Integer, Map<String,String>> parsePalmaresV()
		{
			return service.getPalmaresV();
		}
		
}
