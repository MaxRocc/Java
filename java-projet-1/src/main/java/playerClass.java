public abstract class playerClass {//superclass acting as parent for any type of character class (next : Paladin, Thief, etc.)
    private String firstName="";//
    private String Image="";//temp storing of image as an empty string variable
    private int Life;//temp? storing of characters' health points : how will I store an int without giving it a value? or maybe rewriting the value each time
    private int AttackLevel=2;

    String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String inputWarriorName){
        this.firstName = inputWarriorName;
    }

    String getImage(){
        return this.Image;
    }
    public void setImage(String inputImage){
        this.Image = inputImage;
    }

    Integer getLife(){
        return this.Life;
    }
    public void setLife(Integer inputLife){
        this.Life = inputLife;
    }
}