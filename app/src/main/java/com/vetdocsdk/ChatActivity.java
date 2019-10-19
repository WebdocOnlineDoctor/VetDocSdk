package com.vetdocsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vetdocchat.VetDocChat;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


        VetDocChat.sendMessage();
    }
}
