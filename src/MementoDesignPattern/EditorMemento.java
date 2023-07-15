package MementoDesignPattern;

import ComparableVsComparator.Car;

import java.time.LocalDate;

public class EditorMemento {

    private String text;
    private int cursorX;
    private int cursorY;
    private int fs; // font size
    private int ff;

    private LocalDate moment;

    public String getText() {
        return text;
    }

    public int getCursorX() {
        return cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }

    public int getFontSize() {
        return fs;
    }

    public int getFontFamily() {
        return ff;
    }

    public EditorMemento(String text, int x, int y, int fs,int ff){
        this.text = text;
        this.cursorX =x;
        this.cursorY =y;
        this.fs = fs;
        this.ff = ff;
        this.moment = LocalDate.now();

    }



}
