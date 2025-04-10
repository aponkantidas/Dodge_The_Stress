package com.example.dts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Spike {
    Bitmap spike;
    int spikeType;
    int spikeX,spikeY,spikeVelocity;
    Random random;

    public Spike(Context context){
        Bitmap spike0= BitmapFactory.decodeResource(context.getResources(),R.drawable.spike0);
        Bitmap spike1= BitmapFactory.decodeResource(context.getResources(),R.drawable.spike1);
        Bitmap spike2= BitmapFactory.decodeResource(context.getResources(),R.drawable.spike2);

        random = new Random();

        int spikeType = random.nextInt(3);
        switch (spikeType) {
            case 0:
                spike = spike0;
                break;
            case 1:
                spike = spike1;
                break;
            case 2:
                spike = spike2;
                break;
        }
        resetPosition();
    }
    public  Bitmap getSpike(){
        return  spike;
    }
    public int getSpikeWidth(){
        return spike.getWidth();
    }
    public int getSpikeHeight(){
        return spike.getHeight();
    }
    public void resetPosition(){
        spikeX=random.nextInt(GameView.dWidth - getSpikeWidth());
        spikeY= -200 + random.nextInt(600) * -1;
        spikeVelocity= 35+random.nextInt(16);
    }
}
