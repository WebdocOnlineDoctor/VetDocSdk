package com.vetdocchat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;

import java.util.HashMap;

/**
 * Created by WaleedPCC on 10/19/2019.
 */

public class VetDocChat
{


    /*public static DatabaseReference chatReference;

    public VetDocChat()
    {
        chatReference = FirebaseDatabase.getInstance().getReference();
    }*/

    public static String sendMessage(String appName, String msg, String sender, String receiver, String msgType  )
    {
        DatabaseReference chatReference = FirebaseDatabase.getInstance().getReference();
        String messageID = chatReference.push().getKey();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("message", msg);
        hashMap.put("sender",sender);
        hashMap.put("receiver", receiver);
        hashMap.put("timestamp", ServerValue.TIMESTAMP);
        hashMap.put("messageID", messageID);
        hashMap.put("type", msgType);
        hashMap.put("MessageStatus", "sent");
        HashMap<String, Object> chat_hashMap = new HashMap<String, Object>();
        chat_hashMap.put("chat", "true");
        chatReference.child("Chat").child(receiver).child(appName).child(sender).updateChildren(chat_hashMap);
        if(appName.equalsIgnoreCase("vetDoctor")) {
            chatReference.child("Messages").child(appName).child(sender+ "_" +receiver).child(messageID).updateChildren(hashMap);
        }
        else {
            chatReference.child("Messages").child(appName).child(receiver+ "_" +sender).child(messageID).updateChildren(hashMap);
        }

        return "";
    }

    public static String getMessage()
    {
        return "";
    }

    public static String changeStatus()
    {
        return "";
    }

    public static String checkStatus()
    {
        return "";
    }
}
