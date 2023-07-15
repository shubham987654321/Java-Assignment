package MementoDesignPattern;

import java.util.EmptyStackException;
import java.util.Stack;

public class CareTaker {
    private Stack<EditorMemento> his = new Stack<>();

    public void save(EditorMemento em) {
        his.push(em);
    }

    public EditorMemento undo() {
        if (his.size() == 0)
            return null;
        return his.pop();
    }


}
