package model;

public class Player {
    private double x;
    private double y;
    private int lives;
    private int health;
    private int starbits;

    public Player (double start_x, double start_y, int init_lives, int init_health, int init_starbits){
        this.x = start_x;
        this.y = start_y;
        this.lives = init_lives;
        this.health = init_health;
        this.starbits = init_starbits;
    }

    public double get_x (){
        return this.x;
    }

    public double get_y (){
        return this.y;
    }

    public int get_lives (){
        return this.lives;
    }

    public int get_health(){
        return this.health;
    }

    public int get_starbits(){
        return this.starbits;
    }

    public void move_horizontally(double delta_x){
        this.x += delta_x;
    }
}
