package com.atuldwivedi.learn.springboot.eignclientdemo;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	@PostMapping("/temp/dealCode/{dealCode}")
	public void doSomeThing(@PathVariable("dealCode") String dealCode,@RequestParam("expectedClosing") String expectedClosing, @RequestParam("lines") List<String> lines) {
		System.out.println("-------------");
		System.out.println(dealCode);
		System.out.println(expectedClosing);
		System.out.println(lines);
		System.out.println("-------------");
	}

}
