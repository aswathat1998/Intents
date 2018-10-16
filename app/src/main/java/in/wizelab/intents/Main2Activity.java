package in.wizelab.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvPassage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvPassage=(TextView)findViewById(R.id.tv_passage);
        Intent i =getIntent();
        String s="";
        switch(i.getIntExtra("b",0)){
            case 1:
                s="B1 clicked";
                break;
            case 2:
                s="B2 Clicked";
                break;
            case 3:
                s="B3 Clicked";
        }
        tvPassage.setText(s);
    }

    public void returnReply(View view) {
        Intent replyIntent = new Intent();
        replyIntent.putExtra("b", "Reply from second Activity");
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
