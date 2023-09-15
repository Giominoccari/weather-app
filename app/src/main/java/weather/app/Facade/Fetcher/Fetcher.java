package weather.app.Facade.Fetcher;

public class Fetcher {
    public Fetcher(){
        Builder build = new Builder();
        Submitter sub = new Submitter();
    }

    public void fetch(){
       sub.submitt(build.create());
    }
}
