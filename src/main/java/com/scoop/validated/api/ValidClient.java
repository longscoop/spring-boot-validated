package com.scoop.validated.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Validated
public interface ValidClient {

	@GetMapping("/valid")
	String queryById(@RequestParam("id") @Min(1) @Max(400) Integer id);

}
