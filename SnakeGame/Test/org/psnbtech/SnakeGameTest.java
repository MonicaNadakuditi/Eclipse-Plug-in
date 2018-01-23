package org.psnbtech;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SnakeGameTest extends Thread {

	public static SnakeGame STest;
	int F_eaten=0;
	
	
	@Before
	public void setUp() throws Exception {
		STest = new SnakeGame();
	}

	
	@Test
	public void testSpawnFruit() {
		STest.spawnFruit();
		assertEquals(100,STest.nextFruitScore);
		}
	
	
	@Test
	public void testUpdateSnake() {
				boolean current_state;
				current_state = STest.isPaused();
				assertFalse(current_state);
			}
	@Test
	public void testUpdateGame() {
		int b;
		STest.resetGame();
	     TileType collision = STest.updateSnake();
		if( collision == TileType.Fruit) {
			F_eaten ++;
			 b = STest.getFruitsEaten();
			 assertEquals(F_eaten,b);
		}
	}
	
	
	
	
}
