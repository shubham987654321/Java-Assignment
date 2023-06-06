package ObservorDesignPattern;

import java.util.*;

public abstract class Subject {
    private List<Observor> observors;

    public Subject() {
        observors = new ArrayList<>();
    }

    public void register(Observor o) {
        observors.add(o);
    }

    public void unRegister(Observor o) {
        observors.remove(o);
    }

    public void notifyObservors() {
        for (Observor o : observors) {
            o.update(this);
        }
    }
}
