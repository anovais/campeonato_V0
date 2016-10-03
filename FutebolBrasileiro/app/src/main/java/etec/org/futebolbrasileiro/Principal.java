package etec.org.futebolbrasileiro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Principal extends AppCompatActivity {


    private List<TimeFutebol> listaDeTimesFutebol = new ArrayList<TimeFutebol>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    public void atualizaLista(){
        ListView componenteLista = (ListView) findViewById(R.id.lista);
        ArrayAdapter<TimeFutebol> adaptador =
                new ArrayAdapter<TimeFutebol>(this,android.R.layout.simple_list_item_1, listaDeTimesFutebol);
        componenteLista.setAdapter(adaptador);
    }

    public void adicionaTime(View v){
        EditText campoTime = (EditText) findViewById(R.id.txt_time);
        TimeFutebol time = new TimeFutebol(campoTime.getText().toString());
        listaDeTimesFutebol.add(time);
        atualizaLista();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_ordenacao,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if( item.getItemId() == R.id.ordem_alfabetica ){
            Toast.makeText(Principal.this, "Ordenar Times em Ordem Alfabética", Toast.LENGTH_SHORT).show();
        }else if( item.getItemId() == R.id.ordem_classificacao ) {
            Toast.makeText(Principal.this, "Exibir Classificação do Campeonato", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
