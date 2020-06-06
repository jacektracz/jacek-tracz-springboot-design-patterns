package jacektracz.designpatterns.oo.structural.adapter.infra;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LdapUserWebserviceClient {

	public List<LdapUser> search(String uId, String fName, String lName) {
		// Imagine a search URL is formed here and a GET is then performed
		// Then, the response JSON list is converted to LdapUser objects
		return Arrays.asList(DummyData.ldapUser1/*, DummyData.ldapUser2*/);
	}
	
}
