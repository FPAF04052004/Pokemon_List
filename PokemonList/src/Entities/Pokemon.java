package Entities;


public class Pokemon implements BaseData {
	private String name;
	private Integer number;
	private Integer HP;
	private Integer attack;
	private Integer defense;
	private Integer spAttack;
	private Integer  spDefense;
	private Integer speed;
	private Types type;
	private Types subType;
	
	public Pokemon() {
	}

	public Pokemon(String name, Integer number, Integer HP, Integer attack, Integer defense, Integer spAttack,Integer spDefense, Integer speed, Types type) {
		this.name = name;
		this.number = number;
		this.HP = HP;
		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;
		this.speed = speed;
		this.type = type;
	}

	public Pokemon(String name, Integer number, Integer HP, Integer attack, Integer defense, Integer spAttack,Integer spDefense, Integer speed, Types type, Types subType) {
		super();
		this.name = name;
		this.number = number;
		this.HP = HP;
		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;
		this.speed = speed;
		this.type = type;
		this.subType = subType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getHP() {
		return HP;
	}

	public void setHP(Integer hP) {
		HP = hP;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpAttack() {
		return spAttack;
	}

	public void setSpAttack(Integer spAttack) {
		this.spAttack = spAttack;
	}

	public Integer getSpDefense() {
		return spDefense;
	}

	public void setSpDefense(Integer spDefense) {
		this.spDefense = spDefense;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public Types getSubType() {
		return subType;
	}

	public void setSubType(Types subType) {
		this.subType = subType;
	}
	
	@Override
	public String pokemonDescription() {
		if(getSubType() == null) {
			return String.format("Name: %s, Number: %d, HP: %d, Attack: %d, Defense: %d, Sp.Attack: %d,  Sp.Defense: %d, Speed: %d, Type: %s.", getName(), getNumber(), getAttack(), getDefense(), getSpAttack(), getSpDefense(), getSpeed(), getType());
		}else {
			return String.format("Name: %s, Number: %d, HP: %d, Attack: %d, Defense: %d, Sp.Attack: %d,  Sp.Defense: %d, Speed: %d, Type: %s, Sub-Type: %s.", getName(), getNumber(), getAttack(), getDefense(), getSpAttack(), getSpDefense(), getSpeed(), getType(), getSubType());
		}
		
	}
	
	public Integer compateTo(Pokemon o) {
		if(this.getNumber() < o.getNumber()) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
