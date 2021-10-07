import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.stage.Stage;

public class JavaApplication29 extends Application {


    public static void main(String[] args) {
        System.out.println("Start of main()");

        MyTask task = new MyTask();
        new Thread(task).start();



        System.out.println("End of main()");
        System.exit(0);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}



class MyTask extends Task<Void> {

    @Override
    protected Void call() throws Exception {
       for(int i =0; i<10; i++){
           Thread.sleep(300);
       }

       return null;
    }

    @Override
    protected void succeeded() {
        System.out.println("End of MyTask");
    }
}