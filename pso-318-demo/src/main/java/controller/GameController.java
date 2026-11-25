package controller;

import model.Player;
import view.GameView;

public class GameController {
    private final Player player;
    private final GameView view;

    public GameController(Player player, GameView view) {
        this.player = player;
        this.view = view;
    }

    public void onMoveLeft(double step) {
        player.moveHorizontally(-Math.abs(step));
        syncView();
    }

    public void onMoveRight(double step) {
        player.moveHorizontally(Math.abs(step));
        syncView();
    }

    public void syncView() {
        view.renderStatus(player.getX(), player.getLives(), player.getHealth(), player.getStarbits());
    }
}
