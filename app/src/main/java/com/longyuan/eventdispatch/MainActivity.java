package com.longyuan.eventdispatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

    private RTButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (RTButton)this.findViewById(R.id.btn);
        button.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        System.out.println("RTButton---onTouch---DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        System.out.println("RTButton---onTouch---MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        System.out.println("RTButton---onTouch---UP");
                        break;
                    default:
                        break;
                }
                return false;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("RTButton clicked!");
            }
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("Activity---dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("Activity---dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("Activity---dispatchTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("Activity---onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("Activity---onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("Activity---onTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }
}
