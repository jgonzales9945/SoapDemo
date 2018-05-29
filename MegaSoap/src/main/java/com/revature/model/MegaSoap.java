package com.revature.model;

public class MegaSoap {

	private String name;
    private String powerup;
    private int hp;
    
	public MegaSoap() {
		// TODO Auto-generated constructor stub
	}
    
    public MegaSoap(String weakness, String powerup, int hp) {
        super();
        this.name = weakness;
        this.powerup = powerup;
        this.hp = hp;
    }

	public String getPowerup() {
		return powerup;
	}

	public void setPowerup(String powerup) {
		this.powerup = powerup;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setName(String weakness) {
		this.name = weakness;
	}
    public String getName() {
        return name;
    }

	@Override
	public String toString() {
		return "MegaSoap [weakness=" + name + ", powerup=" + powerup + ", hp=" + hp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hp;
		result = prime * result + ((powerup == null) ? 0 : powerup.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MegaSoap other = (MegaSoap) obj;
		if (hp != other.hp)
			return false;
		if (powerup == null) {
			if (other.powerup != null)
				return false;
		} else if (!powerup.equals(other.powerup))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
