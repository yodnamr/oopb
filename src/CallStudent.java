public class CallStudent {
        //psvm + tab
    public static void main(String[] args) {
        Student nali = new Student();
        System.out.println(">>" + nali  );
        nali.enrollment();
        nali.payment();
        nali.addCourse();
        nali.dropCourse();
        System.out.println("===============");
        GraduateStudent yaya = new GraduateStudent();
        yaya.enrollment();
        yaya.addCourse();
        yaya.dropCourse();
        yaya.payment();   
        yaya.oralExamination();
        yaya.thesisExamination();
    }
}//end class
