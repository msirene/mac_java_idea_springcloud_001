package work.hang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import work.hang.service.impl.SchedualServiceHiHystric;

/**
 * @author 六哥
 * @version 1.0
 * @date 2019-04-01 09:36
 * @description SchedualServiceHi
 */

@FeignClient(value = "EUREKA-CLIENT", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

