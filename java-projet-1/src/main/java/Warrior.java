public class Warrior extends playerClass {//creation of the Warrior class, inheriting from the superclass playerClass
    private String weapon;
    private boolean shield;

    public String getWeapon(){
        return this.weapon;
    }
    public void setWeapon(String inputWeapon){
        this.weapon = inputWeapon;
    }
    public boolean getShield(){
        return this.shield;
    }
    public void setShield(boolean inputShield){
        this.shield = inputShield;
    }
}