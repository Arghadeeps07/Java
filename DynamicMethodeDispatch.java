    class Phone{
        void on(){
            System.out.println("Turn on the phone");
        }
    }
    class SmartPhone extends Phone{
        @Override
        void on(){
            System.out.println("Turn on the smart phone");
        }
        void playMusic(){
            System.out.println("Music is playing");
        }
    }
    public class DynamicMethodeDispatch {
        public static void main(String[] args) {
            Phone obj = new SmartPhone();
            obj.on();
        }
    }
