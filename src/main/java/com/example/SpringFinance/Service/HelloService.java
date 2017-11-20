package com.example.SpringFinance.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringFinance.Model.Topic;
import com.example.SpringFinance.Utilities.CoursParser;
import com.example.SpringFinance.Utilities.PalmaresParser;

@Service
public class HelloService {
	
	@Autowired
	public CoursParser parserC;
	@Autowired
	public PalmaresParser parseP;

	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "SpringFramework"),
			new Topic("java", "java Core")
			);
	
	
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Map<String, String[]> getAllCours()
	{
		return parserC.getAllCours();
	}
	
	public Map<Integer, Map<String,String>> getPalmaresH()
	{
		return parseP.getTopHausses();
	}
	
	public Map<Integer, Map<String,String>> getPalmaresB()
	{
		return parseP.getTopBaisses();
	}
	
	public Map<Integer, Map<String,String>> getPalmaresV()
	{
		return parseP.getTopVolumes();
	}
}
