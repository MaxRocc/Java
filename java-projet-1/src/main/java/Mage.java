public class Mage extends PlayerClass {//creation of the Mage class, inheriting from the superclass PlayerClass
    private String spell;
    private boolean potion;

    public String getSpell(){
        return this.spell;
    }
    public void setSpell(String inputSpell){
        this.spell = inputSpell;
    }
    public boolean getPotion(){
        return this.potion;
    }
    public void setPotion(boolean inputPotion){
        this.potion = inputPotion;
    }

    public String toString()
    {
        return super.toString() + "\nSpell = "+spell+"\nPotion = "+potion;//SUPER allows to access a method from the superclass
    }
}