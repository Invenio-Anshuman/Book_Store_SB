package com.training.topic;

//java.util is a library 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
// An annotation called restController is marked so that it tells the spring that this class is a controller class, the spring
// registers it as a controller class and seeks inside the class to execute the code block
@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	// RequestMapping is another annotation that is being used to tell the spring that when we hit any url with /topics do execute the below statement. 
	@RequestMapping("/topics")
	
	// here we are returning a list of all the topic instead of any string prior to this
	public List<Topic> getAllTopics() { 
		
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	
	// We used PathVariable to give a path to the variable that is id
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

}    