package android.lifeistech.com.coffee;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by azusagoto on 2017/03/01.
 */

public class BitmapAdapter extends ArrayAdapter<Integer>{

    private int resourceId;

    public BitmapAdapter(Context context, int resource, List<Integer> objects){
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resourceId, null);
        }

        convertView.setMinimumHeight(500);  //ここの値いじれば画像の大きさ変わる
        ImageView view = (ImageView) convertView;
        int resId=getItem(position);
        Glide.with(getContext())
                .load(resId)
                .centerCrop()
                .into(view);

        return view;
    }
}
