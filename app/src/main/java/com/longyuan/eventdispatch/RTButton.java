package com.longyuan.eventdispatch;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by loxu on 28/09/2017.
 */

public class RTButton extends Button {

    public RTButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("RTButton---dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("RTButton---dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("RTButton---dispatchTouchEvent---UP");
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
                System.out.println("RTButton---onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("RTButton---onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("RTButton---onTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }


}
