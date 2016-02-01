package org.ravi;

public class ESTest {

	public static void main(String[] args) {


		EnemyShip enemyShip=EnemyShipFactory.giveEnemyShip("R");
		System.out.println(enemyShip.getName());

	}

}
