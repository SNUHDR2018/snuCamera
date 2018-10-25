package net.sourceforge.opencamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends Activity {
    ArrayList<byte []> arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent ss = getIntent();
        if (ss.getExtras() != null) {
            arr.add(ss.getByteArrayExtra("B1"));
            Bitmap bitmap1 = BitmapFactory.decodeByteArray(arr.get(0), 0, arr.get(0).length);
            ImageView img1 = findViewById(R.id.img1);
            img1.setImageBitmap(bitmap1);
            //arr.add(ss.getByteArrayExtra("B2"));
            //arr.add(ss.getByteArrayExtra("B3"));
        }
        //arr.add(ss.getByteArrayExtra("1"));
        //arr.add(ss.getByteArrayExtra("2"));
        //arr.add(ss.getByteArrayExtra("3"));
        /*String check = ss.getStringExtra("string");
        if (check == "3") {
            arr.add(ss.getByteArrayExtra("B1"));
            arr.add(ss.getByteArrayExtra("B2"));
            arr.add(ss.getByteArrayExtra("B3"));
        }*/

        //byte[] a = ss.getByteArrayExtra("B1");
        //byte[] b = ss.getByteArrayExtra("B2");
        //byte[] c = ss.getByteArrayExtra("B3");
        //Log.d("Main2Activity", "got intent");
        /*if (ss.hasExtra("B1")) {
            Log.d("Main2Activity", "I got B1");
            byte[] a = ss.getByteArrayExtra("B1");
        }
        if (ss.hasExtra("B2")) {
            Log.d("Main2Activity", "I got B2");
            byte[] b = ss.getByteArrayExtra("B2");
        }
        if (ss.hasExtra("B3")) {
            Log.d("Main2Activity", "I got B3");
            byte[] c = ss.getByteArrayExtra("B3");
        }*/

    }

    public void doHdrImaging(View view) {

    }
}
