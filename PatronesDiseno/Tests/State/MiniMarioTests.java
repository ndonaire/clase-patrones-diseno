package State;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiniMarioTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void recibirDañoTest() {
		MiniMario mario = new MiniMario();
		
		assertEquals(mario.RecibirDaño().getClass(), MarioMuerto.class);
	}
	
	@Test
	void comerHongoTest() {
		MiniMario mario = new MiniMario();
		
		assertEquals(mario.ComerHongo().getClass(), MarioGrande.class);
	}
	

	@Test
	void TomarFlorTest() {
		MiniMario mario = new MiniMario();
		
		assertEquals(mario.TomarFlor().getClass(), MarioFuego.class);
	}

}
