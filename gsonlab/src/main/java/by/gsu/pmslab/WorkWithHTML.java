package by.gsu.pmslab;

import com.google.gson.Gson;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorkWithHTML {

    public static void workWithHTML() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(Runner.PATH));
        Gson gson = new Gson();
        MainWeather mainWeather = gson.fromJson(bufferedReader, MainWeather.class);

        String htmlFile = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Weather</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"widget-right weather-right--type1 widget-right--brown\">\n" +
                "    <div class=\"widget-right__header widget-right__header--brown\">\n" +
                "        <div class=\"widget-right__layout\">\n" +
                "            <div>\n" +
                "                <h2 class=\"widget-right__title\">"+mainWeather.getName()+"</h2>\n" +
                "                    <h4 class=\"widget-right__title\">"+mainWeather.getMainMini()+"</h4>\n" +
                "                <p class=\"widget-right__description\">"+"</p>\n" +
                "            </div>\n" +
                "        <img width=\"60\" height=\"60\" class=\"weather-right__icon weather-right__icon--type\" alt=\"Weather in "+mainWeather.getName()+"\" src=\"http://openweathermap.org/img/w/"+mainWeather.getIconS()+".png\">\n" +
                "    </div>\n" +
                "    <div class=\"weather-right weather-right--brown\">\n" +
                "        <div class=\"weather-right__layout\">\n" +
                "            <div class=\"weather-right__temperature\">"+mainWeather.getMain().getTemp()+"<span>°C</span></div>\n" +
                "            <div class=\"weather-right__weather\">\n" +
                "                <div class=\"weather-right-card\">\n" +
                "                    <table class=\"weather-right__table\">\n" +
                "                        <tbody><tr class=\"weather-right__items\">\n" +
                "                            <th class=\"weather-right__item\" colspan=\"2\">Details</th>\n" +
                "                        </tr>\n" +
                "                        <tr class=\"weather-right__items\">\n" +
                "                            <td class=\"weather-right__item\">Min temperature</td>\n" +
                "                            <td class=\"weather-right__item weather-right__feels\">"+mainWeather.getMain().getTemp_min()+"<span>°C</span></td>\n" +
                "                        </tr>\n" +
                "                        <tr class=\"weather-right__items\">\n" +
                "                            <td class=\"weather-right__item\">Max temperature</td>\n" +
                "                            <td class=\"weather-right__item weather-right__feels\">"+mainWeather.getMain().getTemp_max()+"<span>°C</span></td>\n" +
                "                        </tr>\n" +
                "                        <tr class=\"weather-right__items\">\n" +
                "                            <td class=\"weather-right__item\">Wind</td>\n" +
                "                            <td class=\"weather-right__item weather-right__wind-speed\">"+mainWeather.getWind().getSpeed()+" m/s </td>\n" +
                "                        </tr>\n" +
                "                        <tr class=\"weather-right-card__items\">\n" +
                "                            <td class=\"weather-right__item\">Humidity</td>\n" +
                "                            <td class=\"weather-right__item weather-right__humidity\">"+mainWeather.getMain().getHumidity()+"%</td>\n" +
                "                        </tr>\n" +
                "                        <tr class=\"weather-right-card__items\">\n" +
                "                            <td class=\"weather-right__item\">Description</td>\n" +
                "                            <td class=\"weather-right__item\">"+mainWeather.getDescription()+"</td>\n" +
                "                        </tr>\n" +
                "                        <tr class=\"weather-right-card__items\">\n" +
                "                            <td class=\"weather-right__item\">Pressure</td>\n" +
                "                            <td class=\"weather-right__item weather-right__pressure\">"+mainWeather.getMain().getPressure()+" hPa</td>\n" +
                "                        </tr>\n" +
                "                        </tbody></table>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"widget-right__footer widget-right__footer--brown\">\n" +
                "        <div class=\"widget-right__layout\"><a class=\"widget-right__link\" href=\"//openweathermap.org/\" target=\"_blank\">OpenWeatherMap</a>\n" +
                "            <div class=\"widget-right__date\">"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm dd-MM-yyyy")) +"</div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
        FileOutputStream fileOutputStream=new FileOutputStream("src/main/resources/index.html");
        fileOutputStream.write(htmlFile.getBytes());
        fileOutputStream.close();
    }
}
