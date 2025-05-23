package org.example.demo3.event;

import org.example.demo3.model.player.Player;

public class GameEndedEve extends Event {
    private final Player p1;
    private final Player p2;
    private final Player winner;
    private final int player1Wins;
    private final int player2Wins;
    private final String player1Name;
    private final String player2Name;

    public GameEndedEve(Player p1, Player p2, Player winner, int player1Wins, int player2Wins, String player1Name, String player2Name) {
        this.name = "GameEnded";
        this.p1 = p1;
        this.p2 = p2;
        this.winner = winner;
        this.player1Wins = player1Wins;
        this.player2Wins = player2Wins;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public Player getWinner() {
        return winner;
    }

    public int getPlayer1Wins() {
        return player1Wins;
    }

    public int getPlayer2Wins() {
        return player2Wins;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public Player getP1(){
        return p1;
    }

    public Player getP2(){
        return p2;
    }
}