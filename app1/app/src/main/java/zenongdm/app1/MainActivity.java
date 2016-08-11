package zenongdm.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.N);
        Button calc = (Button) findViewById(R.id.Fa);
        final TextView result = (TextView) findViewById(R.id.resul);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(input.getText().toString());
                int i=1,aux=1;

                while(i<=n){
                    aux=aux*i;
                    i++;
                }

                result.setText(""+aux);
            }
        });

    }
}