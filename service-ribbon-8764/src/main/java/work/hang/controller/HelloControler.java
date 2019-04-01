package work.hang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.hang.service.HelloService;

/**
 * @author 六哥
 * @version 1.0
 * @date 2019-04-01 09:21
 * @description HelloControler
 */
@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
}
