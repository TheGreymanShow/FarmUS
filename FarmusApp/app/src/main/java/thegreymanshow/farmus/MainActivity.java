package thegreymanshow.farmus;

import android.animation.Animator;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    FragmentTransaction manager;
    TabLayout mtablayout;
    Boolean isOpen=false;
    private FloatingActionButton fab,fab1,fab2;
    Animation fab_open,fab_close,fab_rotateclock,fab_rotateanti;
    ViewPager mviewpager;
    ArrayList<Fragment> fragments= new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int orange = ContextCompat.getColor(this,R.color.text);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitleTextColor(orange);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Farm Us");

        mtablayout = (TabLayout) findViewById(R.id.tablayout);
        mviewpager = (ViewPager) findViewById(R.id.viewpager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this,getSupportFragmentManager(),mtablayout,mviewpager,toolbar);

        adapter.addFragment(new TabB(),"FarmUs");
        adapter.addFragment(new TabA(),"Discover");
        adapter.addFragment(new TabC(),"Bank Loans");
        adapter.addFragment(new TabD(),"Market Analysis");

        mviewpager.setAdapter(adapter);
        mviewpager.setOffscreenPageLimit(2);
        mtablayout.setupWithViewPager(mviewpager);
        adapter.setTabIcons();

        fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab1 = (FloatingActionButton) findViewById(R.id.floatingActionButton1);
        fab2 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        fab_rotateclock = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        fab_rotateanti = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isOpen) {
                    fab1.startAnimation(fab_close);
                    fab2.startAnimation(fab_close);
                    fab.startAnimation(fab_rotateanti);
                    fab1.setClickable(false);
                    fab2.setClickable(false);
                    isOpen = false;

                }
                else{
                    fab1.startAnimation(fab_open);
                    fab2.startAnimation(fab_open);
                    fab.startAnimation(fab_rotateclock);
                    fab1.setClickable(true);
                    fab2.setClickable(true);
                    isOpen = true;
                }

            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Register.class);
                startActivity(intent);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.action_settings1)
        {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.action_settings2)
        {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.action_settings3)
        {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        else if(id == R.id.action_settings4)
        {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick2(View view)
    {

        int id = view.getId();

        if(id == R.id.banks) {
        }
        else if(id == R.id.warehouses) {
        }
        else if(id == R.id.market_place) {
        }
        else if(id == R.id.transportation) {
        }

    }

}

