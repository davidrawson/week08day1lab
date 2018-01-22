package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText textBlock;
    Button countButton;
    TextView wordCountView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        textBlock = findViewById(R.id.editText);
        countButton = findViewById(R.id.button);
        wordCountView = findViewById(R.id.textView);
    }

    public void onCountButtonClicked(View button){
        String text = textBlock.getText().toString();
//        Log.d(getClass().toString(), "The text entered was " + text);
        wordCountView.setText(new WordCounter().countWords(text));
    }

}
