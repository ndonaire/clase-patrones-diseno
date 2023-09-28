package State;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarioGrandeTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void recibirDañoTest() {
		MarioGrande mario = new MarioGrande();
		
		assertEquals(mario.RecibirDaño().getClass(), MiniMario.class);
	}
	
	@Test
	void comerHongoTest() {
		MarioGrande mario = new MarioGrande();
		
		assertEquals(mario.ComerHongo(), null);
	}
	

	@Test
	void TomarFlorTest() {
		MarioGrande mario = new MarioGrande();
		
		assertEquals(mario.TomarFlor().getClass(), MarioFuego.class);
	}

}
