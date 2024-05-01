package Section17.example02;

import java.util.Map;
import java.util.Set;

public class ThreadGroupEx {
    public static void main(String[] args) {
        // ThreadGroupEx 클래스는 main() 메서드를 포함하고 있습니다. 
        // 여기서 AutoSaveThread 인스턴스를 생성하여 데몬스레드로 설정하고 실행합니다.
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        // Map 컬렉션은 <키, 값> 키로 값을 찾아오는 자료구조의 한 형태,
        // 단, Map은 인터페이스이다.
        // 현재 실행 중인 모든 스레드의 정보를 가져옴
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces(); 
        // Thread.getAllStackTraces()를 사용하여 현재 실행 중인 모든 스레드의 스택 추적 정보를 가져옵니다. 
        // 이 정보는 Map<Thread, StackTraceElement[]> 형태로 반환됩니다.
        
        // Map의 키값을 Set 컬렉션 형태로 가져온다. 
        // (Set은 인터페이스이며, 구슬 주머니와 같은 형태의 자료구조이다.)
        // 가져온 스레드 정보의 키(스레드)들을 Set으로 반환
        Set<Thread> threads = map.keySet();
        // map.keySet()을 사용하여 Map의 키(즉, 스레드)들을 가져온 후 각 스레드에 대해 다음 작업을 수행합니다:

        for(Thread thread : threads){
            System.out.println("스레드 이름 : " + thread.getName() +
                    (thread.isDaemon() ? " (데몬스레드)" : " (주스레드)"));
            
            // 스레드가 속한 스레드 그룹 출력
            System.out.println("\t 소속그룹 : " + thread.getThreadGroup().getName());
            System.out.println();
        }
        
    }
}

// 스레드 이름 : main(주스레드)
// main 스레드는 주 스레드이며, 일반적인 실행 흐름을 담당합니다.
// 소속그룹은 main 스레드 그룹입니다.

// 기타 스레드들은 대부분 데몬스레드로 출력됩니다.
// 데몬스레드는 백그라운드에서 실행되는 스레드로, 일반 스레드의 보조 역할을 합니다.

// 예를 들어, Finalizer, Reference Handler, Signal Dispatcher 등은 시스템 레벨에서 자원 관리를 담당하는 데몬스레드입니다.
// Common-Cleaner, Attach Listener, Notification Thread 등도 시스템 레벨에서 특정 작업을 수행하는 데몬스레드입니다.

// AutoSaveThread도 데몬스레드로 출력되며, main 스레드 그룹에 속해 있습니다.
// 위에서 생성한 AutoSaveThread 인스턴스가 출력됩니다.
// 스레드 그룹의 이름은 각 스레드가 속한 그룹을 나타냅니다. 특히 시스템 레벨의 스레드들은 system 또는 InnocuousThreadGroup과 같은 특수한 그룹에 속해 있습니다.

// 따라서, 위 코드는 현재 JVM에서 실행 중인 모든 스레드의 정보를 수집하고 출력하여 각 스레드의 속성을 확인할 수 있는 예제입니다.