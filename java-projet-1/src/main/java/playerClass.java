public abstract class playerClass {//superclass acting as parent for any type of character class (next : Paladin, Thief, etc.)
    private String firstName;//
    private String Image;//temp storing of image as an empty string variable
    private int Life;//creating the variable that will store the character's Health Points
    private int Attack;//creating the variable that will store the character's Attack Points
    private String attackItem;//temp storing of weapon
    private String defenseItem;//temp storing of shield

    /*Name setter and getter*/
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String inputWarriorName){
        this.firstName = inputWarriorName;
    }
    /*Image setter and getter*/
    public String getImage(){
        return this.Image;
    }
    public void setImage(String inputImage){
        this.Image = inputImage;
    }
    /*Life setter and getter*/
    public Integer getLife(){
        return this.Life;
    }
    public void setLife(Integer inputLife){
        this.Life = inputLife;
    }
    /*Attack setter and getter*/
    public Integer getAttack(){
        return this.Attack;
    }
    public void setAttack(Integer inputAttack){
        this.Attack = inputAttack;
    }

    public String toString()
    {
        return "nom = " + firstName + " life = " + Life;
    }
}