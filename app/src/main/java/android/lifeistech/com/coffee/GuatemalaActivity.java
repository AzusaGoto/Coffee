package android.lifeistech.com.coffee;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GuatemalaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guatemala);

        ImageView imageView;

        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);

        TextView textView8 = (TextView)findViewById(R.id.textView8);
        textView8.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public class Explanation{
        String name;
        String name2;

        public void setName(String name){
            this.name = name;
        }

        public void setName2(String name2){
            this.name2 = name2;
        }
    }
}
