import java.util.ArrayList;
import java.util.List;

interface Observable{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer{
    void update(Observable observable);
}

class WeatherData implements Observable{
     float temperature;
     float humidity;
     float pressure;
    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }  
}

class MobileWeatherObserver  implements Observer{
    public void update(Observable observable){
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            System.out.println("Temperature: " + weatherData.temperature + " Humidity: " + weatherData.humidity + " Pressure: " + weatherData.pressure);
        }
    }
}

class WeatherStationObserver  implements Observer{
    public void update(Observable observable){
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            System.out.println("Temperature: " + weatherData.temperature + " Humidity: " + weatherData.humidity + " Pressure: " + weatherData.pressure);
        }
    }
}

class Main{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        MobileWeatherObserver mobileWeatherObserver = new MobileWeatherObserver();
        WeatherStationObserver weatherStationObserver = new WeatherStationObserver();
        weatherData.registerObserver(mobileWeatherObserver);
        weatherData.registerObserver(weatherStationObserver);
        weatherData.setData(10, 20, 30);
        // both the observers will be notified
    }
}
// can pass the observable to the observer as well in cosntrucor or on update: to get the latest state.