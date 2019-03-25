package test.dubbo.client;

import org.springframework.stereotype.Service;

@Service
public class CarService {
	public String getColor(Integer id){
		return "red";
	}
}
