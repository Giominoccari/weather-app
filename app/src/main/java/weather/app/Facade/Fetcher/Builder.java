package weather.app.Facade.Fetcher;


import java.net.URI;

import weather.app.Facade.Status.Status;

public class Builder {

    Status status = Status.getInstance();

    public URI build(){
        StringBuilder stb = new StringBuilder(status.getApiEndPoint());

        stb.append(status.getLocation());

        if(status.getSDate() != null && !status.getSDate().isEmpty()){
            stb.append("/").append(status.getSDate());
            if(status.getEDate() != null && !status.getEDate().isEmpty()){
                stb.append("/").append(status.getEDate());
            }
        }

        URIBuilder uri = new URIBuilder(stb.toString());

        return null;
    }
}
