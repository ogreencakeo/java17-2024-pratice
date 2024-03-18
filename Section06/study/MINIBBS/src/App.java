public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        String greeting = "Hi^^ ";

        new Start().main(greeting);
    }
    

    // public static void start(){
    //     System.out.println("=====start=====");
    // }
}

class Start{
    public static void main(String str){ // 파라미터(Parameter), 매개변수
        System.out.println(str + "~!"); 
    } // 가능함
}
