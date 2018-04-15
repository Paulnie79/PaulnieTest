/**
 * 
 */
package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author paul
 *
 */

@RestController
@RequestMapping(path = "/v1")
public class HelloController {
	
	@RequestMapping("/hello")
	public String index() {
		return "third hello world!";
	}

}
