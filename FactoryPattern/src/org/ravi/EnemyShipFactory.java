package org.ravi;

public class EnemyShipFactory {

	
	
	public static EnemyShip giveEnemyShip(String enemyShipName){
		
		
		EnemyShip enemyShip=null;
		
		if(enemyShipName.equals("R")){
			
			return new RocketEnemyShip();
		}else{
			
			return null;
		}
	}
}
