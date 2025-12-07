package com.mygame.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class EnergyShard {
    private int x, y;
    private final int SPEED = 1;
    private final int SIZE = 8;
    private int value;
    private boolean visible;

    public EnergyShard(int startX, int startY, int value) {
        this.x = startX - (SIZE / 2); 
        this.y = startY - (SIZE / 2);
        this.value = value;
        this.visible = true;
    }

    public void update() {
        y += SPEED;
        if (y > 600) visible = false; // 簡單檢查邊界
    }

    public void draw(Graphics g) {
        if (visible) {
            g.setColor(Color.ORANGE);
            g.fillOval(x, y, SIZE, SIZE);
        }
    }

    public Rectangle getBounds() { return new Rectangle(x, y, SIZE, SIZE); }
    public boolean isVisible() { return visible; }
    public int getValue() { return value; }
    public void setVisible(boolean visible) { this.visible = visible; }
}
