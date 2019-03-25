package test.dubbo.impl;

import test.dubbo.IpersonInfoService;

public class PersonInfoServiceImpl implements IpersonInfoService {

	@Override
	public String queryPersonInfoAll() {
		// TODO Auto-generated method stub
		System.out.println("===================================");
        System.out.println("接口实现：queryPersonInfoAll()");
        System.out.println("===================================");
        return "from PersonInfoServiceImpl : some person Info";
	}

	@Override
	public String queryPersonInfoByNumber(String personNumber) {
		System.out.println("===================================");
        System.out.println("接口实现：queryPersonInfoByNumber(String personNumber)");
        System.out.println("===================================");
        return "from PersonInfoServiceImpl ：" + personNumber + " 's Info.";
	}

}
