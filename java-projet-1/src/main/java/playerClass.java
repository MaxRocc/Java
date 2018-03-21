abstract public class playerClass {
   private String firstName = "";
    String Image;
    int Life=20;
    int AttackLevel=2;


    String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String inputWarriorName){
        this.firstName = inputWarriorName;
    }
}