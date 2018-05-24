package com.ms3.range.convert.controller;

import java.util.Map;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms3.range.convert.service.RangeConversionService;

@RestController
@Validated
public class RangeConversionController {

	@Autowired
	RangeConversionService service;
	
	@GetMapping("/convert/range")
	public Map<Integer,String> convertRange(@Range(min=1 ,max=200)
											 @RequestParam
											 Integer start,
											 @Range(min=1 ,max=200)
											 @RequestParam 
											 Integer end ) {
		
		return service.convertRange(start, end);
	}
	

}
