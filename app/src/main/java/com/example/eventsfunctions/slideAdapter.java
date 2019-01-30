package com.example.eventsfunctions;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class slideAdapter extends PagerAdapter {

    private Context context;
    LayoutInflater inflater;
    public int[] images = {
            R.drawable.annual1,R.drawable.annual3, R.drawable.annual4,
            R.drawable.child1,R.drawable.child2,R.drawable.child3,
            R.drawable.chris1,R.drawable.chris2,R.drawable.chris3,
            R.drawable.diwali1,R.drawable.diwali2,R.drawable.diwali3,
            R.drawable.earth1,R.drawable.earth2,R.drawable.earth3,
            R.drawable.env1,R.drawable.env2,R.drawable.env3

    };


    public slideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view==(LinearLayout)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.slideshow_layout,container,false);

        ImageView img= (ImageView) view.findViewById(R.id.imageView_id);

        img.setImageResource(images[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);

    }
}
