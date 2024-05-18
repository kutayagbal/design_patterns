package gof.behavioral.observer.weather;

import gof.behavioral.observer.display.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void nofiyObservers();
}
