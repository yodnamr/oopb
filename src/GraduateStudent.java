public class GraduateStudent extends Student{
    private String studyLevel;
    private String thesisAdviser;
    
    void oralExamination(){
        System.out.println("oralExamination");
    }
    void thesisExamination(){
        System.out.println("thesisExamination");
    }

    @Override
    public void payment() {
        System.out.println("payment by credit");
    }
    
}//end class
