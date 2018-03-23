public abstract class PlayerClass {//superclass acting as parent for any type of character class (next : Paladin, Thief, etc.)
    private String firstName;//
    private String image;//temp storing of image as an empty string variable
    private int life;//creating the variable that will store the character's Health Points
    private int attack;//creating the variable that will store the character's attack Points
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
        return this.image;
    }
    public void setImage(String inputImage){
        this.image = inputImage;
    }
    /*Life setter and getter*/
    public Integer getLife(){
        return this.life;
    }
    public void setLife(Integer inputLife){
        this.life = inputLife;
    }
    /*Attack setter and getter*/
    public Integer getAttack(){
        return this.attack;
    }
    public void setAttack(Integer inputAttack){
        this.attack = inputAttack;
    }
    /*Preparing Character information review in Main*/
    public String toString()
    {
        return "Name = "+firstName+"\nImage = "+image+"\nLife = "+life+"\nAttack = "+attack+"\nAttack item";
    }
}