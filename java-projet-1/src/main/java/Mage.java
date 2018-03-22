public class Mage extends playerClass {//creation of the Mage class, inheriting from the superclass playerClass
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
}