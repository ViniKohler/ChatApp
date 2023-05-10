package com.vkohler.chatapp.listeners;

import com.vkohler.chatapp.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
