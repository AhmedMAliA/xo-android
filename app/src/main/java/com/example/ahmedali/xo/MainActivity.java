package com.example.ahmedali.xo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    Button []arr = new Button[9];
    String s = "x";
   public static Boolean bool = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arr[0] = (Button) findViewById(R.id.btn1);

        arr[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[0].setText(s);
                if(s=="o")
                {
                    arr[0].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[0].setTextColor(Color.parseColor("#E92FD5"));
                }

                change();
                arr[0].setClickable(false);
                XorO();
            }

        });

        arr[1] = (Button) findViewById(R.id.btn2);

        arr[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[1].setText(s);
                if(s=="o")
                {
                    arr[1].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[1].setTextColor(Color.parseColor("#E92FD5"));
                }

                change();
                arr[1].setClickable(false);
                XorO();
            }
        });

        arr[2] = (Button) findViewById(R.id.btn3);

        arr[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[2].setText(s);
                if(s=="o")
                {
                    arr[2].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[2].setTextColor(Color.parseColor("#E92FD5"));
                }


                change();
                arr[2].setClickable(false);
                XorO();

            }
        });

        arr[3] = (Button) findViewById(R.id.btn4);

        arr[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[3].setText(s);
                if(s=="o")
                {
                    arr[3].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[3].setTextColor(Color.parseColor("#E92FD5"));
                }

                change();
                arr[3].setClickable(false);
                XorO();

            }
        });

        arr[4] = (Button) findViewById(R.id.btn5);

        arr[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[4].setText(s);
                if(s=="o")
                {
                    arr[4].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[4].setTextColor(Color.parseColor("#E92FD5"));
                }


                change();
                arr[4].setClickable(false);
                XorO();

            }
        });


        arr[5] = (Button) findViewById(R.id.btn6);

        arr[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[5].setText(s);
                if(s=="o")
                {
                    arr[5].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[5].setTextColor(Color.parseColor("#E92FD5"));
                }


                change();
                arr[5].setClickable(false);

                XorO();
            }
        });


        arr[6] = (Button) findViewById(R.id.btn7);

        arr[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[6].setText(s);

                if(s=="o")
                {
                    arr[6].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[6].setTextColor(Color.parseColor("#E92FD5"));
                }


                change();
                arr[6].setClickable(false);
                XorO();

            }
        });


        arr[7] = (Button) findViewById(R.id.btn8);

        arr[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arr[7].setText(s);

                if(s=="o")
                {
                    arr[7].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[7].setTextColor(Color.parseColor("#E92FD5"));
                }


                change();
                arr[7].setClickable(false);
                XorO();

            }
        });

        arr[8] = (Button) findViewById(R.id.btn9);

        arr[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                arr[8].setText(s);
                if(s=="o")
                {
                    arr[8].setTextColor(Color.parseColor("#D98515"));
                }
                else if(s=="x")
                {
                    arr[8].setTextColor(Color.parseColor("#E92FD5"));
                }


                change();

                arr[8].setClickable(false);
                XorO();

            }
        });




        Button rst= (Button) findViewById(R.id.re);
        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0 ; i<9;i++)
                {
                    arr[i].setText("");
                    arr[i].setClickable(true);
                }


            }
        });

        Button ext = (Button) findViewById(R.id.ex);
        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.exit(0);

            }
        });


    }


    public void change()
    {
        if(s == "x")
        {
            s="o";
        }
        else
        {
            s="x";
        }


    }

    public String checkwinner()
    {
        if(arr[0].getText().toString().equals(arr[1].getText().toString()) && arr[1].getText().toString().equals( arr[2].getText().toString()))
        {
            return arr[0].getText().toString();
        }
        if(arr[0].getText().toString().equals(arr[3].getText().toString()) && arr[0].getText().toString().equals(arr[6].getText().toString()))
        {
            return arr[0].getText().toString();
        }
        if(arr[1].getText().toString().equals(arr[4].getText().toString()) && arr[1].getText().toString().equals(arr[7].getText().toString()))
        {
            return arr[7].getText().toString();
        }

        if(arr[2].getText().toString().equals(arr[5].getText().toString()) && arr[5].getText().toString().equals(arr[8].getText().toString()))
        {
            return arr[2].getText().toString();
        }

        if(arr[3].getText().toString().equals(arr[4].getText().toString()) && arr[4].getText().toString().equals(arr[5].getText().toString()))
        {
            return arr[3].getText().toString();
        }

       if(arr[6].getText().toString().equals(arr[7].getText().toString()) && arr[6].getText().toString().equals(arr[8].getText().toString()))
        {
            return arr[8].getText().toString();
        }
       if(arr[0].getText().toString().equals(arr[4].getText().toString()) && arr[4].getText().toString().equals(arr[8].getText().toString()))
        {
            return arr[0].getText().toString();
        }

        if(arr[2].getText().toString().equals(arr[4].getText().toString()) && arr[4].getText().toString().equals(arr[6].getText().toString()))
        {
            return arr[2].getText().toString();
        }

            return "";


    }

    public void XorO()
    {
        String res ;
        res= checkwinner();


        if(res=="x")
        {
            AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
            ab.setMessage(Html.fromHtml("<font color='#E92FD5'> <centre> X is the winner</font>"));

            final MediaPlayer mp ;
            mp=MediaPlayer.create(MainActivity.this,R.raw.winner);
            mp.start();

            ab.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    mp.stop();
                }

            });

            AlertDialog alert=ab.create();
            alert.show();
        }
        else if(res=="o")
        {
            AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
            ab.setMessage(Html.fromHtml("<font color='#D98515'>  <centre> O is the winner </font>") );
            final MediaPlayer mp ;
            mp=MediaPlayer.create(MainActivity.this,R.raw.winner);
            mp.start();
            ab.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    mp.stop();
                }
            });

            AlertDialog alert=ab.create();
            alert.show();
        }


        else
        {
            int i;

            for(i=0 ; i<9 ; i++)
            {
                if(arr[i].getText().toString().isEmpty())
                {
                    bool=false;
                    break;
                }
            }
            if(bool ==true)
            {
                AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
                ab.setMessage(Html.fromHtml("<font color='#22D5FD'>    Tie </font>") );

                final MediaPlayer mp ;
                mp=MediaPlayer.create(MainActivity.this,R.raw.tie);
                mp.start();

                ab.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        mp.stop();
                    }
                });

                AlertDialog alert=ab.create();
                alert.show();
            }
            bool=true;
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
