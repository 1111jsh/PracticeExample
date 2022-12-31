public class Outer { // 외부 클래스

    int outer_iv;
    static int outer_cv;
    class instance_inner { // 내부 인스턴스 클래스
        int instance_inner_iv; // 내부에서 iv 선언
       // static int instance_inner_cv; // 내부 cv선언 불가
        static final int INSTANCE_INNER_CONST = 0; // 상수는 static 가능

        int instance_inner_iv2 = outer_iv; // 내부에서 외부 iv접근가능
        int instance_inner_iv3 = outer_cv; // 내부에서 외부 cv접근가능
         }

         static class static_inner { // 내부 static클래스
        int static_inner_iv; // 내부에서 iv선언 가능
             static int static_inner_cv; // 내부에서 cv 선언 가능
           //  int static_inner_iv2 = outer_iv; // 내부에서 외부 iv 불가
             int static_inner_cv2 = outer_cv; // 내부에서 외부 cv 가능
         }
}
