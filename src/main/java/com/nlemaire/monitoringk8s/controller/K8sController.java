package com.nlemaire.monitoringk8s.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class K8sController {

	@RequestMapping("/pods")
	public String listAllPods() {
		return "Not implemented yet!";
	}

}
