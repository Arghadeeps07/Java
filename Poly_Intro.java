interface wifi {
    void connecte();
    void disconnect();
}

interface recorder {
    default void record() {
        System.out.println("The the recorder is recording in 4k");
    }

    void stopRecording();

}

class Phone {
    void call() {
        System.out.println("The call is connected");
    }
}

class SmartPhone extends Phone implements wifi {
    public void connecte() {
        System.out.println("The wifi is connected to the XYZ network");
    }

    public void disconnect() {
        System.out.println("The network is disconnected");
    }

    public void record() {
        System.out.println("The the recorder is recording vedio in 4k and sound in mp4");
    }

    public void stopRecording() {
        System.out.println("The recorder has stopped recording");
    }
}

public class Poly_Intro {
    public static void main(String[] args) {
        // The object can only use the methodes in the interface wifi(referece)
        wifi obj = new SmartPhone(); // Using dynamic methode dispatch
        obj.connecte();

        SmartPhone ob = new SmartPhone();
        ob.call();
        ob.connecte();

    }
}
