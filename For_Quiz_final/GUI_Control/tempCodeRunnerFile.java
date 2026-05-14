ed void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);

    // เปลี่ยนจาก drawOval เป็น drawRect
    g.drawRect(cx - R/2, cy - R/2, R, R); // สี่เหลี่ยมบน
    g.drawRect(cx - R, cy, R, R); // สี่เหลี่ยมล่างซ้าย
    g.dr