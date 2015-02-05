package com.nifty.momaui;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.LinearLayout;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Collections.shuffle;


public class BlocksActivity extends ActionBarActivity {

    private List<LinearLayout> boxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocks);
        boxes = fetchBoxes();
        for (LinearLayout box : boxes) {
            box.setBackgroundColor(randomColor());
        }
    }

    private List<LinearLayout> fetchBoxes() {
        final LinearLayout box1 = (LinearLayout) findViewById(R.id.box1);
        final LinearLayout box2 = (LinearLayout) findViewById(R.id.box2);
        final LinearLayout box3 = (LinearLayout) findViewById(R.id.box3);
        final LinearLayout box4 = (LinearLayout) findViewById(R.id.box4);
        final LinearLayout box5 = (LinearLayout) findViewById(R.id.box5);
        final LinearLayout box6 = (LinearLayout) findViewById(R.id.box6);
        return Arrays.asList(box1, box2, box3, box4, box5, box6);
    }

    private int randomColor() {
        Random randomizer = new Random();
        List<Integer> colors = Arrays.asList(
                Color.BLACK, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY, Color.GREEN,
                Color.LTGRAY, Color.MAGENTA, Color.RED, Color.WHITE, Color.YELLOW
        );
        return colors.get(randomizer.nextInt(colors.size()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_blocks, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
