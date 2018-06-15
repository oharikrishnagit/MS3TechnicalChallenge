package com.ms3.range.convert.service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.validation.ConstraintViolationException;

import org.springframework.stereotype.Service;

@Service
public class RangeConversionService {
	
	public Map<Integer,String> convertRange(Integer start , Integer end) {
		if (start > end) {
			throw new ConstraintViolationException("The start of range must be less than or equal to the end of the range", null);
		}
		return IntStream.rangeClosed(start,end)
				.boxed()
				.collect(Collectors.toMap(i -> i, i -> applyConversionAlgorithm(i)));
	}
	
	private String applyConversionAlgorithm(Integer i) {
		String convertedValue = null;
		
		if (i%21 == 0) {
			convertedValue = "MS3 and ME";
		}else if (i%3 == 0) {
			convertedValue = "ME";
		}else if (i%7 == 0) {
			convertedValue = "MS3";
		} else {
			convertedValue = i.toString();
		}
		return convertedValue;
	}

}
