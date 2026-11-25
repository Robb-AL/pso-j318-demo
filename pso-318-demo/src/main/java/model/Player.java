package model;

public class Player {
    private double x;
    private double y;
    private int lives;
    private int health;
    private int starbits;

    public Player (double startX, double startY, int initialLives, int initialHealth, int initialStarbits){
        this.x = startX;
        this.y = startY;
        this.lives = initialLives;
        this.health = initialHealth;
        this.starbits = initialStarbits;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public int getLives(){
        return this.lives;
    }

    public int getHealth(){
        return this.health;
    }

    public int getStarbits(){
        return this.starbits;
    }

    public void moveHorizontally(double deltaX){
        this.x += deltaX;
    }
}
