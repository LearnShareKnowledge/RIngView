package com.mypackage.ringview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class CircleView extends View
{
    private float centerX,centerY,radius;

    private Paint paint = new Paint();


    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setCircleProperties(float cX , float cY , float radius)
    {
        this.centerX = cX;

        this.centerY = cY;

        this.radius = radius;
    }

    public void draw()
    {
        invalidate();

        requestLayout();
    }


    @Override
    protected void onDraw(Canvas canvas)
    {
        paint.setStrokeWidth(10);

        paint.setColor(Color.GREEN);

        canvas.drawCircle(centerX,centerY,radius,paint);

        super.onDraw(canvas);
    }
}
