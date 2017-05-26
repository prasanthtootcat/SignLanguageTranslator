//developed by Prasanth.P final build of version 1 on 24 nov 2016
//my first apk :-)

package tootcat.signlanguagetranslator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

        ImageView s1;
        ImageView s2;
        ImageView s3;
        ImageView s4;
        ImageView s5;
        ImageView s6;
        ImageView s7;
        ImageView s8;
        ImageView s9;
        ImageView s10;
        ImageView s11;
        ImageView s12;
        ImageView s13;
        ImageView s14;
        ImageView s15;
        ImageView s16;
        ImageView[] imgSlot;
        int[] img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (ImageView) findViewById(R.id.imageView1);
        s2 = (ImageView) findViewById(R.id.imageView2);
        s3 = (ImageView) findViewById(R.id.imageView3);
        s4 = (ImageView) findViewById(R.id.imageView4);
        s5 = (ImageView) findViewById(R.id.imageView5);
        s6 = (ImageView) findViewById(R.id.imageView6);
        s7 = (ImageView) findViewById(R.id.imageView7);
        s8 = (ImageView) findViewById(R.id.imageView8);
        s9 = (ImageView) findViewById(R.id.imageView9);
        s10 = (ImageView) findViewById(R.id.imageView10);
        s11 = (ImageView) findViewById(R.id.imageView11);
        s12 = (ImageView) findViewById(R.id.imageView12);
        s13 = (ImageView) findViewById(R.id.imageView13);
        s14 = (ImageView) findViewById(R.id.imageView14);
        s15 = (ImageView) findViewById(R.id.imageView15);
        s16 = (ImageView) findViewById(R.id.imageView16);
        imgSlot = new ImageView[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16};
        img = new int[]{R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
                R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p,
                R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x,
                R.drawable.y, R.drawable.z,R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n4,R.drawable.n5,R.drawable.n6,
                R.drawable.n7,R.drawable.n8,R.drawable.n9,R.drawable.blank};
        final EditText inputBox=(EditText)findViewById(R.id.inputBox);
        Button translateButton=(Button)findViewById(R.id.translateButton);
        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=inputBox.getText().toString();
                String lstr=str.toLowerCase();
                char[] input=lstr.toCharArray();
                int len=input.length;
                if(len>16)
                    len=16;
                for(int i=0;i<len;i++)
                {
                    switch (input[i])
                    {
                        case 'a': setter('a',i,0);
                            break;
                        case 'b': setter('b',i,1);
                            break;
                        case 'c': setter('c',i,2);
                            break;
                        case 'd': setter('d',i,3);
                            break;
                        case 'e': setter('e',i,4);
                            break;
                        case 'f': setter('f',i,5);
                            break;
                        case 'g': setter('g',i,6);
                            break;
                        case 'h': setter('h',i,7);
                            break;
                        case 'i': setter('i',i,8);
                            break;
                        case 'j': setter('j',i,9);
                            break;
                        case 'k': setter('k',i,10);
                            break;
                        case 'l': setter('l',i,11);
                            break;
                        case 'm': setter('m',i,12);
                            break;
                        case 'n': setter('n',i,13);
                            break;
                        case 'o': setter('o',i,14);
                            break;
                        case 'p': setter('p',i,15);
                            break;
                        case 'q': setter('q',i,16);
                            break;
                        case 'r': setter('r',i,17);
                            break;
                        case 's': setter('s',i,18);
                            break;
                        case 't': setter('t',i,19);
                            break;
                        case 'u': setter('u',i,20);
                            break;
                        case 'v': setter('v',i,21);
                            break;
                        case 'w': setter('w',i,22);
                            break;
                        case 'x': setter('x',i,23);
                            break;
                        case 'y': setter('y',i,24);
                            break;
                        case 'z': setter('z',i,25);
                            break;
                        case '1': setter('1',i,26);
                            break;
                        case '2': setter('2',i,27);
                            break;
                        case '3': setter('3',i,28);
                            break;
                        case '4': setter('4',i,29);
                            break;
                        case '5': setter('5',i,30);
                            break;
                        case '6': setter('6',i,31);
                            break;
                        case '7': setter('7',i,32);
                            break;
                        case '8': setter('8',i,33);
                            break;
                        case '9': setter('9',i,34);
                            break;
                        default: setter('0',i,35);
                    }
                }
            while(len<16)
            {
                imgSlot[len].setVisibility(View.INVISIBLE);
                ++len;
            }
            }
        });
    Button about_us=(Button)findViewById(R.id.about_us);
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent=new Intent(MainActivity.this,About.class);
                startActivity(aboutIntent);
            }
        });


    }
    public void setter(char alpha,int pos,int alphaPos)
    {
        imgSlot[pos].setVisibility(View.VISIBLE);
        imgSlot[pos].setImageResource(img[alphaPos]);
    }
    }
