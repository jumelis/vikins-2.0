package org.example.vikins;import org.example.soldier.Soldier;class Viking extends Soldier {
    public String name;
    public String msg;
    public Viking(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }
    public String receiveDamage(int damage) {
        this.health -= damage;
        if (this.health > 0) {
            this.msg = this.name + "has received" + damage + "points of damage";
        } else {
            this.msg = this.name + "has died in combat";
        }
        return String.valueOf(this.health);
    }
    public String getMsg() {
        return this.msg;
    }
    public String battleCry(){
        return "Odin Owns You All!";
    }
}



