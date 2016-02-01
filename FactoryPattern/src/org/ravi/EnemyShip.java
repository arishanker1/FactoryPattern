package org.ravi;

public abstract class EnemyShip {

	private String name;
	private double damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	
	
	public void followHeroShip(){
		System.out.println(getName()+"is following the hero");
	}
	
	public void getEnemyShip(){
		
		System.out.println(getName()+"enemyShip");
	}
	
	
}
