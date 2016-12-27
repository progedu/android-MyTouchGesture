package com.example.mytouchgesture;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;


public class MyCustomView extends View {

    private RectF mBounds;
    private Paint mPaint;

    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mBounds = new RectF(0,0, 300, 400);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(
                mBounds,
                mPaint
        );
    }
}