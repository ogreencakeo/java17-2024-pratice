package Section15;

public class ThrowAndThrowsEx {
    public static void main(String[] args) {

        boolean result = false;
        try {
            result = findClass();
            if(result) System.out.println("클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace(); // 개발자용, 배포시에는 제거나 주석처리
        }finally{
            System.out.println("정상 종료합니다.");
        }
    }

    public static boolean findClass() throws ClassNotFoundException{
        // Class class1 = Class.forName("java.lang.String");
        Class class1 = Class.forName("java.lang.String2");
        
        System.out.println("Hi");

        if(class1 != null) return true; // 클래스가 있다면
        else return false;
    }
}
