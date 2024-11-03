package iset.dsi.tp2exercice1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExIntent extends AppCompatActivity {
EditText nom ,age ,site,phone;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_intent);
    nom =findViewById(R.id.nom);
    age=findViewById(R.id.age);
    site=findViewById(R.id.site);
    phone=findViewById(R.id.phone);
    btn=findViewById(R.id.btn);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        boolean valid = true;

        if (nom.getText().toString().isEmpty()) {
            nom.setBackgroundColor(Color.RED);
            valid = false;
        } else {
            nom.setBackgroundColor(Color.GREEN);
        }

        if (age.getText().toString().isEmpty()) {
            age.setBackgroundColor(Color.RED);
            valid = false;
        } else {
            age.setBackgroundColor(Color.GREEN);
        }

        if (site.getText().toString().isEmpty()) {
            site.setBackgroundColor(Color.RED);
            valid = false;
        } else {
            site.setBackgroundColor(Color.GREEN);
        }

        if (phone.getText().toString().isEmpty()) {
            phone.setBackgroundColor(Color.RED);
            valid = false;
        } else {
            phone.setBackgroundColor(Color.GREEN);
        }

        if (valid) {
            Intent intent = new Intent(ExIntent.this, AffichageUtilisateur.class);
            intent.putExtra("name", nom.getText().toString().trim());
            intent.putExtra("age", age.getText().toString());
            intent.putExtra("site", site.getText().toString().trim());
            intent.putExtra("phone", phone.getText().toString());
            startActivity(intent);
        }
    }
});

    }

}