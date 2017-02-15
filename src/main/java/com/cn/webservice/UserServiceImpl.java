package com.cn.webservice;

import javax.jws.WebService;

import com.cn.WsConstants;
import com.cn.domain.UserDTO;

/**
 * WebService服务端实现类.
 */
// serviceName指明WSDL中<wsdl:service>与<wsdl:binding>元素的名称,
// endpointInterface属性指向Interface类全称.
@WebService(serviceName = "UserService", endpointInterface = "com.cn.webservice.UserService", targetNamespace = WsConstants.NS)
public class UserServiceImpl implements UserService {

	@Override
	public String getUserName(String userId) {
		return "jiangjianbin";
	}

	@Override
	public UserDTO getUser(String userId) {
		UserDTO dto = new UserDTO();
		dto.setId(Long.parseLong("1111"));
		dto.setLoginName("����");
		dto.setName("jiangjianbin");
		dto.setEmail("123@qq.com");
		return dto;
	}

}
