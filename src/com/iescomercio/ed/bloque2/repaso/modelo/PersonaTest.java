package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PersonaTest {

	@Test
	void testPersona() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDni() {
		Persona p = new Persona ("1111F","Diego","Barrientos");
		assertEquals("1111F", p.getDni());
	}

	@Test
	void testSetDni() throws Exception {
		Persona p = new Persona ("1111F","Diego","Barrientos");
		Exception e=assertThrows(Exception.class,
				()-> p.setDni("2222"));
		assertEquals("El ultimo caracter introducido no es una letra", e.getMessage());
		p.setDni("2222F");
		assertEquals("2222F", p.getDni());
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
