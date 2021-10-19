package com.syskan.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.syskan.model.User;

public class UserDAO {
	private List<User> users = new ArrayList<User>(Arrays.asList(new User(0, "Steve Rogers", "steve@gmail.com"),
			new User(1, "Tony Stark", "tony@iron.com"), new User(2, "Carol Danvers", "carol@xmas.com")));

	private static UserDAO userDAO = null;

	private UserDAO() {
	}

	public static UserDAO instance() {
		if (userDAO == null) {
			userDAO = new UserDAO();
		}
		return userDAO;
	}

	public Optional<User> getUserById(int id) {
		return users.stream().filter(u -> u.getId() == id).findAny();
	}

	public Iterable<String> getAllUsernames() {
		return users.stream().map(user -> user.getName()).collect(Collectors.toList());
	}

	public User addUser(User user) {
		users.add(user);
		return user;
	}
}
