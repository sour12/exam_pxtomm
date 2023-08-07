package com.exam_pxtomm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

public class RectDraw extends View {
    Context mContext;

    public RectDraw(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /*
         * 1px / mm = 1pxtomm
         * mm = 1px / 1pxtomm
         */
        float length = (1 / pxToMM(1, mContext)) * 20;  // 20mm

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawRect(100, 100, 100 + length, 100 + length, paint);
    }

    public float pxToMM(final float px, final Context context) {
        final DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return px / TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_MM, 1, dm);
    }
}
