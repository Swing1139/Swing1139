

import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class App extends JFrame implements Runnable {
    private JLabel[] mouses; // 存放显示地鼠的标签数组
    private ImageIcon imgMouse; // 地鼠图片对象
    private JLabel  score;// 得分
    private  int m=0;// 记录其打到了几次地鼠


    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    App frame = new App();// 创建窗体
                    frame.setVisible(true);// 显示窗体
                    new Thread(frame).start();// 启动线程
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    //构造函数，初始化
    public App() {
        super();
        setResizable(false); // 禁止调整窗体大小
        getContentPane().setLayout(null); // 窗体不使用布局管理器
        setTitle("依依妖妖打地鼠游戏"); // 设置窗体标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 初始化背景图片对象
        ImageIcon img =new ImageIcon("img/background.jpg");
        // 初始化地鼠图片对象
        imgMouse=new ImageIcon("img/mouse.gif");

        final JLabel back = new JLabel(); // 创建显示背景的标签
        // 设置标签与背景图片相同大小
        back.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        // 设置窗体近似背景图片大小
        setBounds(100, 100, 1024, 720);
        back.setIcon(img); // 添加背景到标签
        getContentPane().add(back); // 添加背景标签到窗体

        mouses = new JLabel[8]; // 创建显示地鼠的标签数组
        for (int i = 0; i < 8; i++) { // 遍历数组
            mouses[i] = new JLabel(); // 初始化每一个数组元素
            // 设置标签与地鼠图片相同大小
            mouses[i].setSize(imgMouse.getIconWidth(), imgMouse.getIconHeight());//大小就设为老鼠图片的大小
            mouses[i].addMouseListener(new MouseAdapter() { // 为标签添加鼠标事件监听适配器
                @Override
                public void mouseClicked(MouseEvent e) {//加分
                    Object source = e.getSource(); // 获取事件源，即地鼠标签
                    if (source instanceof JLabel) { // 如果事件源是标签组件
                        JLabel mouse = (JLabel) source; // 强制转换为JLabel标签
                        //mouse.setIcon(null); // 取消标签图标

                        if (mouse.getIcon() != null) {// 如果地鼠标签存在地鼠图片，设置为空
                            m++;// 被击中地鼠数量自增
                            score.setText("Your score:" +m+"");//更新计分器，加入分数
                        }
                        mouse.setIcon(null);
                    }
                }
            });
            this.getContentPane().add(mouses[i]); // 添加显示地鼠的标签到窗体
        }
        score=new JLabel();//得分
        score.setBounds(10, 10, 200, 50);//位置与大小
        score.setFont(new Font("Arial", Font.PLAIN,20));//字体大小
        score.setForeground(Color.black);//字体颜色
        score.setText("Your score:0");//字

        mouses[0].setLocation(525, 590);//每个老鼠图片的位置
        mouses[1].setLocation(420, 512);
        mouses[2].setLocation(235, 472);
        mouses[3].setLocation(542, 440);
        mouses[4].setLocation(525, 385);
        mouses[5].setLocation(716, 370);
        mouses[6].setLocation(820, 435);
        mouses[7].setLocation(770, 525);

        this.getContentPane().add(score);//加入计分器
        this.getContentPane().add(back);//加入背景
        this.setVisible(true);//可见
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可关闭
    }//初始化完成

    public void run() {
        while (true) { // 使用无限循环
            try {
                Thread.sleep(1000); // 使线程休眠1秒
                int index = (int) (Math.random() * 8); // 生成随机的地鼠索引
                if (mouses[index].getIcon() == null) // 如果地鼠标签没有设置图片
                    mouses[index].setIcon(imgMouse); // 为该标签添加地鼠图片
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}





