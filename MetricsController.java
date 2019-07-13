package com.problem.shaheed.statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.problem.shaheed.service.MetricsService;

@RestController
public class MetricsController {
	
	@Autowired
	public MetricsService metricService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/getRegistereddeviceDetails")
	public String sayHello(@RequestParam String deviceId, 
			@RequestParam String startDate,
			@RequestParam String endDate) {
		try {
			
			return metricService.getEventsWithDateRange(deviceId, startDate, endDate);
		} catch(Exception e) {
			return "";
		}
		
	}
}
