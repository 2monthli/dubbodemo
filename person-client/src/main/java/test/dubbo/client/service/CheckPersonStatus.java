package test.dubbo.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dubbo.IpersonInfoService;

@Service
public class CheckPersonStatus {
	
	@Autowired
    private IpersonInfoService personInfoService;

    public String checkAllPersonStatus() {
        return personInfoService.queryPersonInfoAll();
    }

    public String checkPersonStatusByPersonNumber(String personNumber) {
        return personInfoService.queryPersonInfoByNumber(personNumber);
    }
}
