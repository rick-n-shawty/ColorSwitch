package ColorChangeApp;
public class Main {
    public static void main(String args[]){
        MyFrame frame = new MyFrame(); 
        while(true){
            frame.setBackground();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}
