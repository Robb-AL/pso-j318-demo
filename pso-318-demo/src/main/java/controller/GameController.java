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
        player.move_horizontally(-Math.abs(step));
        syncView();
    }

    public void onMoveRight(double step) {
        player.move_horizontally(Math.abs(step));
        syncView();
    }

    public void syncView() {
        view.renderStatus(player.get_x(), player.get_lives(), player.get_health(), player.get_starbits());
    }
}
