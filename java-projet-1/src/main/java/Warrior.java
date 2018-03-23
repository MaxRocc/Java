public class Warrior extends PlayerClass {//creation of the Warrior class, inheriting from the superclass PlayerClass
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

    public String toString()
    {
        return super.toString() + "\nWeapon = "+weapon+"\nShield = "+shield;//SUPER allows to access a method from the superclass
    }
}