package com.vetdocsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.vetdocchat.MessageDataModel;
import com.vetdocchat.VetDocChat;
import com.vetdocchat.VetDocChatInterface;
import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity  implements VetDocChatInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        DatabaseReference dbReference;

        //VetDocChat.getMessage(this, "SupportChatApp", "waleed@supportchatappcom", "drkhalid@vetdoctorcompk");

        /* Checking status of other user */

        //VetDocChat.checkStatus("VetDoc", "drzain@vetdoctorcompk");

        /*VetDocChat vetDocChat = new VetDocChat();

        vetDocChat.sendMessage("vetDoctor", "Test Meesage", "waleed", "saif", "text");*/

        /*List<MessageDataModel> msgs = new ArrayList<>();

        Toast.makeText(this, VetDocChat.getMessage("SupportChatApp", "waleed@supportchatappcom", "drkhalid@vetdoctorcompk").toString(), Toast.LENGTH_SHORT).show();

        msgs = VetDocChat.getMessage("SupportChatApp", "waleed@supportchatappcom", "drkhalid@vetdoctorcompk");*/

        //Toast.makeText(ChatActivity.this, msgs.toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        //VetDocChat.changeStatus("SupportChatApp", "waleed@supportchatappcom", "online");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //VetDocChat.changeStatus("SupportChatApp", "waleed@supportchatappcom", "offline");
    }

    @Override
    public void getMessagesResponse(List<MessageDataModel> msgList) {
        Toast.makeText(ChatActivity.this, msgList.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onUserStatusChangedResponse(String response) {
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onChangeUserStatusResponse(String status, String lastSeen) {
        Toast.makeText(this, status+"----"+lastSeen, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onMessageSentResponse(String Response) {
    }
}
