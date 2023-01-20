package enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	BusinessService businessService;

	//CONSTRUCTOR INJECTION EXAMPLE
	//NOTE: It is recommended by spring to use. While using this annotation can be at CONSTRUCTOR or FEILD
	@Autowired
	public MyWebController(BusinessService businessService) {
		super();
		this.businessService = businessService;
	}

	public int getValue() {
		return businessService.getSum();
	}

}
