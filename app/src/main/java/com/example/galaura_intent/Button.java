package com.example.galaura_intent;

public class Button {
    private MainActivity onClickListener;

    public void setOnClickListener(MainActivity onClickListener) {
        this.onClickListener = onClickListener;
    }

    public MainActivity getOnClickListener() {
        return onClickListener;
    }
}
