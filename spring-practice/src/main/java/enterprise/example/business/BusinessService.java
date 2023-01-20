package enterprise.example.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import enterprise.example.data.DataService;

@Component
public class BusinessService {

	//FEILD INJECTION EXAMPLE
	@Autowired
	DataService dataService;

	public int getSum() {
		return dataService.getData().stream().reduce(Integer::sum).get();
	}

}
