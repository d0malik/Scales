package me.ddomalik.scales;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int pos;
    int blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.scales_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        final Button _00 = (Button) findViewById(R.id.b00);
        _00.setOnClickListener(this);
        _00.setBackgroundColor(Color.TRANSPARENT);
        final Button _10 = (Button) findViewById(R.id.b10);
        _10.setOnClickListener(this);
        _10.setBackgroundColor(Color.TRANSPARENT);
        final Button _20 = (Button) findViewById(R.id.b20);
        _20.setOnClickListener(this);
        _20.setBackgroundColor(Color.TRANSPARENT);
        final Button _30 = (Button) findViewById(R.id.b30);
        _30.setOnClickListener(this);
        _30.setBackgroundColor(Color.TRANSPARENT);
        final Button _40 = (Button) findViewById(R.id.b40);
        _40.setOnClickListener(this);
        _40.setBackgroundColor(Color.TRANSPARENT);
        final Button _01 = (Button) findViewById(R.id.b01);
        _01.setOnClickListener(this);
        _01.setBackgroundColor(Color.TRANSPARENT);
        final Button _11 = (Button) findViewById(R.id.b11);
        _11.setOnClickListener(this);
        _11.setBackgroundColor(Color.TRANSPARENT);
        final Button _21 = (Button) findViewById(R.id.b21);
        _21.setOnClickListener(this);
        _21.setBackgroundColor(Color.TRANSPARENT);
        final Button _31 = (Button) findViewById(R.id.b31);
        _31.setOnClickListener(this);
        _31.setBackgroundColor(Color.TRANSPARENT);
        final Button _41 = (Button) findViewById(R.id.b41);
        _41.setOnClickListener(this);
        _41.setBackgroundColor(Color.TRANSPARENT);
        final Button _02 = (Button) findViewById(R.id.b02);
        _02.setOnClickListener(this);
        _02.setBackgroundColor(Color.TRANSPARENT);
        final Button _12 = (Button) findViewById(R.id.b12);
        _12.setOnClickListener(this);
        _12.setBackgroundColor(Color.TRANSPARENT);
        final Button _22 = (Button) findViewById(R.id.b22);
        _22.setOnClickListener(this);
        _22.setBackgroundColor(Color.TRANSPARENT);
        final Button _32 = (Button) findViewById(R.id.b32);
        _32.setOnClickListener(this);
        _32.setBackgroundColor(Color.TRANSPARENT);
        final Button _42 = (Button) findViewById(R.id.b42);
        _42.setOnClickListener(this);
        _42.setBackgroundColor(Color.TRANSPARENT);
        final Button _03 = (Button) findViewById(R.id.b03);
        _03.setOnClickListener(this);
        _03.setBackgroundColor(Color.TRANSPARENT);
        final Button _13 = (Button) findViewById(R.id.b13);
        _13.setOnClickListener(this);
        _13.setBackgroundColor(Color.TRANSPARENT);
        final Button _23 = (Button) findViewById(R.id.b23);
        _23.setOnClickListener(this);
        _23.setBackgroundColor(Color.TRANSPARENT);
        final Button _33 = (Button) findViewById(R.id.b33);
        _33.setOnClickListener(this);
        _33.setBackgroundColor(Color.TRANSPARENT);
        final Button _43 = (Button) findViewById(R.id.b43);
        _43.setOnClickListener(this);
        _43.setBackgroundColor(Color.TRANSPARENT);
        final Button _04 = (Button) findViewById(R.id.b04);
        _04.setOnClickListener(this);
        _04.setBackgroundColor(Color.TRANSPARENT);
        final Button _14 = (Button) findViewById(R.id.b14);
        _14.setOnClickListener(this);
        _14.setBackgroundColor(Color.TRANSPARENT);
        final Button _24 = (Button) findViewById(R.id.b24);
        _24.setOnClickListener(this);
        _24.setBackgroundColor(Color.TRANSPARENT);
        final Button _34 = (Button) findViewById(R.id.b34);
        _34.setOnClickListener(this);
        _34.setBackgroundColor(Color.TRANSPARENT);
        final Button _44 = (Button) findViewById(R.id.b44);
        _44.setOnClickListener(this);
        _44.setBackgroundColor(Color.TRANSPARENT);
        final Button _05 = (Button) findViewById(R.id.b05);
        _05.setOnClickListener(this);
        _05.setBackgroundColor(Color.TRANSPARENT);
        final Button _15 = (Button) findViewById(R.id.b15);
        _15.setOnClickListener(this);
        _15.setBackgroundColor(Color.TRANSPARENT);
        final Button _25 = (Button) findViewById(R.id.b25);
        _25.setOnClickListener(this);
        _25.setBackgroundColor(Color.TRANSPARENT);
        final Button _35 = (Button) findViewById(R.id.b35);
        _35.setOnClickListener(this);
        _35.setBackgroundColor(Color.TRANSPARENT);
        final Button _45 = (Button) findViewById(R.id.b45);
        _45.setOnClickListener(this);
        _45.setBackgroundColor(Color.TRANSPARENT);

        final Button clearBtn = (Button) findViewById(R.id.clearBtn);

        final CheckBox bbBox = (CheckBox) findViewById(R.id.bbBox);
        bbBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) { blue = 1; }else{ blue = 0; }

                if (blue == 1) {
                    if (pos == 1) {
                        _11.setBackgroundColor(Color.BLUE);
                        _33.setBackgroundColor(Color.BLUE);
                    }else if (pos == 2) {
                        _13.setBackgroundColor(Color.BLUE);
                        _40.setBackgroundColor(Color.BLUE);
                        _45.setBackgroundColor(Color.BLUE);
                    }else if (pos == 3) {
                        _20.setBackgroundColor(Color.BLUE);
                        _42.setBackgroundColor(Color.BLUE);
                        _25.setBackgroundColor(Color.BLUE);
                    }else if (pos == 4) {
                        _12.setBackgroundColor(Color.BLUE);
                        _44.setBackgroundColor(Color.BLUE);
                    }else if (pos == 5) {
                        _24.setBackgroundColor(Color.BLUE);
                        _41.setBackgroundColor(Color.BLUE);
                    }
                }else{
                    if (pos == 1) {
                        _11.setBackgroundColor(Color.TRANSPARENT);
                        _33.setBackgroundColor(Color.TRANSPARENT);
                    }else if (pos == 2) {
                        _13.setBackgroundColor(Color.TRANSPARENT);
                        _40.setBackgroundColor(Color.TRANSPARENT);
                        _45.setBackgroundColor(Color.TRANSPARENT);
                    }else if (pos == 3) {
                        _20.setBackgroundColor(Color.TRANSPARENT);
                        _42.setBackgroundColor(Color.TRANSPARENT);
                        _25.setBackgroundColor(Color.TRANSPARENT);
                    }else if (pos == 4) {
                        _12.setBackgroundColor(Color.TRANSPARENT);
                        _44.setBackgroundColor(Color.TRANSPARENT);
                    }else if (pos == 5) {
                        _24.setBackgroundColor(Color.TRANSPARENT);
                        _41.setBackgroundColor(Color.TRANSPARENT);
                    }
                }

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                pos = position;
                clear(null);
                disableButtons(null);
                clearBtn.setEnabled(false);

                if (pos > 0 && pos <= 5) { bbBox.setEnabled(true); }
                if (pos == 0 || (pos > 5 && pos <= 10)) {
                    if (blue == 1) { bbBox.toggle(); }
                    bbBox.setEnabled(false);
                }

                if (selectedItem.equals("Custom Shape")) {
                    enableButtons(null);
                    clearBtn.setEnabled(true);
                }else if (selectedItem.equals("Shape 1 - Minor")) {
                    _00.setBackgroundColor(Color.RED);
                    _30.setBackgroundColor(Color.BLACK);

                    _01.setBackgroundColor(Color.BLACK);
                    _21.setBackgroundColor(Color.BLACK);

                    _02.setBackgroundColor(Color.BLACK);
                    _22.setBackgroundColor(Color.RED);

                    _03.setBackgroundColor(Color.BLACK);
                    _23.setBackgroundColor(Color.BLACK);

                    _04.setBackgroundColor(Color.BLACK);
                    _34.setBackgroundColor(Color.BLACK);

                    _05.setBackgroundColor(Color.RED);
                    _35.setBackgroundColor(Color.BLACK);

                    if (blue == 1) {
                        _11.setBackgroundColor(Color.BLUE);
                        _33.setBackgroundColor(Color.BLUE);
                    }
                }else if (selectedItem.equals("Shape 2 - Minor")) {
                    _10.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.BLACK);

                    _01.setBackgroundColor(Color.BLACK);
                    _31.setBackgroundColor(Color.BLACK);

                    _02.setBackgroundColor(Color.RED);
                    _32.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.BLACK);
                    _23.setBackgroundColor(Color.BLACK);

                    _14.setBackgroundColor(Color.BLACK);
                    _34.setBackgroundColor(Color.RED);

                    _15.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.BLACK);

                    if (blue == 1) {
                        _13.setBackgroundColor(Color.BLUE);
                        _40.setBackgroundColor(Color.BLUE);
                        _45.setBackgroundColor(Color.BLUE);
                    }
                }else if (selectedItem.equals("Shape 3 - Minor")) {
                    _10.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.BLACK);

                    _11.setBackgroundColor(Color.BLACK);
                    _31.setBackgroundColor(Color.RED);

                    _12.setBackgroundColor(Color.BLACK);
                    _32.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.BLACK);
                    _33.setBackgroundColor(Color.BLACK);

                    _14.setBackgroundColor(Color.RED);
                    _44.setBackgroundColor(Color.BLACK);

                    _15.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.BLACK);

                    if (blue == 1) {
                        _20.setBackgroundColor(Color.BLUE);
                        _42.setBackgroundColor(Color.BLUE);
                        _25.setBackgroundColor(Color.BLUE);
                    }
                }else if (selectedItem.equals("Shape 4 - Minor")) {
                    _00.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.BLACK);

                    _01.setBackgroundColor(Color.RED);
                    _31.setBackgroundColor(Color.BLACK);

                    _02.setBackgroundColor(Color.BLACK);
                    _22.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.BLACK);
                    _23.setBackgroundColor(Color.RED);

                    _14.setBackgroundColor(Color.BLACK);
                    _34.setBackgroundColor(Color.BLACK);

                    _05.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.BLACK);

                    if (blue == 1) {
                        _12.setBackgroundColor(Color.BLUE);
                        _44.setBackgroundColor(Color.BLUE);
                    }
                }else if (selectedItem.equals("Shape 5 - Minor")) {
                    _10.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.RED);

                    _11.setBackgroundColor(Color.BLACK);
                    _31.setBackgroundColor(Color.BLACK);

                    _02.setBackgroundColor(Color.BLACK);
                    _32.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.RED);
                    _33.setBackgroundColor(Color.BLACK);

                    _14.setBackgroundColor(Color.BLACK);
                    _34.setBackgroundColor(Color.BLACK);

                    _15.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.RED);

                    if (blue == 1) {
                        _24.setBackgroundColor(Color.BLUE);
                        _41.setBackgroundColor(Color.BLUE);
                    }
                }else if (selectedItem.equals("Shape 1 - Major")) {
                    _10.setBackgroundColor(Color.RED);
                    _30.setBackgroundColor(Color.BLACK);

                    _01.setBackgroundColor(Color.BLACK);
                    _31.setBackgroundColor(Color.BLACK);

                    _02.setBackgroundColor(Color.BLACK);
                    _32.setBackgroundColor(Color.RED);

                    _03.setBackgroundColor(Color.BLACK);
                    _23.setBackgroundColor(Color.BLACK);

                    _14.setBackgroundColor(Color.BLACK);
                    _34.setBackgroundColor(Color.BLACK);

                    _15.setBackgroundColor(Color.RED);
                    _35.setBackgroundColor(Color.BLACK);
                }else if (selectedItem.equals("Shape 2 - Major")) {
                    _10.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.BLACK);

                    _11.setBackgroundColor(Color.BLACK);
                    _31.setBackgroundColor(Color.BLACK);

                    _12.setBackgroundColor(Color.RED);
                    _32.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.BLACK);
                    _33.setBackgroundColor(Color.BLACK);

                    _14.setBackgroundColor(Color.BLACK);
                    _44.setBackgroundColor(Color.RED);

                    _15.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.BLACK);
                }else if (selectedItem.equals("Shape 3 - Major")) {
                    _00.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.BLACK);

                    _01.setBackgroundColor(Color.BLACK);
                    _31.setBackgroundColor(Color.RED);

                    _02.setBackgroundColor(Color.BLACK);
                    _22.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.BLACK);
                    _23.setBackgroundColor(Color.BLACK);

                    _14.setBackgroundColor(Color.RED);
                    _34.setBackgroundColor(Color.BLACK);

                    _05.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.BLACK);
                }else if (selectedItem.equals("Shape 4 - Major")) {
                    _10.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.BLACK);

                    _11.setBackgroundColor(Color.RED);
                    _31.setBackgroundColor(Color.BLACK);

                    _02.setBackgroundColor(Color.BLACK);
                    _32.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.BLACK);
                    _33.setBackgroundColor(Color.RED);

                    _14.setBackgroundColor(Color.BLACK);
                    _34.setBackgroundColor(Color.BLACK);

                    _15.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.BLACK);
                }else if (selectedItem.equals("Shape 5 - Major")) {
                    _00.setBackgroundColor(Color.BLACK);
                    _30.setBackgroundColor(Color.RED);

                    _01.setBackgroundColor(Color.BLACK);
                    _21.setBackgroundColor(Color.BLACK);

                    _02.setBackgroundColor(Color.BLACK);
                    _22.setBackgroundColor(Color.BLACK);

                    _03.setBackgroundColor(Color.RED);
                    _23.setBackgroundColor(Color.BLACK);

                    _04.setBackgroundColor(Color.BLACK);
                    _34.setBackgroundColor(Color.BLACK);

                    _05.setBackgroundColor(Color.BLACK);
                    _35.setBackgroundColor(Color.RED);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });


    }

    @Override
    public void onClick(View v) {
        ColorDrawable BG = (ColorDrawable) v.getBackground();
        int color = BG.getColor();
        colorCheck(v, color);
    }

    public void colorCheck(View v, int colorID) {
        if (colorID == Color.BLACK) {
            v.setBackgroundColor(Color.RED);
        }else if (colorID == Color.RED) {
            v.setBackgroundColor(Color.BLUE);
        }else if (colorID == Color.BLUE) {
            v.setBackgroundColor(Color.TRANSPARENT);
        }else{
            v.setBackgroundColor(Color.BLACK);
        }
    }

    public void disableButtons(View v) {
        Button _00 = (Button) findViewById(R.id.b00);
        _00.setClickable(false);
        Button _10 = (Button) findViewById(R.id.b10);
        _10.setClickable(false);
        Button _20 = (Button) findViewById(R.id.b20);
        _20.setClickable(false);
        Button _30 = (Button) findViewById(R.id.b30);
        _30.setClickable(false);
        Button _40 = (Button) findViewById(R.id.b40);
        _40.setClickable(false);
        Button _01 = (Button) findViewById(R.id.b01);
        _01.setClickable(false);
        Button _11 = (Button) findViewById(R.id.b11);
        _11.setClickable(false);
        Button _21 = (Button) findViewById(R.id.b21);
        _21.setClickable(false);
        Button _31 = (Button) findViewById(R.id.b31);
        _31.setClickable(false);
        Button _41 = (Button) findViewById(R.id.b41);
        _41.setClickable(false);
        Button _02 = (Button) findViewById(R.id.b02);
        _02.setClickable(false);
        Button _12 = (Button) findViewById(R.id.b12);
        _12.setClickable(false);
        Button _22 = (Button) findViewById(R.id.b22);
        _22.setClickable(false);
        Button _32 = (Button) findViewById(R.id.b32);
        _32.setClickable(false);
        Button _42 = (Button) findViewById(R.id.b42);
        _42.setClickable(false);
        Button _03 = (Button) findViewById(R.id.b03);
        _03.setClickable(false);
        Button _13 = (Button) findViewById(R.id.b13);
        _13.setClickable(false);
        Button _23 = (Button) findViewById(R.id.b23);
        _23.setClickable(false);
        Button _33 = (Button) findViewById(R.id.b33);
        _33.setClickable(false);
        Button _43 = (Button) findViewById(R.id.b43);
        _43.setClickable(false);
        Button _04 = (Button) findViewById(R.id.b04);
        _04.setClickable(false);
        Button _14 = (Button) findViewById(R.id.b14);
        _14.setClickable(false);
        Button _24 = (Button) findViewById(R.id.b24);
        _24.setClickable(false);
        Button _34 = (Button) findViewById(R.id.b34);
        _34.setClickable(false);
        Button _44 = (Button) findViewById(R.id.b44);
        _44.setClickable(false);
        Button _05 = (Button) findViewById(R.id.b05);
        _05.setClickable(false);
        Button _15 = (Button) findViewById(R.id.b15);
        _15.setClickable(false);
        Button _25 = (Button) findViewById(R.id.b25);
        _25.setClickable(false);
        Button _35 = (Button) findViewById(R.id.b35);
        _35.setClickable(false);
        Button _45 = (Button) findViewById(R.id.b45);
        _45.setClickable(false);
    }

    public void enableButtons(View v) {
        Button _00 = (Button) findViewById(R.id.b00);
        _00.setClickable(true);
        Button _10 = (Button) findViewById(R.id.b10);
        _10.setClickable(true);
        Button _20 = (Button) findViewById(R.id.b20);
        _20.setClickable(true);
        Button _30 = (Button) findViewById(R.id.b30);
        _30.setClickable(true);
        Button _40 = (Button) findViewById(R.id.b40);
        _40.setClickable(true);
        Button _01 = (Button) findViewById(R.id.b01);
        _01.setClickable(true);
        Button _11 = (Button) findViewById(R.id.b11);
        _11.setClickable(true);
        Button _21 = (Button) findViewById(R.id.b21);
        _21.setClickable(true);
        Button _31 = (Button) findViewById(R.id.b31);
        _31.setClickable(true);
        Button _41 = (Button) findViewById(R.id.b41);
        _41.setClickable(true);
        Button _02 = (Button) findViewById(R.id.b02);
        _02.setClickable(true);
        Button _12 = (Button) findViewById(R.id.b12);
        _12.setClickable(true);
        Button _22 = (Button) findViewById(R.id.b22);
        _22.setClickable(true);
        Button _32 = (Button) findViewById(R.id.b32);
        _32.setClickable(true);
        Button _42 = (Button) findViewById(R.id.b42);
        _42.setClickable(true);
        Button _03 = (Button) findViewById(R.id.b03);
        _03.setClickable(true);
        Button _13 = (Button) findViewById(R.id.b13);
        _13.setClickable(true);
        Button _23 = (Button) findViewById(R.id.b23);
        _23.setClickable(true);
        Button _33 = (Button) findViewById(R.id.b33);
        _33.setClickable(true);
        Button _43 = (Button) findViewById(R.id.b43);
        _43.setClickable(true);
        Button _04 = (Button) findViewById(R.id.b04);
        _04.setClickable(true);
        Button _14 = (Button) findViewById(R.id.b14);
        _14.setClickable(true);
        Button _24 = (Button) findViewById(R.id.b24);
        _24.setClickable(true);
        Button _34 = (Button) findViewById(R.id.b34);
        _34.setClickable(true);
        Button _44 = (Button) findViewById(R.id.b44);
        _44.setClickable(true);
        Button _05 = (Button) findViewById(R.id.b05);
        _05.setClickable(true);
        Button _15 = (Button) findViewById(R.id.b15);
        _15.setClickable(true);
        Button _25 = (Button) findViewById(R.id.b25);
        _25.setClickable(true);
        Button _35 = (Button) findViewById(R.id.b35);
        _35.setClickable(true);
        Button _45 = (Button) findViewById(R.id.b45);
        _45.setClickable(true);
    }

    public void clear(View v) {
        Button _00 = (Button) findViewById(R.id.b00);
        _00.setBackgroundColor(Color.TRANSPARENT);
        Button _10 = (Button) findViewById(R.id.b10);
        _10.setBackgroundColor(Color.TRANSPARENT);
        Button _20 = (Button) findViewById(R.id.b20);
        _20.setBackgroundColor(Color.TRANSPARENT);
        Button _30 = (Button) findViewById(R.id.b30);
        _30.setBackgroundColor(Color.TRANSPARENT);
        Button _40 = (Button) findViewById(R.id.b40);
        _40.setBackgroundColor(Color.TRANSPARENT);
        Button _01 = (Button) findViewById(R.id.b01);
        _01.setBackgroundColor(Color.TRANSPARENT);
        Button _11 = (Button) findViewById(R.id.b11);
        _11.setBackgroundColor(Color.TRANSPARENT);
        Button _21 = (Button) findViewById(R.id.b21);
        _21.setBackgroundColor(Color.TRANSPARENT);
        Button _31 = (Button) findViewById(R.id.b31);
        _31.setBackgroundColor(Color.TRANSPARENT);
        Button _41 = (Button) findViewById(R.id.b41);
        _41.setBackgroundColor(Color.TRANSPARENT);
        Button _02 = (Button) findViewById(R.id.b02);
        _02.setBackgroundColor(Color.TRANSPARENT);
        Button _12 = (Button) findViewById(R.id.b12);
        _12.setBackgroundColor(Color.TRANSPARENT);
        Button _22 = (Button) findViewById(R.id.b22);
        _22.setBackgroundColor(Color.TRANSPARENT);
        Button _32 = (Button) findViewById(R.id.b32);
        _32.setBackgroundColor(Color.TRANSPARENT);
        Button _42 = (Button) findViewById(R.id.b42);
        _42.setBackgroundColor(Color.TRANSPARENT);
        Button _03 = (Button) findViewById(R.id.b03);
        _03.setBackgroundColor(Color.TRANSPARENT);
        Button _13 = (Button) findViewById(R.id.b13);
        _13.setBackgroundColor(Color.TRANSPARENT);
        Button _23 = (Button) findViewById(R.id.b23);
        _23.setBackgroundColor(Color.TRANSPARENT);
        Button _33 = (Button) findViewById(R.id.b33);
        _33.setBackgroundColor(Color.TRANSPARENT);
        Button _43 = (Button) findViewById(R.id.b43);
        _43.setBackgroundColor(Color.TRANSPARENT);
        Button _04 = (Button) findViewById(R.id.b04);
        _04.setBackgroundColor(Color.TRANSPARENT);
        Button _14 = (Button) findViewById(R.id.b14);
        _14.setBackgroundColor(Color.TRANSPARENT);
        Button _24 = (Button) findViewById(R.id.b24);
        _24.setBackgroundColor(Color.TRANSPARENT);
        Button _34 = (Button) findViewById(R.id.b34);
        _34.setBackgroundColor(Color.TRANSPARENT);
        Button _44 = (Button) findViewById(R.id.b44);
        _44.setBackgroundColor(Color.TRANSPARENT);
        Button _05 = (Button) findViewById(R.id.b05);
        _05.setBackgroundColor(Color.TRANSPARENT);
        Button _15 = (Button) findViewById(R.id.b15);
        _15.setBackgroundColor(Color.TRANSPARENT);
        Button _25 = (Button) findViewById(R.id.b25);
        _25.setBackgroundColor(Color.TRANSPARENT);
        Button _35 = (Button) findViewById(R.id.b35);
        _35.setBackgroundColor(Color.TRANSPARENT);
        Button _45 = (Button) findViewById(R.id.b45);
        _45.setBackgroundColor(Color.TRANSPARENT);
    }

}


