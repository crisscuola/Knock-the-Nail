package base;

import frontend.GameWebSocket;


public interface WebSocketService {

    void addUser(GameWebSocket user);

    void notifyMyNewScore(GameUser user);

    void notifyEnemyNewScore(GameUser user);

    void notifyCommonNewScore(GameUser user);

    void notifyStartGame(GameUser user);

    void notifyGameOver(GameUser user, boolean win);
}
