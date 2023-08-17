package com.example.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Map<String, Object> saveUser(User user) {
		User u = userRepository.save(user);
		Map<String,Object> map = new HashMap<>();
		if (u != null) {
			
			map.put("msg","user datails saved successfully");
			map.put("person",u.getId());
		}
		return map;
	}
	

}
