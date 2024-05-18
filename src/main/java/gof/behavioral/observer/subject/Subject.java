package gof.behavioral.observer.subject;

import gof.behavioral.observer.display.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void nofiyObservers();
}
