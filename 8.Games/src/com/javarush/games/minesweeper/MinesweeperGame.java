package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private static final Color DEFAULT_COLOR = Color.MEDIUMPURPLE;
    private static final Color FLAG_COLOR = Color.DARKCYAN;
    private static final Color OPENED_COLOR = Color.AQUAMARINE;

    private int countMinesOnField;
    private int countFlags;
    private int countClosedTiles = SIDE * SIDE;
    private int score = 0;
    private boolean isGameStopped;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        }
        openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void createGame() {
        for (int x = 0; x < gameField.length; x++) {
            for (int y = 0; y < gameField.length; y++) {
                boolean isMine = false;
                setCellValue(x, y, "");
                if (getRandomNumber(10) == x) {
                    isMine = true;
                    countMinesOnField++;
                }
                setCellColor(x, y, DEFAULT_COLOR);
                gameField[y][x] = new GameObject(x, y, isMine);
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(DEFAULT_COLOR, "GUME UVUR", FLAG_COLOR, 16);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(DEFAULT_COLOR, "U WEN", FLAG_COLOR, 16);
    }

    private void restart() {
        isGameStopped = false;
        score = 0;
        countClosedTiles = SIDE * SIDE;
        countMinesOnField = 0;
        setScore(score);
        createGame();
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> objectList = new ArrayList<>();
        int x = gameObject.x;
        int y = gameObject.y;
        for (int i = x - 1; i <= x + 1; i++) {
            if (i >= 0 && i < SIDE) {
                for (int k = y - 1; k <= y + 1; k++) {
                    if (k >= 0 && k < SIDE && gameField[k][i] != gameObject) {
                        objectList.add(gameField[k][i]);
                    }
                }
            }
        }
        return objectList;
    }

    private void countMineNeighbors() {
        for (GameObject[] objects : gameField) {
            for (GameObject object : objects) {
                if (!object.isMine) {
                    for (GameObject gameObject : getNeighbors(object)) {
                        if (gameObject.isMine) {
                            object.countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject currentCell = gameField[y][x];
        if (currentCell.isOpen || currentCell.isFlag || isGameStopped) {
            return;
        }
        currentCell.isOpen = true;
        countClosedTiles--;
        setCellColor(x, y, OPENED_COLOR);
        if (currentCell.isMine) {
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else {
            setScore(score += 5);
            if (countClosedTiles == countMinesOnField) {
                win();
            }
            if (currentCell.countMineNeighbors == 0) {
                for (GameObject gameObject : getNeighbors(currentCell)) {
                    if (!gameObject.isOpen) {
                        openTile(gameObject.x, gameObject.y);
                    }
                }
                setCellValue(x, y, "");
            } else {
                setCellNumber(x, y, currentCell.countMineNeighbors);
            }
        }
    }

    private void markTile(int x, int y) {
        if (isGameStopped) {
            return;
        }
        GameObject currentCell = gameField[y][x];
        if (currentCell.isOpen) {
            return;
        }

        if (countFlags == 0 && !currentCell.isFlag) {
            return;
        }

        if (!currentCell.isFlag) {
            currentCell.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, FLAG_COLOR);
        } else {
            currentCell.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, DEFAULT_COLOR);
        }
    }
}
