package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {
	private Curso c;
	private Persona p;
	@BeforeEach
	void setUp() throws Exception {
		c= new Curso();
		p= new Persona("12345678D", "Diego", "Barrientos");
		c.aniadirAlumno(p);
	}

	@Test
	void testEliminarAlumno() throws Exception {
		Exception e=assertThrows(Exception.class,
				()-> c.eliminarAlumno("12414"));
		assertEquals("El dni no tiene la longitud adecuada", e.getMessage());
		c.eliminarAlumno(p.getDni());
		assertFalse(c.estaRegistrado(p.getDni()));
	}

	@Test
	void testAniadirAlumno() {
		
		assertTrue(c.estaRegistrado(p.getDni()));
	}

	@Test
	void testEstaRegistrado() {
		
		assertTrue(c.estaRegistrado(p.getDni()));
	}

	@Test
	void testCurso() {
		Curso curso = new Curso();
		assertNull(curso);
	}

	@Test
	void testNumeroAlumnos() {
		assertEquals(1, c.numeroAlumnos());
	}

}
