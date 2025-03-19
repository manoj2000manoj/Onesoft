package com.MyWEbApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/WebApp")
@RestController
public class MyController {
	@GetMapping(value = "/get")
	public String getWord() {
		return "HelloWorld";
	}

	@GetMapping(value = "/getname/{n}/{m}")
	public String getWord1(@PathVariable String n, @PathVariable String m) {
		return "Hello" + n + m;
	}

	@GetMapping(value = "/getname/{n}")
	public String getWord2(@PathVariable String n) {
		return "Hello" + n;
	}

	@GetMapping(value = "/getprime/{num}/{num1}")
	public List<Integer> getnum(@PathVariable int num, @PathVariable int num1) {
		List<Integer> numb = new ArrayList<>();

		for (int i = num; i < num1; i++) {
			boolean b = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
				}
			}
			if (b == true) {
				numb.add(i);

			}
		}
		return numb;
	}

	@GetMapping(value = "/getoddoreven/{n}")
	public String getW(@PathVariable int n) {
		if (n % 2 == 0) {
			return n + " is even number";
		} else {
			return n + " is odd number";
		}
	}

	@GetMapping(value = "/getAccess")
	public String getthis(@RequestParam String username, @RequestParam String password) {
		if (username.equals("nisha") && password.equals("nisha123")) {
			return "Access Allowed";
		} else {
			return "Access denied";
		}
	}

	@GetMapping(value = "/getShirt")
	public Shirt getShirt(@RequestBody Shirt s) {
		return s;
	}

	@GetMapping(value = "/getShirt1")
	public Shirt getShirt1(@RequestBody List<Shirt> s) {
		return s.stream().min(Comparator.comparing(Shirt::getPrice)).get();
	}
	 @GetMapping("/{day}/{month}/{year}")
	    public String convertDate(@PathVariable String day, @PathVariable String month, @PathVariable String year) {
	        String input = day + " " + month + "," + year;
	        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd MMMM,yyyy", Locale.ENGLISH);
	        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        LocalDate date = LocalDate.parse(input, inputFormat);
	        return date.format(outputFormat);
	    }
	 @GetMapping("/{input}")
	    public String findCharacterCounts(@PathVariable String input) {
	        Map<Character, Integer> map = new LinkedHashMap<>();

	        for (char c : input.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        StringBuilder result = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            result.append(entry.getKey()).append(entry.getValue());
	        }

	        return result.toString();
	    }
	 @GetMapping("/count/{input}")
	    public String getCharacterFrequency(@PathVariable String input) {
	        Map<Character, Integer> map = new LinkedHashMap<>();

	        for (char c : input.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        StringBuilder result = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            result.append(entry.getKey()).append(entry.getValue());
	        }

	        return result.toString();
	    }

}
