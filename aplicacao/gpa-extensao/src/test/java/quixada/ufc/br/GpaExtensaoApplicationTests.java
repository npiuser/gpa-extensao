package quixada.ufc.br;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import ufc.quixada.npi.gpa.config.GpaExtensaoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GpaExtensaoApplication.class)
@WebAppConfiguration
public class GpaExtensaoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
