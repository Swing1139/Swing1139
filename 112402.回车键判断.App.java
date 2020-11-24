import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.setText("");
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.yellow);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.CYAN);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if (textArea_A.getText().equals("王大锤")) {
                        textArea_B.setText("输入正确！\n");
                    }else{
                        textArea_B.setText("输入错误！\n");
                    }
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("名字判断程序");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
