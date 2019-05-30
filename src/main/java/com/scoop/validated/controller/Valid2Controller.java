package com.scoop.validated.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@RestController
@Validated
public class Valid2Controller {

	@GetMapping("/valid2")
	public String queryById(@RequestParam("id") @Min(1) @Max(400) Integer id) {
		return "id:" + id;
	}
}
