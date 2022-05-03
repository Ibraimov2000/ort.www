package kg.ort.www.service;

import kg.ort.www.entity.Organiser;
import kg.ort.www.repository.OrganiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class OrganiserDetailsService implements UserDetailsService {

	@Autowired
	OrganiserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Organiser org=repo.findByEmail(email);
		if(org==null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return new OrganiserDetails(org);
	}
}
