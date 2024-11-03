package iset.dsi.tp2exercice1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BackColorApp extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_color_app);
    txt =findViewById(R.id.textView2);
    }
    public void changerCl(View view){
        Intent intent =new Intent(this ,ChooseColor.class);
        startActivityForResult(intent,20);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==20){
            if(resultCode==RESULT_OK){
                int color=data.getIntExtra("colorSelected",-1);
                txt.setBackgroundColor(color);
            }
        }
    }
}