import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_plane=new JLabel();
    int CELL=64;
    int row=0,column=0;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    row--;
                   label_plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_DOWN){
                    row++;
                    label_plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_LEFT){
                    column--;
                    label_plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_RIGHT){
                    column++;
                    label_plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(50,50,CELL,CELL);
        myPanel.add(label_plane);


        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("方向键控制图片移动");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
