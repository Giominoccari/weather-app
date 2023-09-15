package weather.app.Facade.Status;

public class Status {

    private static Status instance = null;

    String apiEndPoint;
    String location;
    String startDate; //optional (omit for forecast)
    String endDate; //optional (requires a startDate if present)
    String unitGroup; //us,metric,uk 
    String apiKey;
 
    private Status(){
    apiEndPoint="https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";
    location="London, UK";
    startDate=null; //optional (omit for forecast)
    endDate=null; //optional (requires a startDate if present)
    unitGroup="metric"; //us,metric,uk 
    apiKey="YOUR_API_KEY";
    }

    public static Status getInstance() {
        // Crea l'oggetto solo se NON esiste:
        if (instance == null) {
            instance = new Status();
        }
        return instance;
    }

    public void setApiEndPoint(){}

    public String getApiEndPoint(){
        return this.apiEndPoint;
    }

    public void setLocation(){}

    public String getLocation(){
        return this.location;
    }

    public void setSDate(){}

    public String getSDate(){
        return this.startDate;
    }

    public void setEDate(){}

    public String getEDate(){
        return this.endDate;
    }

    public void setUnitGroup(){}

    public void getUnitGroup(){}

    public void setApiKey(){}

    public void getApiKey(){}
}
