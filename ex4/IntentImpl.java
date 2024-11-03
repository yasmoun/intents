package iset.dsi.tp2exercice1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntentImpl extends AppCompatActivity {
Button btn1 ,btn2, btn3, btn4 ,btn5;
EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_impl);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        txt=findViewById(R.id.editText1);}
        public void call(View v){
            if(txt.getText().toString().isEmpty()){
                Toast toast= Toast.makeText(IntentImpl.this,"champs vide",Toast.LENGTH_LONG);
                toast.show();
            }
            else{
                String phone =txt.getText().toString();
                Intent intent =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
                startActivity(intent);
            }
        }
        public void phone(View v){
                Intent intent =new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }

        public void site(View v){
            if(txt.getText().toString().isEmpty()){
                Toast toast= Toast.makeText(IntentImpl.this,"champs vide",Toast.LENGTH_LONG);
                toast.show();
            }
            else{
                String st =txt.getText().toString().trim();
                if (!st.startsWith("http://") && !st.startsWith("https://")) {
                    st = "http://" + st;
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(st));
                startActivity(intent);
            }
        }

        public void appManager(View v){
            Intent intent = new Intent(Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS);
            startActivity(intent);
        }

        public void wifiManager(View v){
            Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
            startActivity(intent);
        }


}