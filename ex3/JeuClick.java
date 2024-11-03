package iset.dsi.tp2exercice1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JeuClick extends AppCompatActivity {
Button btn1 ,btn2;
TextView niveau,score;
int sc=0,niv=1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu_click);
       btn1=findViewById(R.id.btn1);
       btn2=findViewById(R.id.btn2);
       niveau=findViewById(R.id.niveau);
       score=findViewById(R.id.score);
       score.setText("Score :"+sc);
       niveau.setText("Niveau: "+niv);

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               sc++;
               score.setText("Score :"+sc);
               if(sc % 5==0){
                   niv++;
                   niveau.setText("Niveau: "+niv);
                   Toast toast = Toast.makeText(JeuClick.this,"passage au niveau suivant",Toast.LENGTH_LONG);
                   toast.show();
                   Intent intent =new Intent(JeuClick.this,LevelActivity.class);
                   intent.putExtra("niveau",niv);
                   startActivity(intent);
               }
           }
       });

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               sc=0;
               niv=1;
               score.setText("Score :"+sc);
               niveau.setText("Niveau: "+niv);
           }
       });

    }
}