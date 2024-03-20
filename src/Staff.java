public class Staff {
    protected String code;
    protected String name;

    public Staff(String code, String name){
        this.code = code;
        this.name = name;

    }
    public void displayDetails(){
        System.out.println("Code:"  + code);
        System.out.println("Name:" + name);
    }
}
