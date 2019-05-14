package com.example.finalproject.activity.controler;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.finalproject.R;
import com.example.finalproject.activity.model.Message;

import java.util.List;

public class MessageRecyclerAdapter extends RecyclerView.Adapter<MessageRecyclerAdapter.MessageVH> {

    private List<Message> messageList;

    public MessageRecyclerAdapter(List<Message> messageList) {
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MessageVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_message, viewGroup, false);
        return new MessageVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageVH messageVH, int i) {
        Message message = messageList.get(i);

        messageVH.topicMessage.setText(message.getTopic());
        messageVH.descriptionMessage.setText(message.getDescription());
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    class MessageVH extends RecyclerView.ViewHolder{

        private TextView topicMessage;
        private TextView descriptionMessage;
        private CardView cardMessage;

        public MessageVH(@NonNull View itemView) {
            super(itemView);

            topicMessage = itemView.findViewById(R.id.topicMessage);
            descriptionMessage = itemView.findViewById(R.id.descriptionMessage);
            cardMessage = itemView.findViewById(R.id.cardMessage);
        }
    }
}
