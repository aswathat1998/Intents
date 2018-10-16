package in.wizelab.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvReply = (TextView) findViewById(R.id.tv_response);
    }

    public void b1(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("b", 1);
        startActivity(i);
    }

    public void b2(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("b", 2);
        startActivity(i);
    }

    public void b3(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("b", 3);
        startActivity(i);
    }

    public void onActivityResult(int requestCode, int resultCode,
                                 Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String reply =
                        data.getStringExtra("b");
                tvReply.setText(reply);
                tvReply.setVisibility(View.VISIBLE);
            }

        }else{
            tvReply.setVisibility(View.INVISIBLE);

        }
    }
}
