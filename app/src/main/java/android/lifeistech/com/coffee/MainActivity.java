package android.lifeistech.com.coffee;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            //ここで2秒間スリープして、スプラッシュを表示させたままにする
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        //通常時のテーマセット
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> list = load();

        BitmapAdapter adapter = new BitmapAdapter(
                getApplicationContext(), R.layout.list_item, list);

        GridView gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity.this,
                        view,
                        getString(R.string.trans_name));
                Intent intent = new Intent(MainActivity.this, GuatemalaActivity.class);

                startActivity(intent, options.toBundle());

                intent = new Intent().setClass(MainActivity.this, HouseActivity.class);

                startActivity(intent, options.toBundle());

            }
        });


    }

    private ArrayList<Integer> load() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(R.drawable.guatemala);
        list.add(R.drawable.houseblend);
        list.add(R.drawable.kenya);
        list.add(R.drawable.lightnote);
        list.add(R.drawable.threeregion);
        list.add(R.drawable.tribute);
        list.add(R.drawable.pikeplace);
        list.add(R.drawable.ehiopia);
        list.add(R.drawable.kenya);
        list.add(R.drawable.guatemala);
        list.add(R.drawable.tribute);
        list.add(R.drawable.houseblend);

        //Bitmapだと重いので、Glideで緩和
        return list;

    }
    
}


        /*ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");
        list.add("L");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1, list);

        GridView gridView = (GridView)findViewById(R.id.gridView1);
        gridView.setAdapter(adapter);*/



