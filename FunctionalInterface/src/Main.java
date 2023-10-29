

public class Main {
    public static void main(String[] args) {

        // METHOD 1 TO USE SHOW: ANONYMOUS INNER CLASS
//        Func obj=new Func() {
//            @Override
//            public void show() {
//
//            }
//        };
        //METHOD 2 TO USE SHOW: IMPLEMENT THE INTERFACE
//        Func obj2=new NormalImplementation();
//        obj2.show();

        //METHOD 3 TO USE SHOW: LAMBDA

        Func obj= ()->{
            System.out.println("lambda implementation");
        };
        obj.showw();
        System.out.println("Hello world!");

        //Thread using Lambda

        Runnable t1=()->{
            for(int i=0;i<10;i++){
                System.out.println(i*2);
                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t11=new Thread(t1);
        t11.start();
    }
}