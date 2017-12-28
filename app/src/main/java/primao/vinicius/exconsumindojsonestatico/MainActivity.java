package primao.vinicius.exconsumindojsonestatico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //JSON ESTATICO CLIENTE
        String jsonCliente = "{cliente:{\"id\":\"1\",\"nome\":\"Vinícius Primão\",\"RG\":\"1234567891\",\"email\":\"thiagocury@gmail.com\"}}";

        Gson gson = new Gson();
        APICliente cli = gson.fromJson(jsonCliente, APICliente.class);

        Toast.makeText(
                getBaseContext(),
                "JSON CONSUMIDO COM GSON: "+cli.getCliente().toString(),
                Toast.LENGTH_LONG).show();

    }//fecha oncreate
}//fecha classe
