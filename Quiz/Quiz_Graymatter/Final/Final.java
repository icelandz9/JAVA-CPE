package Quiz.Quiz_Graymatter.Final;

import javax.swing.*;
import java.awt.*;

public class Final {
    public static void main(String[] args) {
        JFrame frame = new JFrame("All Panels Together");

        // ���ҧ���� panel �ҡ���ʷ��س��
        HexagonPanel1 hexagonPanel = new HexagonPanel1();
        StarPanel1 starPanel1 = new StarPanel1();
        StarPanel2 starPanel2 = new StarPanel2();

        hexagonPanel.setPreferredSize(new Dimension(300, 400));
        starPanel1.setPreferredSize(new Dimension(300, 400));
        starPanel2.setPreferredSize(new Dimension(300, 400));

        // ��˹� layout
        frame.setLayout(new BorderLayout());

        // ��� panel ŧ㹵��˹觵�ҧ �
        frame.add(hexagonPanel, BorderLayout.WEST);
        frame.add(starPanel1, BorderLayout.CENTER);
        frame.add(starPanel2, BorderLayout.EAST);

        // ��Ҵ�ͧ frame ��С�õ�駤����� �
        frame.setSize(1200, 400); // ���¤������ҧ��������� 3 panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
