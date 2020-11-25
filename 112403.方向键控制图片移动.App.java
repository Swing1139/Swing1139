package pac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class App {
    private JPanel myPanel=new JPanel();
    private JLabel label_background = new JLabel();
    private JLabel Forget  = new JLabel();

    //构造方法
    public App() {
        URL imgURL1 = App.class.getResource("img/background.png");
        URL imgURL2 = App.class.getResource("img/plane1.png");
        Forget.setIcon(new ImageIcon(imgURL2));
        Forget.setBounds(100,200,128,128);
        label_background.setIcon(new ImageIcon(imgURL1));
        label_background.setBounds(0,0,600,900);

        myPanel.add(Forget);
        myPanel.add(label_background);
        myPanel.setLayout(null);
        myPanel.setFocusable(true);

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()){
// 键盘左
                    case KeyEvent.VK_LEFT:
                        Forget.setBounds(Forget.getX() - 128,Forget.getY(),128,128);
                        break;
//  键盘右
                    case KeyEvent.VK_RIGHT:
                        Forget.setBounds(Forget.getX() + 128,Forget.getY(),128,128);
                        break;
//  键盘上
                    case KeyEvent.VK_UP:
                        Forget.setBounds(Forget.getX(),Forget.getY() - 128,128,128);
                        break;
// 键盘下
                    case KeyEvent.VK_DOWN:
                        Forget.setBounds(Forget.getX(),Forget.getY() + 128,128,128);
                        break;
                    default:
                        break;
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("飞机大战");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
