package com.happy.how;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;
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
	public Smile addSmile() {
		Random random = new Random();
		Smile build = new Smile(BigInteger.valueOf(random.nextLong()), UUID.randomUUID().toString());
		smileRepository.save(build);
		return build;
	}

	@RequestMapping("/all")
	public List<Smile> allSmile() {
		return smileRepository.findAll();
	}
	
	@RequestMapping("/delete")
	public String deleteAllSmilies() {
		long count = smileRepository.count();
		smileRepository.deleteAll();
		return count + " deleted"; 
	}
}
