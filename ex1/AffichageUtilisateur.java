package iset.dsi.tp2exercice1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AffichageUtilisateur extends AppCompatActivity {
TextView nomU, ageU, siteU, phoneU;
Button btn1 , btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_utilisateur);
        nomU=findViewById(R.id.textView2);
        ageU=findViewById(R.id.textView4);
        siteU=findViewById(R.id.textView6);
        phoneU=findViewById(R.id.textView8);

        btn1=findViewById(R.id.ok);
        btn2=findViewById(R.id.retour);

        Intent intent=new Intent();
        String nom=getIntent().getStringExtra("name");
        String age=getIntent().getStringExtra("age");
        String site=getIntent().getStringExtra("site");
        String phone=getIntent().getStringExtra("phone");
        nomU.setText(nom);
        ageU.setText(age);
        siteU.setText(site);
        phoneU.setText(phone);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AffichageUtilisateur.this,actvt3.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}