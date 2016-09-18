package com.happy.how;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smile")
public class SmileController {

	@Autowired
	private SmileRepository smileRepository;

	@RequestMapping("/add")
	public String addSmile() {
		Smile build = new Smile( UUID.randomUUID().toString());
		smileRepository.save(build);
		return "added";
	}

	@RequestMapping("/all")
	public List<Smile> allSmile() {
		return smileRepository.findAll();
	}
}
