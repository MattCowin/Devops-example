package com.revature.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.dao.TodoDao;
import com.revature.dao.TodoDaoImpl;

public class TodoDaoTest {

<<<<<<< HEAD
		private final TodoDao dao = new TodoDaoImpl();
		
		@Test
		public void getAllTodos_ShouldReturn1Record() {
			assertEquals(1, dao.getAllTodos().size());
		}
=======
	private final TodoDao dao = new TodoDaoImpl();

	@Test
	public void getAllTodos_ShouldReturn1Record() {
		assertEquals(1, dao.getAllTodos().size());
	}
>>>>>>> 9ebfb8f871bfdd941f38cb1e8c251fc4209a6c05
}
