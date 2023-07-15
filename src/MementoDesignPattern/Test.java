package MementoDesignPattern;

import ComparableVsComparator.Car;

public class Test {

    public static void main(String[] args) {
        /*
        First Create the class  CareTaker
        and after it create a class of editor
        and change the attribute of  editor
        and save it in CareTake via calling of getSnapShot() method.
        when we do undo the last change will be store in stack so we have to call the method of undo of this class
        and pass in restore() method in Editor class

         */


        CareTaker ct = new CareTaker();
        Editor ed = new Editor();
        ed.text = "Hello";
        ed.cursorX = 29;
        ed.cursorY = 332;
        ed.ff=10;
        ed.fs=23;

        // Save this editor
        EditorMemento em1 = ed.getSnapShot();
        ct.save(em1);
        ed.print();

        // change the editor now
        ed.text += " , World";
        EditorMemento em2 = ed.getSnapShot();
        ct.save(em1);
        ed.print();

        // undo the editor
        ed.restore(ct.undo());
        ed.print();
        ed.restore(ct.undo());
        ed.print();

        ed.restore(ct.undo());
        ed.print();
        ed.print();




    }
}
