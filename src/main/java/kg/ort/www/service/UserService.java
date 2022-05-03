package kg.ort.www.service;

import kg.ort.www.entity.User;
import kg.ort.www.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService
{
	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		User userFindByUsername = userRepository.findByUsername(username);
		User userFindByName = userRepository.findByName(username);
		User userFindByGoogleUsername = userRepository.findByGoogleUsername(username);
		User userFindByGoogleName = userRepository.findByGoogleName(username);

		if(userFindByUsername != null)
		{
			return userFindByUsername;
		}

		if(userFindByName != null)
		{
			return userFindByName;
		}

		if(userFindByGoogleUsername != null)
		{
			return userFindByGoogleUsername;
		}

		if(userFindByGoogleName != null)
		{
			return userFindByGoogleName;
		}

		return null;
	}

	public User addUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getById(Long id) {
		return userRepository.getById(id);
	}

	public void update(User user, Long id) {
		User user1 = userRepository.getById(id);
		user1.setUsername(user.getUsername());
		user1.setName(user.getName());
		user1.setPassword(user.getPassword());
		userRepository.saveAndFlush(user1);
	}

	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
}

