package com.android.codecode.code;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {

    Button clear;
    TextView resistancevalue;
    TextView Black, Brown, Red, Orange, Yellow, Green, Blue, Violet, Grey, White, input_2, input_3, input_1;
    String temp = "";
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clear_all);
        resistancevalue = findViewById(R.id.outputResistance);
        Black = findViewById(R.id.Black);
        Brown = findViewById(R.id.Brown);
        Red = findViewById(R.id.Red);
        Orange = findViewById(R.id.Orange);
        Yellow = findViewById(R.id.Yellow);
        Green = findViewById(R.id.Green);
        Blue = findViewById(R.id.Blue);
        Violet = findViewById(R.id.Violet);
        Grey = findViewById(R.id.Grey);
        White = findViewById(R.id.White);
        input_2 = findViewById(R.id.input_2);
        input_3 = findViewById(R.id.input_3);
        input_1 = findViewById(R.id.input_1);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_1.setBackgroundColor(Color.parseColor("#efefef"));
                input_2.setBackgroundColor(Color.parseColor("#efefef"));
                input_3.setBackgroundColor(Color.parseColor("#efefef"));
                resistancevalue.setText("Resistance Value");
                temp = "";

            }
        });


        Black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "0";
                    input_1.setBackgroundColor(Color.parseColor("#000000"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "0";
                    input_2.setBackgroundColor(Color.parseColor("#000000"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp);
                    resistancevalue.setText(String.valueOf(result) + " ohm");
                    input_3.setBackgroundColor(Color.parseColor("#000000"));
                }
                Log.e("TAG", "onClick: Black");

            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "6";
                    input_1.setBackgroundColor(Color.parseColor("#0000ff"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "6"; // 06
                    input_2.setBackgroundColor(Color.parseColor("#0000ff"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp);
                    resistancevalue.setText(String.valueOf(result) + " M ohm");
                    input_3.setBackgroundColor(Color.parseColor("#0000ff"));
                }

            }
        });
        Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "4";
                    input_1.setBackgroundColor(Color.parseColor("#ffff00"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "4";
                    input_2.setBackgroundColor(Color.parseColor("#ffff00"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp) * 10;
                    resistancevalue.setText(String.valueOf(result) + " K ohm");
                    input_3.setBackgroundColor(Color.parseColor("#ffff00"));
                }
            }
        });

        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "5";
                    input_1.setBackgroundColor(Color.parseColor("#00ff00"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "5";
                    input_2.setBackgroundColor(Color.parseColor("#00ff00"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp) * 100;
                    resistancevalue.setText(String.valueOf(result) + " K ohm");
                    input_3.setBackgroundColor(Color.parseColor("#00ff00"));
                }
            }
        });

        White.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "9";
                    input_1.setBackgroundColor(Color.parseColor("#ffffff"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "9";
                    input_2.setBackgroundColor(Color.parseColor("#ffffff"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp) * 1000;
                    resistancevalue.setText(String.valueOf(result) + " M ohm");
                    input_3.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "7";
                    input_1.setBackgroundColor(Color.parseColor("#9c00ff"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "7";
                    input_2.setBackgroundColor(Color.parseColor("#9c00ff"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp) * 10;
                    resistancevalue.setText(String.valueOf(result) + " M ohm");
                    input_3.setBackgroundColor(Color.parseColor("#9c00ff"));
                }
            }
        });

        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "2";
                    input_1.setBackgroundColor(Color.parseColor("#ff0000"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "2";
                    input_2.setBackgroundColor(Color.parseColor("#ff0000"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp) * 100;
                    resistancevalue.setText(String.valueOf(result) + " ohm");
                    input_3.setBackgroundColor(Color.parseColor("#ff0000"));
                }
            }
        });

        Orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "3";
                    input_1.setBackgroundColor(Color.parseColor("#ff6300"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "3";
                    input_2.setBackgroundColor(Color.parseColor("#ff6300"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp);
                    resistancevalue.setText(String.valueOf(result) + " K ohm");
                    input_3.setBackgroundColor(Color.parseColor("#ff6300"));
                }
            }
        });

        Brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "1";
                    input_1.setBackgroundColor(Color.parseColor("#633100"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "1";
                    input_2.setBackgroundColor(Color.parseColor("#633100"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp) * 10;
                    resistancevalue.setText(String.valueOf(result) + " ohm");
                    input_3.setBackgroundColor(Color.parseColor("#633100"));
                }
            }
        });

        Grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable) input_1.getBackground()).getColor();
                int color1 = ((ColorDrawable) input_2.getBackground()).getColor();
                int color2 = ((ColorDrawable) input_3.getBackground()).getColor();

                if (color == Color.parseColor("#efefef")) {
                    temp = temp + "8";
                    input_1.setBackgroundColor(Color.parseColor("#cecece"));
                } else if (color1 == Color.parseColor("#efefef")) {
                    temp = temp + "8";
                    input_2.setBackgroundColor(Color.parseColor("#cecece"));
                } else if (color2 == Color.parseColor("#efefef")) {
                    result = Integer.parseInt(temp) * 100;
                    resistancevalue.setText(String.valueOf(result) + " M ohm");
                    input_3.setBackgroundColor(Color.parseColor("#cecece"));
                }
            }
        });



    }




}