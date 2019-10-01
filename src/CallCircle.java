
import chap4.Circle;

public class CallCircle {

    public static void main(String[] args) {
        Circle cc = new Circle(87.75);
        System.out.println("R : "+Math.floor( cc.getRadius() ));
        System.out.println("Area : "+Math.floor( cc.computeArea() ));
        System.out.println("รอบวง : "+Math.floor( cc.computeCircumference() ));
        System.out.println("ผ่าศูนย์กลาง : "+Math.floor( cc.computeDiameter() ));
        
        System.out.println(Math.floor(125.562));
        
    }
}
