package activity.ctec.dataapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity
{

    private Button YesButton;
    private Button NoButton;
    private TextView right;
    private TextView wrong;
    private boolean answer;
    private EditText question;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        YesButton = (Button) findViewById(R.id.YesButton);
        NoButton = (Button) findViewById(R.id.NoButton);
        right = (TextView) findViewById(R.id.right);
        wrong = (TextView) findViewById(R.id.wrong);
        question = (EditText) findViewById(R.id.question);
        right.setVisibility(View.INVISIBLE);
        wrong.setVisibility(View.INVISIBLE);

        setupListeners();
    }

    private void trueYes()
    {
        answer = true;
        if(answer == true)
        {
            right.setVisibility(View.VISIBLE);
            wrong.setVisibility(View.INVISIBLE);
        }
        else
        {
            right.setVisibility(View.INVISIBLE);
            wrong.setVisibility(View.VISIBLE);
        }
    }

    private void falseNo()
    {
        answer = true;
        if(answer == true)
        {
            right.setVisibility(View.INVISIBLE);
            wrong.setVisibility(View.VISIBLE);
        }
        else
        {
            right.setVisibility(View.VISIBLE);
            wrong.setVisibility(View.INVISIBLE);
        }
    }
    private void setupListeners()
    {
        YesButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonClickView)
            {
                trueYes();
            }
        });
        NoButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonClickView)
            {
                falseNo();
            }
        });
    }
}

