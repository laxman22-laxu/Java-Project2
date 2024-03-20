public class Officer extends Staff{
    private String grade;

    public Officer (String code, String name, String grade){
        super(code,name);
        this.grade = grade;
    }
    public void ManageDepartment(){
        System.out.println(name +"manages "+grade+"GRades.");
    }
}
