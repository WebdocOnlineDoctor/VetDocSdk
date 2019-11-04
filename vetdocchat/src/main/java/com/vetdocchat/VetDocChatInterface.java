package com.vetdocchat;

import java.util.List;

/**
 * Created by WaleedPCC on 10/22/2019.
 */

public interface VetDocChatInterface {

    public void getMessagesResponse(List<MessageDataModel> msgList);

    public void onUserStatusChangedResponse(String response);

    public void onChangeUserStatusResponse(String status, String lastSeen);

    public void onMessageSentResponse(String Response);



}
