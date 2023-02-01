package ch01;

// 패키지 : 자바 파일이 모여있는 폴더
public class VarEx01 {
    public static void main(String[] args) {
        boolean b1 = true; // 박스에 1이 저장됨
        boolean b2 = false; // 박스에 0이 저장됨
        int n1 = 1000;
        double d1 = 1000.1;
        char c1 = '가';

        System.out.println(c1);

        n1 = 50; // 값을 변경 (8줄에서 int 해줬으니까 여기서는 안 해줘도 됨)
        System.out.print(n1);
    }
}
