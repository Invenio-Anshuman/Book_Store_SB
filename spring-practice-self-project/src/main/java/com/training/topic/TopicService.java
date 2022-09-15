package com.training.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
		
	
	List<Topic> topics = Arrays.asList(
			
			// objects of Topic from the topic class has been created to add it on the list   
			// 5 topic objects as list 
			// calling the constructor on the topic class to create a new object
			new Topic("Spring", "Spring Framework", "Spring Framework Description"), //new object 
			new Topic("Python", "Core Python", "python for Beginners"),
			new Topic("Ds-Python", "Data Science Python", "Python for data science"),
			new Topic("Java", "Core Java", "Java for beginners"),
			new Topic("JavaScript", "complete Javascript", "JavaScript for deveopers")
			
			);
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
 