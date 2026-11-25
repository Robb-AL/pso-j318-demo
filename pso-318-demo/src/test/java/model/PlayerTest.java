package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player(0.0, 0.0, 5, 4, 0);
    }

    @Test
    void initialValuesAreSetCorrectly() {

        assertEquals(0.0, player.getX(), 0.0001);
        assertEquals(0.0, player.getY(), 0.0001);
        assertEquals(5, player.getLives());
        assertEquals(4, player.getHealth());
        assertEquals(0, player.getStarbits());
    }

    @Test
    void moveRightIncreasesX() {
        double deltaX = 1.0;
        double initialX = player.getX();
        player.moveHorizontally(deltaX);

        assertEquals(deltaX, player.getX() - initialX, 0.0001);
    }

    @Test
    void moveLeftDecreasesX() {
        double deltaX = -1.0;
        double initialX = player.getX();
        player.moveHorizontally(deltaX);

        assertEquals(deltaX, player.getX() - initialX, 0.0001);
    }

    @Test
    void stayPutDoesntChangeX() {
        double deltaX = 0.0;
        double initialX = player.getX();
        player.moveHorizontally(deltaX);

        assertEquals(deltaX, player.getX() - initialX, 0.0001);
    }
}