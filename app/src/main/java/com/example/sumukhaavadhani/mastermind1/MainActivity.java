package com.example.sumukhaavadhani.mastermind1;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pos_mat = 0;
    int col_mat = 0;
    int go_cnt = 1;
    int flag=0;
    int show_cnt=0;

     boolean cl1 = false;
     boolean cl2=false;
     boolean cl3=false;
     boolean cl4=false;

    Drawable buttonColor, maskColor, setColor;
    Drawable[] x = new Drawable[10];

    int[][] comp2 = new int[10][5];
    int comp = 0;
    int[] rand = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListener();
    }

    public void onClickListener() {

        final Button help=(Button)findViewById(R.id.help);
        final Button yellow = (Button) findViewById(R.id.yellow);
        final Button pink = (Button) findViewById(R.id.pink);
        final Button brown = (Button) findViewById(R.id.brown);
        final Button blue = (Button) findViewById(R.id.blue);
        final Button green = (Button) findViewById(R.id.green);
        final Button red = (Button) findViewById(R.id.red);
        final Button cyan = (Button) findViewById(R.id.cyan);
        final Button majenta = (Button) findViewById(R.id.majenta);

        x[1] = yellow.getBackground();
        x[2] = red.getBackground();
        x[3] = green.getBackground();
        x[4] = blue.getBackground();
        x[5] = brown.getBackground();
        x[6] = pink.getBackground();
        x[7] = cyan.getBackground();
        x[8] = majenta.getBackground();

        final Button b1 = (Button) findViewById(R.id.b1);
        final Button b2 = (Button) findViewById(R.id.b2);
        final Button b3 = (Button) findViewById(R.id.b3);
        final Button b4 = (Button) findViewById(R.id.b4);
        final Button b5 = (Button) findViewById(R.id.b5);
        final Button b6 = (Button) findViewById(R.id.b6);
        final Button b7 = (Button) findViewById(R.id.b7);
        final Button b8 = (Button) findViewById(R.id.b8);
        final Button b9 = (Button) findViewById(R.id.b9);
        final Button b10 = (Button) findViewById(R.id.b10);
        final Button b11 = (Button) findViewById(R.id.b11);
        final Button b12 = (Button) findViewById(R.id.b12);
        final Button b13 = (Button) findViewById(R.id.b13);
        final Button b14 = (Button) findViewById(R.id.b14);
        final Button b15 = (Button) findViewById(R.id.b15);
        final Button b16 = (Button) findViewById(R.id.b16);
        final Button b17 = (Button) findViewById(R.id.b17);
        final Button b18 = (Button) findViewById(R.id.b18);
        final Button b19 = (Button) findViewById(R.id.b19);
        final Button b20 = (Button) findViewById(R.id.b20);
        final Button b21 = (Button) findViewById(R.id.b21);
        final Button b22 = (Button) findViewById(R.id.b22);
        final Button b23 = (Button) findViewById(R.id.b23);
        final Button b24 = (Button) findViewById(R.id.b24);
        final Button b25 = (Button) findViewById(R.id.b25);
        final Button b26 = (Button) findViewById(R.id.b26);
        final Button b27 = (Button) findViewById(R.id.b27);
        final Button b28 = (Button) findViewById(R.id.b28);
        final Button b29 = (Button) findViewById(R.id.b29);
        final Button b30 = (Button) findViewById(R.id.b30);
        final Button b31 = (Button) findViewById(R.id.b31);
        final Button b32 = (Button) findViewById(R.id.b32);
        final Button b33 = (Button) findViewById(R.id.b33);
        final Button b34 = (Button) findViewById(R.id.b34);
        final Button b35 = (Button) findViewById(R.id.b35);
        final Button b36 = (Button) findViewById(R.id.b36);
        final Button b37 = (Button) findViewById(R.id.b37);
        final Button b38 = (Button) findViewById(R.id.b38);
        final Button b39 = (Button) findViewById(R.id.b39);
        final Button b40 = (Button) findViewById(R.id.b40);
        final Button button = (Button) findViewById(R.id.button);
        final Button button2=(Button)findViewById(R.id.button2);
        maskColor = button.getBackground();
        setColor = button2.getBackground();


        final Button start = (Button) findViewById(R.id.start);
        final Button show = (Button) findViewById(R.id.show);
        final Button clear = (Button) findViewById(R.id.clear);
        final Button ac = (Button) findViewById(R.id.ac);
        final Button go = (Button) findViewById(R.id.go);
        final Button btn_exit = (Button) findViewById(R.id.btn_exit);

        final TextView t1 = (TextView) findViewById(R.id.t1);
        final TextView t2 = (TextView) findViewById(R.id.t2);
        final TextView t3 = (TextView) findViewById(R.id.t3);
        final TextView t4 = (TextView) findViewById(R.id.t4);
        final TextView t5 = (TextView) findViewById(R.id.t5);
        final TextView t6 = (TextView) findViewById(R.id.t6);
        final TextView t7 = (TextView) findViewById(R.id.t7);
        final TextView t8 = (TextView) findViewById(R.id.t8);
        final TextView t9 = (TextView) findViewById(R.id.t9);
        final TextView t10 = (TextView) findViewById(R.id.t10);
        final TextView t11 = (TextView) findViewById(R.id.t11);
        final TextView t12 = (TextView) findViewById(R.id.t12);
        final TextView t13 = (TextView) findViewById(R.id.t13);
        final TextView t14 = (TextView) findViewById(R.id.t14);
        final TextView t15 = (TextView) findViewById(R.id.t15);
        final TextView t16 = (TextView) findViewById(R.id.t16);
        final TextView t17 = (TextView) findViewById(R.id.t17);
        final TextView t18 = (TextView) findViewById(R.id.t18);
        final TextView t19 = (TextView) findViewById(R.id.t19);
        final TextView t20 = (TextView) findViewById(R.id.t20);

        show.setEnabled(false);
        go.setEnabled(false);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_cnt=0;
                start.setEnabled(false);
                clear.setEnabled(true);
                ac.setEnabled(true);

                yellow.setEnabled(true);
                red.setEnabled(true);
                blue.setEnabled(true);
                brown.setEnabled(true);
                pink.setEnabled(true);
                green.setEnabled(true);
                cyan.setEnabled(true);
                majenta.setEnabled(true);

                int i = (int) (Math.random() * 8);

                for (int j = 1; j <= 4; j++) {
                    rand[j] = ((i + j * 5) % 7) + 1;

                }

                b1.setBackground(maskColor);
                b2.setBackground(maskColor);
                b3.setBackground(maskColor);
                b4.setBackground(maskColor);


                yellow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = yellow.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow_change);
                        red.setBackgroundResource(R.drawable.red);
                        green.setBackgroundResource(R.drawable.green);
                        blue.setBackgroundResource(R.drawable.blue);
                        brown.setBackgroundResource(R.drawable.brown);
                        pink.setBackgroundResource(R.drawable.pink);
                        cyan.setBackgroundResource(R.drawable.cyan);
                        majenta.setBackgroundResource(R.drawable.majenta);

                        yellow.setEnabled(false);
                        red.setEnabled(true);
                        blue.setEnabled(true);
                        brown.setEnabled(true);
                        pink.setEnabled(true);
                        green.setEnabled(true);
                        cyan.setEnabled(true);
                        majenta.setEnabled(true);

                        comp = 1;
                    }
                });
                red.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = red.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow);
                        red.setBackgroundResource(R.drawable.red_change);
                        green.setBackgroundResource(R.drawable.green);
                        blue.setBackgroundResource(R.drawable.blue);
                        brown.setBackgroundResource(R.drawable.brown);
                        pink.setBackgroundResource(R.drawable.pink);
                        cyan.setBackgroundResource(R.drawable.cyan);
                        majenta.setBackgroundResource(R.drawable.majenta);

                        yellow.setEnabled(true);
                        red.setEnabled(false);
                        blue.setEnabled(true);
                        brown.setEnabled(true);
                        pink.setEnabled(true);
                        green.setEnabled(true);
                        cyan.setEnabled(true);
                        majenta.setEnabled(true);

                        comp = 2;
                    }
                });
                green.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = green.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow);
                        red.setBackgroundResource(R.drawable.red);
                        green.setBackgroundResource(R.drawable.green_change);
                        blue.setBackgroundResource(R.drawable.blue);
                        brown.setBackgroundResource(R.drawable.brown);
                        pink.setBackgroundResource(R.drawable.pink);
                        cyan.setBackgroundResource(R.drawable.cyan);
                        majenta.setBackgroundResource(R.drawable.majenta);

                        yellow.setEnabled(true);
                        red.setEnabled(true);
                        blue.setEnabled(false);
                        brown.setEnabled(true);
                        pink.setEnabled(true);
                        green.setEnabled(true);
                        cyan.setEnabled(true);
                        majenta.setEnabled(true);

                        comp = 3;
                    }
                });
                blue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = blue.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow);
                        red.setBackgroundResource(R.drawable.red);
                        green.setBackgroundResource(R.drawable.green);
                        blue.setBackgroundResource(R.drawable.blue_change);
                        brown.setBackgroundResource(R.drawable.brown);
                        pink.setBackgroundResource(R.drawable.pink);
                        cyan.setBackgroundResource(R.drawable.cyan);
                        majenta.setBackgroundResource(R.drawable.majenta);

                        yellow.setEnabled(true);
                        red.setEnabled(true);
                        blue.setEnabled(false);
                        brown.setEnabled(true);
                        pink.setEnabled(true);
                        green.setEnabled(true);
                        cyan.setEnabled(true);
                        majenta.setEnabled(true);

                        comp = 4;
                    }
                });

                brown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = brown.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow);
                        red.setBackgroundResource(R.drawable.red);
                        green.setBackgroundResource(R.drawable.green);
                        blue.setBackgroundResource(R.drawable.blue);
                        brown.setBackgroundResource(R.drawable.brown_change);
                        pink.setBackgroundResource(R.drawable.pink);
                        cyan.setBackgroundResource(R.drawable.cyan);
                        majenta.setBackgroundResource(R.drawable.majenta);

                        yellow.setEnabled(true);
                        red.setEnabled(true);
                        blue.setEnabled(true);
                        brown.setEnabled(false);
                        pink.setEnabled(true);
                        green.setEnabled(true);
                        cyan.setEnabled(true);
                        majenta.setEnabled(true);

                        comp = 5;
                    }
                });
                pink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = pink.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow);
                        red.setBackgroundResource(R.drawable.red);
                        green.setBackgroundResource(R.drawable.green);
                        blue.setBackgroundResource(R.drawable.blue);
                        brown.setBackgroundResource(R.drawable.brown);
                        pink.setBackgroundResource(R.drawable.pink_change);
                        cyan.setBackgroundResource(R.drawable.cyan);
                        majenta.setBackgroundResource(R.drawable.majenta);

                        yellow.setEnabled(true);
                        red.setEnabled(true);
                        blue.setEnabled(true);
                        brown.setEnabled(true);
                        pink.setEnabled(false);
                        green.setEnabled(true);
                        cyan.setEnabled(true);
                        majenta.setEnabled(true);

                        comp = 6;
                    }
                });
                cyan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = cyan.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow);
                        red.setBackgroundResource(R.drawable.red);
                        green.setBackgroundResource(R.drawable.green);
                        blue.setBackgroundResource(R.drawable.blue);
                        brown.setBackgroundResource(R.drawable.brown);
                        pink.setBackgroundResource(R.drawable.pink);
                        cyan.setBackgroundResource(R.drawable.cyan_change);
                        majenta.setBackgroundResource(R.drawable.majenta);

                        yellow.setEnabled(true);
                        red.setEnabled(true);
                        blue.setEnabled(true);
                        brown.setEnabled(true);
                        pink.setEnabled(true);
                        green.setEnabled(true);
                        cyan.setEnabled(false);
                        majenta.setEnabled(true);

                        comp = 7;

                    }
                });
                majenta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonColor = majenta.getBackground();
                        yellow.setBackgroundResource(R.drawable.yellow);
                        red.setBackgroundResource(R.drawable.red);
                        green.setBackgroundResource(R.drawable.green);
                        blue.setBackgroundResource(R.drawable.blue);
                        brown.setBackgroundResource(R.drawable.brown);
                        pink.setBackgroundResource(R.drawable.pink);
                        cyan.setBackgroundResource(R.drawable.cyan);
                        majenta.setBackgroundResource(R.drawable.majenta_change);

                        yellow.setEnabled(true);
                        red.setEnabled(true);
                        blue.setEnabled(true);
                        brown.setEnabled(true);
                        pink.setEnabled(true);
                        green.setEnabled(true);
                        cyan.setEnabled(true);
                        majenta.setEnabled(false);

                        comp = 8;
                    }
                });
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b10.setEnabled(true);
                    b11.setEnabled(true);
                    b12.setEnabled(true);
                    b13.setEnabled(true);
                    b14.setEnabled(true);
                    b15.setEnabled(true);
                    b16.setEnabled(true);
                    b17.setEnabled(true);
                    b18.setEnabled(true);
                    b19.setEnabled(true);
                    b20.setEnabled(true);
                    b21.setEnabled(true);
                    b22.setEnabled(true);
                    b23.setEnabled(true);
                    b24.setEnabled(true);
                    b25.setEnabled(true);
                    b26.setEnabled(true);
                    b27.setEnabled(true);
                    b28.setEnabled(true);
                    b29.setEnabled(true);
                    b30.setEnabled(true);
                    b31.setEnabled(true);
                    b32.setEnabled(true);
                    b33.setEnabled(true);
                    b34.setEnabled(true);
                    b35.setEnabled(true);
                    b36.setEnabled(true);
                    b37.setEnabled(true);
                    b38.setEnabled(true);
                    b39.setEnabled(true);
                    b40.setEnabled(true);

                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
                t11.setText("");
                t12.setText("");
                t13.setText("");
                t14.setText("");
                t15.setText("");
                t16.setText("");
                t17.setText("");
                t18.setText("");
                t19.setText("");
                t20.setText("");

                b5.setBackground(setColor);
                b6.setBackground(setColor);
                b7.setBackground(setColor);
                b8.setBackground(setColor);
                b9.setBackground(setColor);
                b10.setBackground(setColor);
                b11.setBackground(setColor);
                b12.setBackground(setColor);
                b13.setBackground(setColor);
                b14.setBackground(setColor);
                b15.setBackground(setColor);
                b16.setBackground(setColor);
                b17.setBackground(setColor);
                b18.setBackground(setColor);
                b19.setBackground(setColor);
                b20.setBackground(setColor);
                b21.setBackground(setColor);
                b22.setBackground(setColor);
                b23.setBackground(setColor);
                b24.setBackground(setColor);
                b25.setBackground(setColor);
                b26.setBackground(setColor);
                b27.setBackground(setColor);
                b28.setBackground(setColor);
                b29.setBackground(setColor);
                b30.setBackground(setColor);
                b31.setBackground(setColor);
                b32.setBackground(setColor);
                b33.setBackground(setColor);
                b34.setBackground(setColor);
                b35.setBackground(setColor);
                b36.setBackground(setColor);
                b37.setBackground(setColor);
                b38.setBackground(setColor);
                b39.setBackground(setColor);
                b40.setBackground(setColor);

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b5.setBackground(buttonColor);
                        comp2[1][1] = comp;
                        cl1=true;
                        if(go_cnt==1){
                           // if(cl1 && cl2 && cl3 && cl4)
                                if(comp2[1][1]!=0 && comp2[1][2]!=0 && comp2[1][3]!=0 &&comp2[1][4]!=0)
                                go.setEnabled(true);
                        }


                    }
                });

                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b6.setBackground(buttonColor);
                        comp2[1][2] = comp;
                        cl2=true;
                        if(go_cnt==1){
                            //if(cl1 && cl2 && cl3 && cl4)
                            if(comp2[1][1]!=0 && comp2[1][2]!=0 && comp2[1][3]!=0 &&comp2[1][4]!=0)
                                go.setEnabled(true);
                        }


                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b7.setBackground(buttonColor);
                        comp2[1][3] = comp;
                        cl3=true;
                        if(go_cnt==1){
                           // if(cl1 && cl2 && cl3 && cl4)
                                if(comp2[1][1]!=0 && comp2[1][2]!=0 && comp2[1][3]!=0 &&comp2[1][4]!=0)
                                go.setEnabled(true);
                        }

                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b8.setBackground(buttonColor);
                        comp2[1][4] = comp;
                        cl4=true;
                        if(go_cnt==1){
                           // if(cl1 && cl2 && cl3 && cl4)
                                if(comp2[1][1]!=0 && comp2[1][2]!=0 && comp2[1][3]!=0 &&comp2[1][4]!=0)
                                go.setEnabled(true);
                        }
                    }
                });

                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b9.setBackground(buttonColor);
                        comp2[2][1] = comp;
                    }
                });
                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b10.setBackground(buttonColor);
                        comp2[2][2] = comp;
                    }
                });
                b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b11.setBackground(buttonColor);
                        comp2[2][3] = comp;
                    }
                });
                b12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b12.setBackground(buttonColor);
                        comp2[2][4] = comp;
                    }
                });
                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b13.setBackground(buttonColor);
                        comp2[3][1] = comp;
                    }
                });
                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b14.setBackground(buttonColor);
                        comp2[3][2] = comp;
                    }
                });
                b15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b15.setBackground(buttonColor);
                        comp2[3][3] = comp;
                    }
                });
                b16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b16.setBackground(buttonColor);
                        comp2[3][4] = comp;
                    }
                });
                b17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b17.setBackground(buttonColor);
                        comp2[4][1] = comp;
                    }
                });
                b18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b18.setBackground(buttonColor);
                        comp2[4][2] = comp;
                    }
                });
                b19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b19.setBackground(buttonColor);
                        comp2[4][3] = comp;
                    }
                });
                b20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b20.setBackground(buttonColor);
                        comp2[4][4] = comp;
                    }
                });
                b21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b21.setBackground(buttonColor);
                        comp2[5][1] = comp;
                    }
                });
                b22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b22.setBackground(buttonColor);
                        comp2[5][2] = comp;
                    }
                });
                b23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b23.setBackground(buttonColor);
                        comp2[5][3] = comp;
                    }
                });
                b24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b24.setBackground(buttonColor);
                        comp2[5][4] = comp;
                    }
                });
                b25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b25.setBackground(buttonColor);
                        comp2[6][1] = comp;
                    }
                });
                b26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b26.setBackground(buttonColor);
                        comp2[6][2] = comp;
                    }
                });
                b27.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b27.setBackground(buttonColor);
                        comp2[6][3] = comp;
                    }
                });
                b28.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b28.setBackground(buttonColor);
                        comp2[6][4] = comp;
                    }
                });
                b29.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b29.setBackground(buttonColor);
                        comp2[7][1] = comp;
                    }
                });
                b30.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b30.setBackground(buttonColor);
                        comp2[7][2] = comp;

                    }
                });
                b31.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b31.setBackground(buttonColor);
                        comp2[7][3] = comp;
                    }
                });
                b32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b32.setBackground(buttonColor);
                        comp2[7][4] = comp;
                    }
                });
                b33.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b33.setBackground(buttonColor);
                        comp2[8][1] = comp;
                    }
                });
                b34.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b34.setBackground(buttonColor);
                        comp2[8][2] = comp;
                    }
                });
                b35.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b35.setBackground(buttonColor);
                        comp2[8][3] = comp;
                    }
                });
                b36.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b36.setBackground(buttonColor);
                        comp2[8][4] = comp;
                    }
                });
                b37.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b37.setBackground(buttonColor);
                        comp2[9][1] = comp;
                    }
                });
                b38.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b38.setBackground(buttonColor);
                        comp2[9][2] = comp;
                    }
                });
                b39.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b39.setBackground(buttonColor);
                        comp2[9][3] = comp;
                    }
                });
                b40.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b40.setBackground(buttonColor);
                        comp2[9][4] = comp;
                    }
                });
                show.setEnabled(true);
                show.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //((android.widget.Button)(Button) findViewById(R.id.show)).setText("Show:"+Integer.toString(show_cnt));

                          //  case MotionEvent.ACTION_DOWN:

                                b1.setBackground(x[rand[1]]);
                                b2.setBackground(x[rand[2]]);
                                b3.setBackground(x[rand[3]]);
                                b4.setBackground(x[rand[4]]);
                             // show_cnt++;
                             // PRESSED
                             // return true; // if you want to handle the touch event
                             // case MotionEvent.ACTION_UP:
                             // RELEASED



                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //Do something after 100ms
                                b1.setBackground(maskColor);
                                b2.setBackground(maskColor);
                                b3.setBackground(maskColor);
                                b4.setBackground(maskColor);
                            }
                        }, 500);
                    }
                });
                go.setEnabled(true);
                go.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {


                            for (int y = 1; y <= 4; y++) {
                                for (int z = 1; z <= y - 1; z++) {
                                    if(go_cnt>1) //try equal to to apply it for 1st row
                                    {
                                    if (comp2[go_cnt][y] == comp2[go_cnt][z]) {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                        builder.setMessage("Please fill all 4 boxes with unique colours").setCancelable(false)
                                                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                        dialogInterface.cancel();
                                                    }
                                                });
                                        AlertDialog dialog = builder.create();
                                        dialog.show();
                                        go_cnt--;

                                    }}
                                }
                            }
                            for (int k = 1; k <= 4; k++) {
                                if ((comp2[go_cnt][k] != 1) && (comp2[go_cnt][k] != 2) &&
                                        (comp2[go_cnt][k] != 3) && (comp2[go_cnt][k] != 4) &&
                                        (comp2[go_cnt][k] != 5) && (comp2[go_cnt][k] != 6) &&
                                        (comp2[go_cnt][k] != 7) && (comp2[go_cnt][k] != 8)) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                    builder.setMessage("please fill all 4 boxes with unique colours").setCancelable(false)
                                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {

                                                    dialogInterface.cancel();
                                                }
                                            });
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                    go_cnt--;
                                }
                            }

                            for (int p = 1; p <= 4; p++) {
                                if (comp2[go_cnt][p] == rand[p]) {
                                    pos_mat = pos_mat + 1;
                                }

                            }
                            if (go_cnt == 1)
                                t3.setText(Integer.toString(pos_mat));
                            if (go_cnt == 2)
                                t5.setText(Integer.toString(pos_mat));
                            if (go_cnt == 3)
                                t7.setText(Integer.toString(pos_mat));
                            if (go_cnt == 4)
                                t9.setText(Integer.toString(pos_mat));
                            if (go_cnt == 5)
                                t11.setText(Integer.toString(pos_mat));
                            if (go_cnt == 6)
                                t13.setText(Integer.toString(pos_mat));
                            if (go_cnt == 7)
                                t15.setText(Integer.toString(pos_mat));
                            if (go_cnt == 8)
                                t17.setText(Integer.toString(pos_mat));
                            if (go_cnt == 9)
                                t19.setText(Integer.toString(pos_mat));


                            for (int p = 1; p <= 4; p++) {
                                for (int q = 1; q <= 4; q++) {
                                    if (comp2[go_cnt][p] == rand[q])
                                        col_mat = col_mat + 1;
                                }
                            }
                            col_mat = col_mat - pos_mat;
                            if (go_cnt == 1)
                                t4.setText(Integer.toString(col_mat));
                            b5.setEnabled(false);
                            b6.setEnabled(false);
                            b7.setEnabled(false);
                            b8.setEnabled(false);

                            if (go_cnt == 2) {
                                t6.setText(Integer.toString(col_mat));
                                b9.setEnabled(false);
                                b10.setEnabled(false);
                                b11.setEnabled(false);
                                b12.setEnabled(false);
                            }
                            if (go_cnt == 3) {
                                t8.setText(Integer.toString(col_mat));
                                b13.setEnabled(false);
                                b14.setEnabled(false);
                                b15.setEnabled(false);
                                b16.setEnabled(false);
                            }
                            if (go_cnt == 4) {
                                t10.setText(Integer.toString(col_mat));
                                b17.setEnabled(false);
                                b18.setEnabled(false);
                                b19.setEnabled(false);
                                b20.setEnabled(false);

                            }
                            if (go_cnt == 5) {
                                t12.setText(Integer.toString(col_mat));
                                b21.setEnabled(false);
                                b22.setEnabled(false);
                                b23.setEnabled(false);
                                b24.setEnabled(false);

                            }
                            if (go_cnt == 6) {
                                t14.setText(Integer.toString(col_mat));
                                b25.setEnabled(false);
                                b26.setEnabled(false);
                                b27.setEnabled(false);
                                b28.setEnabled(false);
                            }
                            if (go_cnt == 7) {
                                t16.setText(Integer.toString(col_mat));
                                b29.setEnabled(false);
                                b30.setEnabled(false);
                                b31.setEnabled(false);
                                b32.setEnabled(false);
                            }
                            if (go_cnt == 8) {
                                t18.setText(Integer.toString(col_mat));
                                b33.setEnabled(false);
                                b34.setEnabled(false);
                                b35.setEnabled(false);
                                b36.setEnabled(false);
                            }
                            if (go_cnt == 9) {
                                t20.setText(Integer.toString(col_mat));
                                b37.setEnabled(false);
                                b38.setEnabled(false);
                                b39.setEnabled(false);
                                b40.setEnabled(false);
                            }


                            if (pos_mat == 4)
                            {
                                go.setEnabled(false);
                                clear.setEnabled(false);
                                AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                                a_builder.setMessage("Congragulations. You did IT!!!").setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                dialogInterface.cancel();
                                            }
                                        });
                                AlertDialog alert = a_builder.create();
                                alert.show();

                            }

                            go_cnt++;
                            clear.setEnabled(true);
                            col_mat = 0;
                            pos_mat = 0;
                            if (go_cnt > 9) {
                                AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                                a_builder.setMessage("You Lost It. If you want to play again press AC" +
                                        " and start!!!").setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                dialogInterface.cancel();
                                            }
                                        });
                                AlertDialog alert = a_builder.create();
                                alert.show();
                            }
                    }
                });
            }
        });


        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                a_builder.setMessage("Do You Want To Really Exit!!!").setCancelable(false)
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = a_builder.create();
                alert.show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(go_cnt==0)
                {
                    AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                    a_builder.setMessage("There is Nothing to Clear!!!").setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            });
                    AlertDialog alert = a_builder.create();
                    alert.show();
                }
                else {
                     //remove decrement, to clear the current line also nothing to clear for rest
                    for (int i = 1; i <= 4; i++) {
                        comp2[2][i] = 0;
                    }
                    if (go_cnt == 1) {
                        t3.setText("");
                        t4.setText("");
                        b5.setBackground(setColor);
                        b6.setBackground(setColor);
                        b7.setBackground(setColor);
                        b8.setBackground(setColor);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                    }
                    if (go_cnt == 2) {
                        t5.setText("");
                        t6.setText("");
                        b9.setBackground(setColor);
                        b10.setBackground(setColor);
                        b11.setBackground(setColor);
                        b12.setBackground(setColor);
                        b9.setEnabled(true);
                        b10.setEnabled(true);
                        b11.setEnabled(true);
                        b12.setEnabled(true);
                    }
                    if (go_cnt == 3) {
                        t7.setText("");
                        t8.setText("");
                        b13.setBackground(setColor);
                        b14.setBackground(setColor);
                        b15.setBackground(setColor);
                        b16.setBackground(setColor);
                        b13.setEnabled(true);
                        b14.setEnabled(true);
                        b15.setEnabled(true);
                        b16.setEnabled(true);
                    }
                    if (go_cnt == 4) {
                        t9.setText("");
                        t10.setText("");
                        b17.setBackground(setColor);
                        b18.setBackground(setColor);
                        b19.setBackground(setColor);
                        b20.setBackground(setColor);
                        b17.setEnabled(true);
                        b18.setEnabled(true);
                        b19.setEnabled(true);
                        b20.setEnabled(true);
                    }
                    if (go_cnt == 5) {
                        t11.setText("");
                        t12.setText("");
                        b21.setBackground(setColor);
                        b22.setBackground(setColor);
                        b23.setBackground(setColor);
                        b24.setBackground(setColor);
                        b21.setEnabled(true);
                        b22.setEnabled(true);
                        b23.setEnabled(true);
                        b24.setEnabled(true);
                    }
                    if (go_cnt == 6) {
                        t13.setText("");
                        t14.setText("");
                        b25.setBackground(setColor);
                        b26.setBackground(setColor);
                        b27.setBackground(setColor);
                        b28.setBackground(setColor);
                        b25.setEnabled(true);
                        b26.setEnabled(true);
                        b27.setEnabled(true);
                        b28.setEnabled(true);
                    }
                    if (go_cnt == 7) {
                        t15.setText("");
                        t16.setText("");
                        b29.setBackground(setColor);
                        b30.setBackground(setColor);
                        b31.setBackground(setColor);
                        b32.setBackground(setColor);
                        b29.setEnabled(true);
                        b30.setEnabled(true);
                        b31.setEnabled(true);
                        b32.setEnabled(true);
                    }
                    if (go_cnt == 8) {
                        t17.setText("");
                        t18.setText("");
                        b33.setBackground(setColor);
                        b34.setBackground(setColor);
                        b35.setBackground(setColor);
                        b36.setBackground(setColor);
                        b33.setEnabled(true);
                        b34.setEnabled(true);
                        b35.setEnabled(true);
                        b36.setEnabled(true);
                    }
                    if (go_cnt == 9) {
                        t19.setText("");
                        t20.setText("");
                        b37.setBackground(setColor);
                        b38.setBackground(setColor);
                        b39.setBackground(setColor);
                        b40.setBackground(setColor);
                        b37.setEnabled(true);
                        b38.setEnabled(true);
                        b39.setEnabled(true);
                        b40.setEnabled(true);
                    }
                }

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_cnt=0;
                ((android.widget.Button)(Button) findViewById(R.id.show)).setText("Show");
                ac.setEnabled(false);


                for (int i = 1; i <= go_cnt; i++) {
                    for (int j = 1; j <= 4; j++) {
                        comp2[i][j] = 0;
                    }
                }
                b1.setBackground(setColor);
                b2.setBackground(setColor);
                b3.setBackground(setColor);
                b4.setBackground(setColor);
                b5.setBackground(setColor);
                b6.setBackground(setColor);
                b7.setBackground(setColor);
                b8.setBackground(setColor);
                b9.setBackground(setColor);
                b10.setBackground(setColor);
                b11.setBackground(setColor);
                b12.setBackground(setColor);
                b13.setBackground(setColor);
                b14.setBackground(setColor);
                b15.setBackground(setColor);
                b16.setBackground(setColor);
                b17.setBackground(setColor);
                b18.setBackground(setColor);
                b19.setBackground(setColor);
                b20.setBackground(setColor);
                b21.setBackground(setColor);
                b22.setBackground(setColor);
                b23.setBackground(setColor);
                b24.setBackground(setColor);
                b25.setBackground(setColor);
                b26.setBackground(setColor);
                b27.setBackground(setColor);
                b28.setBackground(setColor);
                b29.setBackground(setColor);
                b30.setBackground(setColor);
                b31.setBackground(setColor);
                b32.setBackground(setColor);
                b33.setBackground(setColor);
                b34.setBackground(setColor);
                b35.setBackground(setColor);
                b36.setBackground(setColor);
                b37.setBackground(setColor);
                b38.setBackground(setColor);
                b39.setBackground(setColor);
                b40.setBackground(setColor);

                yellow.setEnabled(false);
                red.setEnabled(false);
                blue.setEnabled(false);
                brown.setEnabled(false);
                pink.setEnabled(false);
                green.setEnabled(false);
                cyan.setEnabled(false);
                majenta.setEnabled(false);

                yellow.setBackgroundResource(R.drawable.yellow);
                red.setBackgroundResource(R.drawable.red);
                green.setBackgroundResource(R.drawable.green);
                blue.setBackgroundResource(R.drawable.blue);
                brown.setBackgroundResource(R.drawable.brown);
                pink.setBackgroundResource(R.drawable.pink);
                cyan.setBackgroundResource(R.drawable.cyan);
                majenta.setBackgroundResource(R.drawable.majenta);

                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                b10.setEnabled(false);
                b11.setEnabled(false);
                b12.setEnabled(false);
                b13.setEnabled(false);
                b14.setEnabled(false);
                b15.setEnabled(false);
                b16.setEnabled(false);
                b17.setEnabled(false);
                b18.setEnabled(false);
                b19.setEnabled(false);
                b20.setEnabled(false);
                b21.setEnabled(false);
                b22.setEnabled(false);
                b23.setEnabled(false);
                b24.setEnabled(false);
                b25.setEnabled(false);
                b26.setEnabled(false);
                b27.setEnabled(false);
                b28.setEnabled(false);
                b29.setEnabled(false);
                b30.setEnabled(false);
                b31.setEnabled(false);
                b32.setEnabled(false);
                b33.setEnabled(false);
                b34.setEnabled(false);
                b35.setEnabled(false);
                b36.setEnabled(false);
                b37.setEnabled(false);
                b38.setEnabled(false);
                b39.setEnabled(false);
                b40.setEnabled(false);

                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
                t11.setText("");
                t12.setText("");
                t13.setText("");
                t14.setText("");
                t15.setText("");
                t16.setText("");
                t17.setText("");
                t18.setText("");
                t19.setText("");
                t20.setText("");

                for (int i = 1; i <= 4; i++) {
                    rand[i] = 0;
                }
                pos_mat = 0;
                col_mat = 0;
                comp = 0;
                go_cnt = 1;
                start.setEnabled(true);
                show.setEnabled(false);
                go.setEnabled(false);
                cl1=false;
                cl2=false;
                cl3=false;
                cl4=false;
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder a_builder=new AlertDialog.Builder(MainActivity.this);
                a_builder.setMessage("1.Start the game by pressing Start Button\n"+
                                     "2.IT will choose 4 colours randomly out of 8 present above.\n " +
                        "You have to guess those colours with their exact position\n"+
                         "3.you have 9 chances. Fill 4 unique colours in first row and hit Go.\n"+
                         "4.It will show how many colours are correct in column 'C'\n"+
                         "5.vale in 'P' will tell you how many colours are in their position.\n "+
                        "Note:total colors correct are C+P\n"+
                         "6.Based on 'P' and 'C' values make guess in next chances.\n"+
                         "7.You can clear steps by clicking clear\n"+
                         "8.If you want to start a new game, press Ac(All clear) and press start.\n"+
                        "Note: IF you press AC current game will no longer be continued.\n"+
                         "9.If you cannot guess the right colours you can see them by clicking Show button.\n").setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = a_builder.create();
                alert.show();
            }
        });
    }
}