package iset.dsi.tp2exercice1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ChooseColor extends AppCompatActivity {
    int btnR, btnJ, btnV, btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_color);

        btnR = R.id.btnR;
        btnB = R.id.btnB;
        btnV = R.id.btnV;
        btnJ = R.id.btnJ;
    }

    public void color(View v) {
        int color = Color.WHITE;
        if (v.getId() == btnR) {
            color = Color.RED;
        }
        else if (v.getId() == btnJ) {
            color = Color.YELLOW;
        }
        else if (v.getId() == btnV) {
            color = Color.GREEN;
        }
        else if (v.getId() == btnB) {
            color = Color.BLUE;
        }

        Intent intent = new Intent();
        intent.putExtra("colorSelected", color);
        setResult(RESULT_OK, intent);
        finish();
    }
}