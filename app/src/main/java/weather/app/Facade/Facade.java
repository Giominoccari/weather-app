package weather.app.Facade;

import weather.app.Facade.Fetcher.Fetcher;

public class Facade {
    public Facade(){
        new Fetcher().fetch();
    }

}
