import com.mkyong.core.App;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AppTest {
	private App app;

	@Before
	public void setUp() {
		App app = new App();
	}

	@Test
	public void shouldInjectName() {
		assertThat(app.showNameInjection(), is("Zhanhonglai"));
	}

	@Test
	public void shouldInjectAge() {
		assertThat(app.showAgeInjection(), is(18));
	}
}
