interface wifi{
    void connecte();
    void disconnect();
}
interface recorder{
    default void record(){
        System.out.println("The the recorder is recording in 4k");
    }
    void stopRecording();

}
class Phone{
    void call(){
        System.out.println("The call is connected");
    }
}
class SmartPhone extends Phone implements wifi, recorder{
    public void connecte(){
        System.out.println("The wifi is connected to the XYZ network");
    }
    public void disconnect(){
        System.out.println("The network is disconnected");
    }
    public void record(){
        System.out.println("The the recorder is recording vedio in 4k and sound in mp4");
    }
    public void stopRecording(){
        System.out.println("The recorder has stopped recording");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.record();
    }
}
