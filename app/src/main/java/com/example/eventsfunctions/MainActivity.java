package com.example.eventsfunctions;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager,viewPage,vp1,vp2,vp3,vp4;
    slideAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager= (ViewPager) findViewById(R.id.viewPager_id);
        viewPage= (ViewPager) findViewById(R.id.children);
        vp1= (ViewPager) findViewById(R.id.christmas);
        vp2= (ViewPager) findViewById(R.id.diwali);
        vp3= (ViewPager) findViewById(R.id.earth);
        vp4= (ViewPager) findViewById(R.id.environment);

        adapter=new slideAdapter(this);
        viewPager.setAdapter(adapter);
        viewPage.setAdapter(adapter);
        vp1.setAdapter(adapter);
        vp2.setAdapter(adapter);
        vp3.setAdapter(adapter);
        vp4.setAdapter(adapter);
        Timer tm=new Timer();
        tm.scheduleAtFixedRate(new MyTimer(),5000,2000);
    }

    public class MyTimer extends TimerTask{
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem()==0 || viewPage.getCurrentItem()==3 || vp1.getCurrentItem()==6 || vp2.getCurrentItem()==9 || vp3.getCurrentItem()==12 || vp4.getCurrentItem()==15 )
                    {
                        viewPager.setCurrentItem(1);
                        viewPage.setCurrentItem(4);
                        vp1.setCurrentItem(7);
                        vp2.setCurrentItem(10);
                        vp3.setCurrentItem(13);
                        vp4.setCurrentItem(16);
                    }
                    else if (viewPager.getCurrentItem()==1 || viewPager.getCurrentItem()==4 || vp1.getCurrentItem()==7 || vp2.getCurrentItem()==10 || vp3.getCurrentItem()==13 || vp4.getCurrentItem()==16 )
                    {
                        viewPager.setCurrentItem(2);
                        viewPage.setCurrentItem(5);
                        vp1.setCurrentItem(8);
                        vp2.setCurrentItem(11);
                        vp3.setCurrentItem(15);
                        vp4.setCurrentItem(17);

                    }
                    else
                    {
                        viewPager.setCurrentItem(0);
                        viewPage.setCurrentItem(3);
                        vp1.setCurrentItem(6);
                        vp2.setCurrentItem(9);
                        vp3.setCurrentItem(12);
                        vp4.setCurrentItem(15);

                    }
                }
            });
        }
    }



}
