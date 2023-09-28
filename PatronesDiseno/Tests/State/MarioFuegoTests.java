package State;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarioFuegoTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void recibirDañoTest() {
		MarioFuego mario = new MarioFuego();
		
		assertEquals(mario.RecibirDaño().getClass(), MiniMario.class);
	}
	
	@Test
	void comerHongoTest() {
		MarioFuego mario = new MarioFuego();
		
		assertEquals(mario.ComerHongo(), null);
	}
	

	@Test
	void TomarFlorTest() {
		MarioFuego mario = new MarioFuego();
		
		assertEquals(mario.TomarFlor().getClass(), MarioFuego.class);
	}

}
