package bin.main.java.gof.behavioral.observer.subject;

import bin.main.java.gof.behavioral.observer.display.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void nofiyObservers();
}
