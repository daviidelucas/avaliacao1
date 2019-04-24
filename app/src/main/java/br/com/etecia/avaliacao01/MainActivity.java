package br.com.etecia.avaliacao01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                TextView num = findViewById(R.id.num);
                TextView resultado = findViewById(R.id.txtResult);
                String num2 = num.getText().toString();
                int num1 = Integer.parseInt(num2);
                int result = num1 * 7;

                resultado.setText("A idade do seu cachorro é: "+result);


               }

        });

    }


}
