package videogame;
import processing.core.PApplet;

public class VideoGame extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("videogame.VideoGame");
    }
    public void settings()
    {
        size(700, 800);
    }
    public void setup()
    {
        background(255,255,255);
    }
    public void draw()
    {
        backgroundPink(200, 100);
    }
    public void backgroundPink(float xPos, float yPos)
    {
        fill(127,0,255);
        rect(xPos, yPos, 350, 500);
        faceBack(xPos + 38, yPos + 60);
        fill(3, 252, 232);
        rect(250, 375, 20, 50);
        rect(236, 390, 50, 20);

        fill(255, 255, 255);
        ellipse(480, 430, 50, 50);
        ellipse(420, 450, 35, 35);
    }
    public void faceBack(float faceX, float faceY)
    {
        fill(255,255,0);
        rect(faceX, faceY, 280, 175);
        eyes(faceX + 10, faceY + 10);
        mouth(10, 20);
    }
    public void eyes(float eyesX, float eyesY)
    {
        fill(255,255,255);
        ellipse(eyesX + 70, eyesY + 50, 40, 40);
        ellipse(eyesX + 190, eyesY + 50, 40, 40);

        fill(0,0,0);
        ellipse(eyesX+ 70, eyesY + 50, 30, 30);
        ellipse(eyesX + 190, eyesY + 50, 30, 30);
    }
    public void mouth(float mouthX, float mouthY)
    {
        fill(0,0,0);
        //arc(mouthX + 370, mouthY + 250, 100, 70, 0, 3);
        //line(200, 300, 100, 30);
        //line(100, 80, 140, 125);
        //line(400, 300, 350, 300);
        arc(mouthX + 365, mouthY + 250, 100, 50, 0, 3);
    }
}
