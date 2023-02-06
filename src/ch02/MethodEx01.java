package ch02;

class 손님 {
    // 손님의 행위
    void 커피마시기(){
        System.out.println("손님이 커피를 마셔요");

    }
}

public class MethodEx01 {

    // 메서드 = MethodEx01 클래스의 행위 / void의 {}안에 거만 실행됨
    static void start() {
        System.out.println("만나서 반갑습니다. "); // String type ("")
        System.out.println("start 메서드 종료");

    }
    public static void main(String[] args) {
        MethodEx01.start(); // 메서드 실행 : 같은 class 안에 있어서 MethodEx01. 생략 가능
        손님 s = new 손님(); // s: 변수명 , class 손님의 커피마시기 자체가 메모리에 뜸 (커피마시기 내부가 메모리에 뜨는 건 아님)
        s.커피마시기(); // 여기서 커피마시기의 내부가 실행이 됨

    }
}
