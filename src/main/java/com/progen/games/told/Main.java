package com.progen.games.told;

import com.programm.project.easy2d.engine.api.IPencil;
import com.programm.project.easy2d.engine.simple.SimpleEngine;

import java.awt.*;

public class Main extends SimpleEngine {

    public static void main(String[] args) {
        new Main("Tower Of Lost Dreams [v0.1.0]", 600, 500, 30).start();
    }

    private float x, y;

    public Main(String title, int width, int height, float fps) {
        super(title, width, height, fps);
    }

    @Override
    protected void init() {
        x = 100;
        y = 100;
    }

    @Override
    public void update() {
        x += 0.1f;
        y += 0.1f;
    }

    @Override
    public void render(IPencil p) {
        p.setColor(Color.WHITE);
        p.fillScreen();

        p.setColor(Color.RED);
        p.drawRectangle(x, y, 30, 30);

        p.setColor(Color.GREEN);
        p.drawCircle(x + 15, y + 15, 15);
    }
}
