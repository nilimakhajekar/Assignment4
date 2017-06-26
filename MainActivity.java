package com.example.kanchan.tictactoe;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.kanchan.tictactoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        /*b1= (Button) findViewById(R.id.b1);
        b2= (Button) findViewById(R.id.b2);
        b3= (Button) findViewById(R.id.b3);
        b4= (Button) findViewById(R.id.b4);
        b5= (Button) findViewById(R.id.b5);
        b6= (Button) findViewById(R.id.b6);
        b7= (Button) findViewById(R.id.b7);
        b8= (Button) findViewById(R.id.b8);
        b9= (Button) findViewById(R.id.b9);
*/
         turn=1;
       binding.b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(b1.getText().toString().equals("")){
                   if(turn==1){
                       turn=2;
                       b1.setText("X");
                   }else if (turn==2){
                       turn=1;
                       b1.setText("O");
                   }

               }
             endGame();

           }
       });

        binding.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b2.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b2.setText("O");
                    }

                }
                endGame();

            }
        });

        binding.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b3.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b3.setText("O");
                    }

                }
               endGame();

            }
        });

        binding.b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b4.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b4.setText("O");
                    }

                }
                endGame();

            }
        });
        binding.b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b5.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b5.setText("O");
                    }

                }
               endGame();


            }
        });
        binding.b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b6.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b6.setText("O");
                    }

                }
               endGame();

            }
        });
        binding.b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b7.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b7.setText("O");
                    }

                }
               endGame();

            }
        });
        binding.b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b8.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b8.setText("O");
                    }

                }
               endGame();

            }
        });
        binding.b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b9.setText("X");
                    }else if (turn==2){
                        turn=1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });

    }

    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if ((a.equals(b)&& b.equals(c)&&c.equals("X"))||(a.equals(e)&& e.equals(i)&& i.equals("X"))||(d.equals(e)&& e.equals(f)&& f.equals("X"))||(g.equals(h)&& h.equals(i)&& i.equals("X"))||(g.equals(e)&& e.equals(c)&& c.equals("X")))
        {
            Toast.makeText(MainActivity.this, "X is winnwe", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if (a.equals(b)&& b.equals(c)&&c.equals("O")||(a.equals(e)&& e.equals(i)&& i.equals("O"))||(d.equals(e)&& e.equals(f)&& f.equals("O"))||(g.equals(h)&& h.equals(i)&& i.equals("O"))||(g.equals(e)&& e.equals(c)&& c.equals("O")))
        {
            Toast.makeText(MainActivity.this, "O is winnwe", Toast.LENGTH_SHORT).show();
            end=true;
        }

    if (end) {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

    }}
}
