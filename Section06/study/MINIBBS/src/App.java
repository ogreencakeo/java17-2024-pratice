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

// public class Start{ // 불가능함
class Start{
    public static void main(String str){ // 파라미터(Parameter), 매개변수
        System.out.println(str + "~!"); 
    } // 가능함
}


// class App {
//     public void main(String[] args) throws Exception {
//         // System.out.println("Hello, World!");
        
//         // String greeting = "Hi^^ ";

//         // new Start().main(greeting);

//     }
// }

// public class Start{
//     public static void main(String[] args){
//         System.out.println("스타트 페이지"); 
//     }
// }
