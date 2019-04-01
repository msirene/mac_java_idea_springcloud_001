package work.hang.service.impl;

import org.springframework.stereotype.Component;
import work.hang.service.SchedualServiceHi;

/**
 * @author 六哥
 * @version 1.0
 * @date 2019-04-01 09:58
 * @description SchedualServiceHiHystric
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry " + name;
	}
}
