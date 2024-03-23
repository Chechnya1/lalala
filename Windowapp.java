
import javax.swing.JFrame;

public class Windowapp {
      public static void main(String[] args) {
       JFrame wnd=new JFrame("Обычное окно");
       wnd.setSize(300, 200);
       wnd.setLocation(250, 250);
       wnd.setResizable(false); //окно постоянных размеров
       // реация на щелчок системной пиктограммы
       wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       // отображение окна на экране
       wnd.setVisible(true); 
    }
}