package com.plates.mercosul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.plates.mercosul.plate.NewPlate;
import com.plates.mercosul.plate.OldPlate;
import java.io.IOException;
import org.cactoos.text.TextOf;

public class MercosulPlates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercosul_plates);
    }

    public void convert(View view) throws IOException {
        TextView text= (TextView) findViewById(R.id.new_plate_label);
        text.setText(
            new NewPlate(
                new OldPlate(
                    new TextOf(
                        ((EditText)findViewById(R.id.old_plate_text)).getText()
                    ).asString()
                )
            ).asString()
        );
        ((ImageView)findViewById(R.id.plate_bg)).setVisibility(View.VISIBLE);
        text.setVisibility(View.VISIBLE);
    }
}
