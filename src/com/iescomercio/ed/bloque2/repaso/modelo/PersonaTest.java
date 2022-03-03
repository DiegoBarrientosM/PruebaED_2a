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
		Persona p = new Persona ("1111F","Diego","Barrientos");
		assertEquals("Diego", p.getNombre());
	}

	@Test
	void testSetNombre() {
		Persona p = new Persona ("1111F","Diego","Barrientos");
		p.setNombre("Paco");
		assertEquals("Paco", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		Persona p = new Persona ("1111F","Diego","Barrientos");
		assertEquals("Barrientos", p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		Persona p = new Persona ("1111F","Diego","Barrientos");
		p.setNombre("Gongora");
		assertEquals("Gongora", p.getApellido1());
	}

}
