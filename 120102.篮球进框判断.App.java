import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    //JLabel label_txt=new JLabel();
    JLabel label_ball=new JLabel();
    JLabel label_basket=new JLabel();
    JLabel label_background=new JLabel();
    JLabel label_score = new JLabel();
    int CELL=64;
    int row,column;
    int score;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    row--;
                    label_ball.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_DOWN){
                    row++;
                    label_ball.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_LEFT){
                    column--;
                    label_ball.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_RIGHT) {
                    column++;
                    label_ball.setBounds(column * CELL, row * CELL, CELL, CELL);
                }
                    if (label_ball.getY() == CELL*5 && label_ball.getX() == CELL*5) {
                        score++;
                        label_score.setText("得分：" + String.valueOf(score));
                    }
            }
        });

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/ball.gif");
        label_ball.setIcon(new ImageIcon(imgURL));
        label_ball.setBounds(CELL,CELL,CELL,CELL);

        java.net.URL imgURL1 = App.class.getResource("img/basket.jpg");
        label_basket.setIcon(new ImageIcon(imgURL1));
        label_basket.setBounds(CELL*5,CELL*5,CELL,CELL);

        java.net.URL imgURL2 = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL2));
        label_background.setBounds(0,0,1024,768);

        label_score.setText("得分：0");//设置分数值
        label_score.setBounds(10,0,200,80);//设置分数的坐标值
        myPanel.add(label_score);
        myPanel.add(label_ball);
        myPanel.add(label_basket);
        myPanel.add(label_background);


        myPanel.setLayout(null);
        JFrame frame = new JFrame("篮球进框判断");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,768);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
