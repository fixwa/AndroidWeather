package pablo.weather;

/**
 * Created by pablo on 10/08/2017.
 */

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }


    String getCity() {
        return prefs.getString("city", "Cordoba, AR");
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }

}