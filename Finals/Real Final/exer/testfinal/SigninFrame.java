import java.awt.*;
import javax.swing.*;
public class SigninFrame {
public static void main(String args[]) {
JFrame f; JPanel p; JLabel mlbl, ulbl, pwlbl; JTextField usertxt;
JPasswordField pwtxt; JButton signbtn, resetbtn;
Font fn1 = new Font("Tahoma", Font.BOLD, 12);
Font fn2 = new Font("Courier New", Font.BOLD, 14);
f = new JFrame("เข้าสู่ระบบ"); p = new JPanel();
mlbl = new JLabel("*** กรณุาป้อนข้อมูลเข้าสู่ระบบ ***");
ulbl = new JLabel("username"); pwlbl = new JLabel("password");
usertxt = new JTextField(10); pwtxt = new JPasswordField(10);
signbtn = new JButton("sign in"); resetbtn = new JButton("reset");
mlbl.setForeground(Color.blue);
mlbl.setFont(fn1); ulbl.setFont(fn2);
pwlbl.setFont(fn2); usertxt.setFont(fn1);
pwtxt.setFont(fn1); signbtn.setFont(fn2);
resetbtn.setFont(fn2);
p.add(mlbl); p.add(ulbl); p.add(usertxt);
p.add(pwlbl); p.add(pwtxt); p.add(signbtn);
p.add(resetbtn); 
f.add(p);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(250, 150);
f.setVisible(true);
}
}