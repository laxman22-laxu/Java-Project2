public class ClassDiagram {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("123", "Ream", "maths", "Asmita");
        Officer off = new Officer("111", "Laxman", "12");

        System.out.println("Detaills ");
        mathTeacher.displayDetails();
        mathTeacher.teach();

        off.displayDetails();
        off.ManageDepartment();

    }
}
