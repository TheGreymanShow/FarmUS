package thegreymanshow.farmus;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Parth on 1/29/2017.
 */

public class IntroManager {


        SharedPreferences pref;
        SharedPreferences.Editor editor;
        Context context;

        public IntroManager(Context context) {
            this.context = context;
            pref = context.getSharedPreferences("first",0);
            editor =pref.edit();
        }

        public void setFirst(Boolean isFirst){
            editor.putBoolean("check",isFirst);
            editor.commit();
        }

        public boolean check(){
            return pref.getBoolean("check",true);
        }

}

