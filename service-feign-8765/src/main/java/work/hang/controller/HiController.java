package work.hang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.hang.service.SchedualServiceHi;

/**
 * @author 六哥
 * @version 1.0
 * @date 2019-04-01 09:37
 * @description HiController
 */
@RestController
public class HiController {

	//编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
	@Autowired
	SchedualServiceHi schedualServiceHi;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
