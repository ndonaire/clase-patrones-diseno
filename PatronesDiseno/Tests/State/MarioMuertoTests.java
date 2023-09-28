package State;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarioMuertoTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void recibirDañoTest() {
		MarioMuerto mario = new MarioMuerto();
		
		assertEquals(mario.RecibirDaño().getClass(), MarioMuerto.class);
	}
	
	@Test
	void comerHongoTest() {
		MarioMuerto mario = new MarioMuerto();
		
		assertEquals(mario.ComerHongo().getClass(), MarioMuerto.class);
	}
	

	@Test
	void TomarFlorTest() {
		MarioMuerto mario = new MarioMuerto();
		
		assertEquals(mario.TomarFlor().getClass(), MarioMuerto.class);
	}

}
