package MementoDesignPattern;

public class Editor {
    String text;
    int cursorX;
    int cursorY;
    int fs; // font size
    int ff;

    void write() {
    }

    ;

    void delete() {
    }

    ;

    void restore(EditorMemento em) {
        if (em != null) {
            this.text = em.getText();
            this.cursorX = em.getCursorX();
            this.cursorY = em.getCursorY();
            this.ff = em.getFontFamily();
            this.fs = em.getFontSize();
        }


    }

    public EditorMemento getSnapShot() {
        return new EditorMemento(text, cursorX, cursorY, fs, ff);
    }

    public void print() {
        System.out.println(text + " =" + cursorX + " : " + cursorY + " " + fs + " : " + ff);
    }
}
