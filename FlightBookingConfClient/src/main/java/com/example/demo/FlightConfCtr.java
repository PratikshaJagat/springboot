package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FlightConfCtr {

	@Autowired
	private FlightConfiguration conf;

	@GetMapping("/maximum")
	public ResponseEntity<Object> getMAxFromConf() {
		System.out.println(conf.getFlexi());
		System.out.println(conf.getFlexirate());
		System.out.println(conf.getMaximum());
		return new ResponseEntity<Object>(new MyJSONWrapper("" + conf.getMaximum()), HttpStatus.OK);
	}
	@GetMapping("/flexi")
	public ResponseEntity<Object> getFlexiFromConf() {
		HashMap<Integer, Integer> res = new HashMap<>();
		String flexi[] = conf.getFlexi().split(",");
		String flexiRates[] = conf.getFlexirate().split(",");
		for(int i =0; i<flexi.length;i++) {
			res.put(new Integer(flexi[i]),new Integer(flexiRates[i]));
		}
		return new ResponseEntity<Object>(res, HttpStatus.OK);
	}
	
//	@GetMapping("/maximum")
//	public String getMAxFromConf() {
//		System.out.println(conf.getFlexi());
//		System.out.println(conf.getFlexirate());
//		System.out.println(conf.getMaximum());
//		return "ok";
//	}
//	@GetMapping("/flexi")
//	public String getFlexiFromConf() {
//		HashMap<Integer, Integer> res = new HashMap<>();
//		String flexi[] = conf.getFlexi().split(",");
//		String flexiRates[] = conf.getFlexirate().split(",");
//		for(int i =0; i<flexi.length;i++) {
//			res.put(new Integer(flexi[i]),new Integer(flexiRates[i]));
//		}
//		return "kake";
//	}
//

}
