package jindal5.mayank.popular_movies_14ce10032_gsc;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private String drawablePrefix;
    private Context mContext;
    private ArrayList<String> mThumbUris;

    public ImageAdapter(Context c) {
        mContext = c;
        String packName=mContext.getPackageName();
        drawablePrefix="android.resource://" +packName+ "/";

        ArrayList<String> uriPaths=new ArrayList<>();// place your drawables.

        uriPaths.add(drawablePrefix+ R.drawable.sample_0);
        uriPaths.add(drawablePrefix+ R.drawable.sample_0);
        uriPaths.add(drawablePrefix+ R.drawable.sample_0);
        uriPaths.add(drawablePrefix+ R.drawable.sample_0);
        uriPaths.add(drawablePrefix+ R.drawable.sample_0);
        uriPaths.add(drawablePrefix+ R.drawable.sample_0);


        mThumbUris=uriPaths;
    }

    public int getCount() {
        return mThumbUris.size();
    }

    public Object getItem(int position) {
        return mThumbUris.get(position);
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
           // imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
           // imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
           // imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        Uri imgUri=Uri.parse(mThumbUris.get(position));

        Picasso.with(mContext)
                .load(imgUri)
                //.placeholder(R.drawable.sample_0)
                .centerCrop()
                .resize(400, 400)
                .into(imageView);
       // imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    public ArrayList<String> getUriList(){
        return mThumbUris;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };
}
