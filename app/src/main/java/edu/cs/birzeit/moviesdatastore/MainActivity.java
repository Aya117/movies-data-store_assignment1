package edu.cs.birzeit.moviesdatastore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import edu.cs.birzeit.moviesdatastore.model.movies;
import edu.cs.birzeit.moviesdatastore.model.IMoviesDA;
import edu.cs.birzeit.moviesdatastore.model.MoviesFactor;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Spinner spinner1;
    private Spinner spinner2;
    private TextView txtshowMessage;
    private TextView txtshowMessage1;
    private TextView txtshowMessage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        txtshowMessage=findViewById(R.id.txtshowMessage);
        txtshowMessage1=findViewById(R.id.txtshowMessage1);
        txtshowMessage2=findViewById(R.id.txtshowMessage2);
        populateSpinner();
    }

    private void populateSpinner() {

        MoviesFactor factor= new MoviesFactor();
        IMoviesDA obj= factor.getModel();

        String [] gen =obj.getgen();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this
                ,android.R.layout.simple_spinner_item,gen);
        spinner.setAdapter(adapter);

        String [] com =obj.getcom();
        ArrayAdapter<String> adapter1= new ArrayAdapter<>(this
                ,android.R.layout.simple_spinner_item,com);
        spinner1.setAdapter(adapter1);

        String [] tit =obj.gettit();
        ArrayAdapter<String> adapter2= new ArrayAdapter<>(this
                ,android.R.layout.simple_spinner_item,tit);
        spinner2.setAdapter(adapter2);


    }

    public void btngenOnClick(View view) {
        MoviesFactor factor = new MoviesFactor();
        IMoviesDA obj = factor.getModel();
            String item = "";
            item = spinner.getSelectedItem().toString();
            List<movies> movie = obj.getMovies(item);
            String str = "";
            for (movies M : movie)
                str += "Title==>" + M.getTitle() + ", Year==>:" + M.getYear() + "\n";
            txtshowMessage.setText(str);

        }
        public void btncomOnClick(View view) {
            MoviesFactor factor1 = new MoviesFactor();
            IMoviesDA obj1 = factor1.getModel();
            String item1 = "";
            item1 = spinner1.getSelectedItem().toString();
            List<movies> movie1 = obj1.getMovie(item1);
            String str1 = "";
            for (movies M : movie1)
                str1 += "Title==>" + M.getTitle() + ", genre==>:" + M.getGenre() + "\n";
            txtshowMessage1.setText(str1);
        }
    public void btntitOnClick(View view) {
            MoviesFactor factor2 = new MoviesFactor();
            IMoviesDA obj2 = factor2.getModel();
            String item2 = "";
            item2 = spinner2.getSelectedItem().toString();
            List<movies> movie2 = obj2.getmov(item2);
            String str2 = "";
            for (movies M : movie2)
                str2 += "Year==>" + M.getYear() + ", genre==>:" + M.getTitle() + "\n";
            txtshowMessage2.setText(str2);
        }
}