package com.example.yang_chen.activitytest;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =new AlertDialog.Builder(FirstActivity.this);
                View view1 =View.inflate(FirstActivity.this,R.layout.login_dialog,null);
                final EditText user =(EditText)view1.findViewById(R.id.editTextUserId);
                final EditText passwd =(EditText)view1.findViewById(R.id.editTextPwd);
                Button btlogin =(Button)view1.findViewById(R.id.button3) ;
                btlogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(user.getText().toString().equals("abc")&&passwd.getText().toString().equals("123")){
                            Toast.makeText(FirstActivity.this,"成功",Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(FirstActivity.this,"失败",Toast.LENGTH_LONG).show();
                        }
                    }
                });


                builder.setView(view1);
                builder.show();
              /*  AlertDialog.Builder bulid =new AlertDialog.Builder(FirstActivity.this);

                LayoutInflater inflater=getLayoutInflater();
                bulid.setView(inflater.inflate(R.layout.login_dialog,null))
                        .setTitle("login")
                       .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                EditText user=(EditText)findViewById(R.id.editTextUserId);
                                EditText passwd=(EditText)findViewById(R.id.editTextPwd);



                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
            bulid.show();*/
            }
        });
    }
}









